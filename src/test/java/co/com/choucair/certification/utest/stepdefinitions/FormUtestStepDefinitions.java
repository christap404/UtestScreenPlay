package co.com.choucair.certification.utest.stepdefinitions;

import co.com.choucair.certification.utest.models.InfoPersonal;
import co.com.choucair.certification.utest.questions.ValidateMessage;
import co.com.choucair.certification.utest.tasks.*;
import co.com.choucair.certification.utest.utils.DriverWeb;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;

public class FormUtestStepDefinitions {

    @Before
    public void setUp() {
        OnStage.setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(DriverWeb.hisBrowser())));
        OnStage.theActorCalled("user");
    }

    @Given("^the user are in home page$")
    public void theUserAreInHomePage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.utest.com/"));
    }


    @When("^the user click Join Today$")
    public void theUserClickJoinToday() {
        OnStage.theActorInTheSpotlight().attemptsTo(ClickOnJoinToday.click());
    }

    @When("^the user fill the Step one$")
    public void theUserFillTheStepOne(List<InfoPersonal> info) {
        OnStage.theActorInTheSpotlight().attemptsTo(CompletStepOne.complete(info));
    }

    @When("^the user fill the step two$")
    public void theUserFillTheStepTwo(List<InfoPersonal> info) {
        OnStage.theActorInTheSpotlight().attemptsTo(CompletedStepTwo.complete(info));
    }

    @When("^the user fill the step three$")
    public void theUserFillTheStepThree(List<InfoPersonal> info) {
        OnStage.theActorInTheSpotlight().attemptsTo(CompletStepThree.complete(info));
    }

    @When("^the user fill the Last Step and click on button Complete Setup$")
    public void theUserFillTheLastStepAndClickOnButtonCompleteSetup(List<InfoPersonal> info) {
        OnStage.theActorInTheSpotlight().attemptsTo(CompletedLastStep.complete(info));
    }

    @Then("^the user see this message (.*)$")
    public void theUserSeeThisMessageWelcomeToTheWorldSLargestCommunityOfFreelanceSoftwareTesters(String message) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateMessage.Validate(message)));
    }


}
