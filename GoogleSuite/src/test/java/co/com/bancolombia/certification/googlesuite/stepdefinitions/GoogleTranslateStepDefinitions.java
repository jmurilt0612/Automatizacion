package co.com.bancolombia.certification.googlesuite.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import org.openqa.selenium.WebDriver;

import co.com.bancolombia.certification.googlesuite.questions.TheTranslation;
import co.com.bancolombia.certification.googlesuite.task.GoTo;
import co.com.bancolombia.certification.googlesuite.task.OpenTheBrowser;
import co.com.bancolombia.certification.googlesuite.task.Translate;
import co.com.bancolombia.certification.googlesuite.userinterfaces.GoogleAppsComponent;
import co.com.bancolombia.certification.googlesuite.userinterfaces.GoogleHomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class GoogleTranslateStepDefinitions {
	
	@Managed(driver="chrome")
	private WebDriver herBrowser;
	
	private GoogleHomePage googleHomePage;
	
	private Actor susan = Actor.named("Susan");
	
	@Before
	public void setUp() {
		susan.can(BrowseTheWeb.with(herBrowser)); 
	}
	

	
	@Given("^That Susan wants to translate word$")
	public void thatSusanWantsToTranslateWord() throws Exception {
		
		susan.wasAbleTo(OpenTheBrowser.on(googleHomePage));
		susan.wasAbleTo(GoTo.theApp(GoogleAppsComponent.GOOGLE_TRANSLATE));
		
	    
	}

	@When("^She translates the word cheese from English to Spanish$")
	public void sheTranslatesTheWordCheeseFromEnglishToSpanish() throws Exception {
	   susan.wasAbleTo(Translate.the());
		
	   
	}
	
	@Then("^She should see the word \"([^\"]*)\" in the screen$")
	public void she_should_see_the_word_in_the_screen(String wordToCompare) throws Exception {
		susan.should(seeThat(TheTranslation.shows(wordToCompare)));
	}


}
