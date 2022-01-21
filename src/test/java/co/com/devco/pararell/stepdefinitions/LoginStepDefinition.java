package co.com.devco.pararell.stepdefinitions;

import co.com.devco.pararell.models.UserModel;
import co.com.devco.pararell.questions.LoginBad;
import co.com.devco.pararell.questions.LoginResult;
import co.com.devco.pararell.tasks.EnterThe;
import co.com.devco.pararell.tasks.Open;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginStepDefinition {

    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("That (.*) open Swag Labs app")
    public void thatUserOpenSwagLabsApp(String actor) {
        theActorCalled(actor).wasAbleTo(Open.app());
    }

    @When("he submit username and password")
    public void heSubmitUsernameAndPassword(List<UserModel> data) {
        theActorInTheSpotlight().attemptsTo(
                EnterThe.credential(data.get(0))
        );
    }

    @Then("he should be logged in")
    public void heShouldBeLoggedIn() {
        theActorInTheSpotlight().should(seeThat(LoginResult.successful()));
    }

    @Then("^he should be error message$")
    public void he_should_be_error_message() {
        theActorInTheSpotlight().should(seeThat(LoginBad.failed()));
    }


}
