package co.com.bancolombia.certification.googlesuite.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.IFrame;
import net.serenitybdd.screenplay.targets.Target;

public class GoogleAppsComponent {

	public static final Target GOOGLE_APPS = Target.the("Google apps Button").located(By.id("gbwa"));	
	public static final IFrame GOOGLE_APPS_MENU_FRAME = IFrame.withPath(By.xpath("//iframe[@role='presentation']"));
	public static final Target GOOGLE_TRANSLATE = Target.the("Google Translate Option").inIFrame(GOOGLE_APPS_MENU_FRAME)
			.locatedBy("//li/a[contains(@href, 'translate')]");
}
