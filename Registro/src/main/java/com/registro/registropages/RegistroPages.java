package com.registro.registropages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

import jxl.common.Assert;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://sahitest.com/demo/training/register.htm")
public class RegistroPages extends PageObject {
	
String mensaje;
	
	
	@FindBy(name = "username")
	private WebElementFacade name;
	
	@FindBy(name = "password")
	private WebElementFacade contraseña;
	
	@FindBy(name = "password2")
	private WebElementFacade password2;
	
	@FindBy(xpath = "/html/body/center/div/form/div/table/tbody/tr[4]/td[2]/input[1]")
	private WebElementFacade gender;
	
	@FindBy(name = "address")
	private WebElementFacade address;
	
	@FindBy(name = "billaddress")
	private WebElementFacade billaddress;
	
	@FindBy(name = "agree")
	private WebElementFacade conditions;
	
	@FindBy(xpath="/html/body/center/div/form/div/table/tbody/tr[7]/td[2]/select")
	private WebElementFacade select;
	
	
	@FindBy(xpath = "//*[@value='Register']")
	private WebElementFacade btonLogin;
		
		public RegistroPages(WebDriver driver) {
		
		super(driver);
			}
		
	public void ingresarDatos() throws InterruptedException {
			
			name.sendKeys("Juan");
			contraseña.sendKeys("2019**");
			password2.sendKeys("2019**");
			gender.click();
			address.sendKeys("11a-1134");
			billaddress.sendKeys("Dan Carton");
			conditions.click();
			select.selectByVisibleText("Kerala");
			btonLogin.click();
			

			
			Thread.sleep(1000);
			

			
		}
		public void validarAcceso() {
			 getDriver().switchTo().alert(); 
			 Alert alert = getDriver().switchTo().alert(); 
			 mensaje = alert.getText();
			 Assert.verify(mensaje.matches("Registered Successfully")); 
		
		
		}

}
