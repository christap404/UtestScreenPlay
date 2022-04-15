package co.com.choucair.certification.testweb.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/historia_de_usuario.feature",
        glue = "co.com.choucair.certification.testweb.stepdefinitions",
        snippets = SnippetType.CAMELCASE,
        tags = "@ES")

public class historiaUsuario {
}
