 package co.com.bancolombia.certification.googlesuite.task;

import static co.com.bancolombia.certification.googlesuite.userinterfaces.GoogleTranslatePage.SOURCE_LANGUAGE;
import static co.com.bancolombia.certification.googlesuite.userinterfaces.GoogleTranslatePage.SOURCE_LANGUAGE_OPTION;
import static co.com.bancolombia.certification.googlesuite.userinterfaces.GoogleTranslatePage.SOURCE_LANGUAGE_TEXAREA;
import static co.com.bancolombia.certification.googlesuite.userinterfaces.GoogleTranslatePage.TARGET_LANGUAGE;
import static co.com.bancolombia.certification.googlesuite.userinterfaces.GoogleTranslatePage.TARGET_LANGUAGE_OPTION;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Translate implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(SOURCE_LANGUAGE_OPTION),
				Click.on(SOURCE_LANGUAGE),
				Click.on(TARGET_LANGUAGE_OPTION),
				Click.on(TARGET_LANGUAGE),
				Enter.theValue("Cheese").into(SOURCE_LANGUAGE_TEXAREA)
				
					);
		
	}

	public static Translate the() {
		return Tasks.instrumented(Translate.class);
	}

}
