package co.com.devco.pararell.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.devco.pararell.userinterfaces.ProductPage.BTN_ADD_TO_CART;
import static co.com.devco.pararell.userinterfaces.ProductPage.BTN_OPEN_SHOP_CART;

public class LoginResult implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return BTN_OPEN_SHOP_CART.resolveFor(actor).isVisible();
    }

    public static LoginResult successful(){
        return new LoginResult();
    }
}
