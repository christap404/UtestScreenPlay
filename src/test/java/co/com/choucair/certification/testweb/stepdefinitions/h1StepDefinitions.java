package co.com.choucair.certification.testweb.stepdefinitions;

import co.com.choucair.certification.testweb.utils.DriverWeb;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;

public class h1StepDefinitions {
    @Before
    public void setUp(){
        OnStage.setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(DriverWeb.hisBrowser())));
        OnStage.theActorCalled("user");
    }

    @Given("^the user are in home page$")
    public void theUserAreInHomePage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.choucairtesting.com/"));
    }
}
