package Q_Vision.SeleniumCapacitacion;

import static org.junit.Assert.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Alert;

public class RegisterTest extends PageFactory {

	WebDriver driver = null;
	
	
	@Before
	public void cargaInicial() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/QV-3578/eclipse-workspace/SeleniumCapacitacion/src/test/java/driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://sahitest.com/demo/training/login.htm");	

		WebElement buttonRegister = driver.findElement(By.xpath("//*[contains(text(),'Register')]"));
		buttonRegister.click();
	}

	@Test
	public void test() throws InterruptedException {

		String mensaje;

		Thread.sleep(1000);

		WebElement registrarNombre = driver.findElement(By.name("username"));
		registrarNombre.sendKeys("Juan Esteban");

		// Registrar password

		WebElement registrarPassword = driver.findElement(By.name("password"));
		registrarPassword.sendKeys("Varios2017");

		// Registrar la repeticion del password

		WebElement registrarPassword2 = driver.findElement(By.name("password2"));
		registrarPassword2.sendKeys("Varios2017");

		// Seleccionar Gender

		WebElement selectGender = driver
				.findElement(By.xpath("/html/body/center/div/form/div/table/tbody/tr[4]/td[2]/input[1]"));
		selectGender.click();

		// Registrar Address

		WebElement registrarAddress = driver.findElement(By.name("address"));
		registrarAddress.sendKeys("Calle 11 46 39");

		// Registrar Billing Address

		WebElement registrarAddressBull = driver.findElement(By.name("billaddress"));
		registrarAddressBull.sendKeys("Calle 45 B");
		// Seleccionar estado

		Select selectState = new Select(driver.findElement(By.name("state")));
		selectState.selectByVisibleText("Kerala");

		// Seleccionar Los terminos

		WebElement seTerminos = driver.findElement(By.name("agree"));
		seTerminos.click();
		


		WebElement btnRegister = driver.findElement(By.xpath("//*[@value='Register']"));
		btnRegister.click();

		// Alerta
		
		 driver.switchTo().alert(); Alert alert = driver.switchTo().alert(); mensaje =
		 alert.getText(); Assert.assertEquals("Registered Successfully", mensaje);		
		
	}

	@After

	public void cerrar() {
//		driver.close();
	}

}
