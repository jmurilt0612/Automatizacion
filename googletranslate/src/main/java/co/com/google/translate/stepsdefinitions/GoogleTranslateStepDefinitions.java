package co.com.google.translate.stepsdefinitions;

import co.com.google.translate.steps.GoogleHomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class GoogleTranslateStepDefinitions {
	
	@Steps
	GoogleHomePage traductor;
	
	@Given("that Susan wants to translate a word")
	public void thatSusanWantsToTranslateWord() throws Exception{
		traductor.openGoogleTranslatePage();
		
	}
	
	@When("she translates the word cheese from English to Spanish")
	public void sheTranslatesTheWordCheeseFromEnglishToSpanish() throws Exception{
	traductor.enterTheWordToTranslate("Cheese");
	}
	@Then("she should see the word queso in the screen")
	public void shwShouldSeeTheWordQuesoInTheScreen() throws Exception{
		traductor.validationWord();

	}
	
	
	}

