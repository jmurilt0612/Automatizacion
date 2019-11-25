package co.com.caffeinate.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		
		features = "src/test/resources/feactures/caffeinate_me.feature",
		glue = "co.com.caffeinate.stepdefinitions",
		snippets = SnippetType.CAMELCASE
		
)
public class CaffeinateMeRunners {}
