package co.com.devco.pararell.stepdefinitions;

import co.com.devco.pararell.questions.Purchase;
import co.com.devco.pararell.tasks.AddProduct;
import co.com.devco.pararell.tasks.AddProducts;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;
import java.util.Map;

import static co.com.devco.pararell.tasks.Checkout.checkout;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class BuyingProductsStepDefinition {

    @When("^He puts in the cart the (.*)$")
    public void hePutsInTheCartTheSauceLabsBackpack(String nameProduct) {
        theActorInTheSpotlight().attemptsTo(AddProduct.toTheCart(nameProduct));
    }

    @When("^He does the checkout of his purchase$")
    public void heDoesTheCheckoutOfHisPurchase() {
        theActorInTheSpotlight().attemptsTo(checkout());
    }

    @When("^He puts in the cart these products$")
    public void hePutsInTheCartTheseProducts(List<Map<String, String>> products) {
        theActorInTheSpotlight().attemptsTo(AddProducts.toCart(products));
    }


    @Then("^He should see that his purchase is successful$")
    public void heShouldSeeThatHisPurchaseIsSuccessful() {
        theActorInTheSpotlight().should(seeThat(Purchase.isSuccesful()));
    }
}
