package co.com.devco.pararell.tasks;

import co.com.devco.automation.mobile.actions.Scroll;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.devco.pararell.userinterfaces.CheckoutPage.*;
import static co.com.devco.pararell.userinterfaces.ProductPage.BTN_OPEN_SHOP_CART;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class Checkout implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_OPEN_SHOP_CART),
                Scroll.untilVisibleTarget(BTN_CHECKOUT),
                Click.on(BTN_CHECKOUT),
                Enter.theValue("Brahian").into(TXT_NAME),
                Enter.theValue("Restrepo").into(TXT_LAST_NAME),
                SendKeys.of("050005").into(TXT_POST_CODE),
                Scroll.untilVisibleTarget(BTN_CONTINUE),
                Click.on(BTN_CONTINUE),
                Scroll.untilVisibleTarget(BTN_FINISH),
                WaitUntil.the(BTN_FINISH,isClickable()).forNoMoreThan(5).seconds(),
                Click.on(BTN_FINISH));
    }

    public static Performable checkout() {
        return instrumented(Checkout.class);
    }

}
