package co.com.bancolombia.certification.googlesuite.questions;

import jxl.common.Assert;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.bancolombia.certification.googlesuite.userinterfaces.GoogleTranslatePage.VALIDATION_WORD;
import static org.junit.Assert.assertEquals;



public class TheTranslation implements Question<Boolean> {

	private String word;
	private String wordToCompare;
	
	public TheTranslation(String wordToCompare) {
		this.wordToCompare=wordToCompare;
	}

	@Override
	public Boolean answeredBy(Actor actor) {
		word= Text.of(VALIDATION_WORD).viewedBy(actor).asString();
		return word.equals(wordToCompare);
	}
	
	
//	@Override
//	public Boolean answeredBy2(Actor actor) {
//		word= Text.of(VALIDATION_WORD).viewedBy(actor).asString();
//		if (word=="queso" || word=="Queso") {
//			return true;
//		}
//		return false;
//		
//	}

	public static TheTranslation shows(String wordToCompare) {
		return new TheTranslation(wordToCompare);
	}
}
