package co.com.google.translate.pages;

import junit.framework.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.server.handler.GetPageSource;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://translate.google.com")
public class HomePage extends PageObject {
	
	String mensaje;
	
	@FindBy(xpath ="//*[@id=\"sugg-item-en\"]")
	WebElementFacade lenguaje;
	
	@FindBy(xpath="//*[@id=\"source\"]")
	WebElementFacade sourceWord;
	
	@FindBy(xpath="/html/body/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div/span[1]/span")
	WebElementFacade wordTraductor;
	
	
	public HomePage(WebDriver driver) {
	
		super(driver);
	}
	
	public void clickLenguaje() {
		
		lenguaje.click();
	}
	
	public void enterWord(String word) {
		
		sourceWord.sendKeys(word);
	}
	
	public void validar() {
		
		mensaje = wordTraductor.getText();
		System.out.println(mensaje);
		Assert.assertEquals("Queso", mensaje);
		System.out.println(getTitle());
		
		
		
	}
	
	
}
