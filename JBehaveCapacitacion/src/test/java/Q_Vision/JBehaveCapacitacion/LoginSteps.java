package Q_Vision.JBehaveCapacitacion;

import org.jbehave.core.annotations.AfterStories;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;


public class LoginSteps {
	

	
	public LoginSteps() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\QV-3578\\eclipse-workspace\\JBehaveCapacitacion\\chromedriver.exe");
		
	}
	WebDriver driver = new ChromeDriver();
	
	@Given("Que estoy en la aplicacion de libros")
	public void abrirUrl() {
		driver.get("http://sahitest.com/demo/training/login.htm");
	}
	
	@When("Inicio sesion en la aplicacion")
	public void iniciarSesion() {
		
		WebElement txtUser = driver.findElement(By.name("user"));
		txtUser.sendKeys("test");

		WebElement passwordUser = driver.findElement(By.name("password"));
		passwordUser.sendKeys("secret");
		
		WebElement btnLogin = driver.findElement(By.xpath("/html/body/center/div/form/table/tbody/tr[3]/td[2]/input"));
		btnLogin.click();
	}
	
	@Then("puedo ingresar a comprar libros")
	public void comprarLibros() {
		
		WebElement librosJava = driver.findElement(By.xpath("//*[@id=\"listing\"]/tbody/tr[2]/td[4]/input"));
		librosJava.sendKeys("1");
		
		
		WebElement lblMessagge = driver.findElement(By.xpath("//*[@id=\"available\"]/h2"));
		Assert.assertTrue(lblMessagge.isDisplayed());
	}
	
	@AfterStories
	public void cerrarNavegador() {
//		driver.close();
	}
	

}