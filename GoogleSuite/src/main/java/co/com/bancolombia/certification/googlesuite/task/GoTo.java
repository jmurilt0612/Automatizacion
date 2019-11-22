package co.com.bancolombia.certification.googlesuite.task;


import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import co.com.bancolombia.certification.googlesuite.userinterfaces.GoogleAppsComponent;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.JavaScript;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.configuration.WebDriverConfiguration;
import net.thucydides.core.webdriver.ThucydidesWebDriverSupport;

public class GoTo implements Task{
	
	private Target googleApp;
	
	public GoTo(Target googleApp) {
		this.googleApp= googleApp;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(GoogleAppsComponent.GOOGLE_APPS));
		actor.attemptsTo(WaitUntil.the(googleApp, WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds());
		actor.attemptsTo(Click.on(googleApp));
		

		
		
	}

	public static GoTo theApp(Target googleApp) {
		// TODO Auto-generated method stub
		return instrumented(GoTo.class, googleApp);
	}

	
}
