package com.buscarvuelo.pages;

import org.hamcrest.MatcherAssert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.makemytrip.com/")
public class SeleccionPages extends PageObject {
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[1]/label")
	private WebElementFacade from;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[2]/label")
	private WebElementFacade to;
	
	
	@FindBy(name="//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[5]/label/p[1]/span/span")
	private WebElementFacade traveler;
	
	@FindBy(xpath="<p class=\"code font30 blackText\"><span class=\"latoBlack\" data-cy=\"pickupTime\">3:00</span> <span class=\"font20\" data-cy=\"pickupTimeMeridiem\">AM</span></p>")
	private WebElementFacade hours;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/div/div[2]/p/a")
	private WebElementFacade search;
	
	
	
	public SeleccionPages (WebDriver driver) {
		super(driver);
	}
	
	public void ingresarDatos() throws InterruptedException {
		from.sendKeys("Mumbai");
		from.findElement(By.xpath("//*[@id=\"react-autowhatever-1-section-0-item-0\"]/div/div[1]")).click();
		Thread.sleep(2000);
//		to.click();
		to.sendKeys("Pune");
		to.findElement(By.xpath("//*[@id=\"react-autowhatever-1-section-0-item-0\"]/div/div[1]/p[1]")).click();
		
		Thread.sleep(5000);
	}
	
	public void validarAcceso()  {
		
		String titulo;
		titulo= getTitle();

	}

}