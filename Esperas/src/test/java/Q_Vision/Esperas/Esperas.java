package Q_Vision.Esperas;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Esperas {
	
	WebDriver driver = null;
	
	@Before
	public void abrirUrl() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/QV-3578/eclipse-workspace/SeleniumCapacitacion/src/test/java/driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}

	@Test
	public void test() {
		
		String mensaje;
		
		WebElement searchBox = driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input"));
		searchBox.sendKeys("quality-stream Introducción a la Automatización de Pruebas de Software");
		
		
		
		searchBox.submit();
		//Implicit Wait
		//driver.manage().timeouts().implicitlyWait(60000, TimeUnit.SECONDS);
		//Explicit Wait
		WebDriverWait ewait = new WebDriverWait(driver, 10);
		ewait.until(ExpectedConditions.titleContains("quality-stream"));
		assertEquals("quality-stream Introducción a la Automatización de Pruebas de Software - Buscar con Google", driver.getTitle());
		
//		Wait<WebDriver> fwait = new FluentWait<WebDriver>(driver)
//				.withTimeout(10, TimeUnit.SECONDS).pollingEvery(2, TimeUnit.SECONDS)
//				.ignoring(java.util.NoSuchElementException.class);	
//		WebElement sele = fwait
//				.until(new Function<WebDriver, WebElement>() {
//					public WebElement apply(WebDriver driver) {
//						return driver.findElement(By.xpath("varios"));
//					}
//				});
		
	
	}
		
	@After
	public void cerrarUrl() {
//		driver.close();
	}
	
}
