package co.com.google.translate.steps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.hamcrest.MatcherAssert;

import co.com.google.translate.pages.HomePage;
import jxl.common.Assert;
import net.thucydides.core.annotations.Step;

public class GoogleHomePage {
	
	HomePage homePage;
	
	@Step
	public void openGoogleTranslatePage() {
		homePage.open();
	}
	
	@Step
	public void enterTheWordToTranslate(String word) {
		homePage.clickLenguaje();
		homePage.enterWord(word);
	}
	
	@Step
	public void validationWord() {
		
		homePage.validar();
		
	}

}
