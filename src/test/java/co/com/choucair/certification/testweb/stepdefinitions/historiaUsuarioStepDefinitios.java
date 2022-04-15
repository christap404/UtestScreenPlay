package co.com.choucair.certification.testweb.stepdefinitions;

import co.com.choucair.certification.testweb.quiestions.ValidateTopPage;
import co.com.choucair.certification.testweb.quiestions.validateScrollButton;
import co.com.choucair.certification.testweb.tasks.ClickButtonToTop;
import co.com.choucair.certification.testweb.tasks.ScrollDownMainPage;
import co.com.choucair.certification.testweb.tasks.clickScrollButton;
import co.com.choucair.certification.testweb.utils.DriverWeb;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;

public class historiaUsuarioStepDefinitios {
    @Before
    public void setUp(){
        OnStage.setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(DriverWeb.hisBrowser())));
        OnStage.theActorCalled("user");
    }

    @Given("^the user are in home page$")
    public void theUserAreInHomePage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.choucairtesting.com/"));
    }

    @When("^user scrolls down the main page$")
    public void userScrollsDownTheMainPage() {
        OnStage.theActorInTheSpotlight().attemptsTo(ScrollDownMainPage.scroll());
    }

    @When("^the user clicks on the button to return to the top$")
    public void theUserClicksOnTheButtonToReturnToTheTop() {
        OnStage.theActorInTheSpotlight().attemptsTo(ClickButtonToTop.click());
    }

    @Then("^scrolls to the top of the page (.*)$")
    public void scrollsToTheTopOfThePage(String state) {

    }


    @Then("^scroll down the section on the home page$")
    public void scrollDownTheSectionOnTheHomePage() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(validateScrollButton.validate()));
    }

    @When("^the user clicks on the Formacion button$")
    public void theUserClicksOnTheFormacionButton() {

    }

    @When("^the user clicks on the button Programacion de cursos$")
    public void theUserClicksOnTheButtonProgramacionDeCursos() {

    }

    @Then("^The course scheduling section is displayed$")
    public void theCourseSchedulingSectionIsDisplayed() {

    }

    @Then("^the user see the top page$")
    public void theUserSeeTheTopPage() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateTopPage.validate()));
    }

    @When("^the user click to scroll down button$")
    public void theUserClicktoScrollDownButton() {
        OnStage.theActorInTheSpotlight().attemptsTo(clickScrollButton.click());
    }
}
