package co.com.bancolombia.certification.googlesuite.userinterfaces;



import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class GoogleTranslatePage {
	
	public static final Target SOURCE_LANGUAGE_OPTION = Target.the("Source language button").located(By.xpath("//div[@class='sl-more tlid-open-source-language-list']"));
	public static final Target TARGET_LANGUAGE_OPTION = Target.the("Target language button").located(By.xpath("//div[@class='tl-more tlid-open-target-language-list']"));
	public static final Target SOURCE_LANGUAGE = Target.the("Selection Lenguage").locatedBy("//div[contains(@onclick,\"sl_list_en'\")]");
	public static final Target TARGET_LANGUAGE= Target.the("Selection Lenguage").locatedBy("//div[contains(@onclick, \"tl_list_es'\")]");
	public static final Target SOURCE_LANGUAGE_TEXAREA = Target.the("Source text lenguage area").located(By.id("source"));
	public static final Target VALIDATION_WORD = Target.the("Validation word").located(By.xpath("//div[@class=\"text-wrap tlid-copy-target\"]"));
//	public static final Target TARGET_LANGUAGE_TEXAREA = Target.the("Target text lenguage area").located(By.className("result tlid-copy-target"));
}
