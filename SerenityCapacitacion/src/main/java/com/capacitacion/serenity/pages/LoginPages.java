package com.capacitacion.serenity.pages;

import org.hamcrest.MatcherAssert;
import org.openqa.selenium.WebDriver;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://sahitest.com/demo/training/login.htm")
public class LoginPages extends PageObject {

	@FindBy(name = "user")
	private WebElementFacade txtUser;
	
	@FindBy(name = "password")
	private WebElementFacade password;
	
	@FindBy(xpath = "/html/body/center/div/form/table/tbody/tr[3]/td[2]/input")
	private WebElementFacade btnLogin;
	

	@FindBy(xpath = "//*[@id=\"available\"]/h2")
	private WebElementFacade lblmessagge;
	
	public LoginPages(WebDriver driver) {
		
		super(driver);
	}
	
	public void login() {
		txtUser.sendKeys("test");
		password.sendKeys("secret");
		btnLogin.click();
	}
	
	public void validacion() {
		MatcherAssert.assertThat("No se inicio sesion", lblmessagge.isDisplayed());
	}
	
		
}
