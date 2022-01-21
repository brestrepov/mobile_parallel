package co.com.devco.pararell.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/login.feature",
        glue = "co.com.devco.pararell.stepdefinitions",
        snippets = SnippetType.CAMELCASE,
        tags = ""
)
public class LoginRunner {
}
