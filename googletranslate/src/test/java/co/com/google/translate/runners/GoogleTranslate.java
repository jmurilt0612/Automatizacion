package co.com.google.translate.runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import cucumber.api.SnippetType;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
  features="src/test/resources/features/googletranslate.feature",
  glue = "co.com.google.translate.stepsdefinitions",
        snippets = SnippetType.CAMELCASE
  )

public class GoogleTranslate {

}