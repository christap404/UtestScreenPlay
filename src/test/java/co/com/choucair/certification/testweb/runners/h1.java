package co.com.choucair.certification.testweb.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/h1.feature",
        glue = "co.com.choucair.certification.testweb.stepdefinitions",
        snippets = SnippetType.CAMELCASE,
        tags = "")

public class h1 {
}
