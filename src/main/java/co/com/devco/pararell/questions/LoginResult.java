package co.com.devco.pararell.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.devco.pararell.userinterfaces.ProductPage.BTN_ADD_TO_CART;
import static co.com.devco.pararell.userinterfaces.ProductPage.BTN_OPEN_SHOP_CART;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class LoginResult implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_OPEN_SHOP_CART, isPresent()).forNoMoreThan(20).seconds()
        );
        return BTN_OPEN_SHOP_CART.resolveFor(actor).isPresent();
    }

    public static LoginResult successful(){
        return new LoginResult();
    }
}
