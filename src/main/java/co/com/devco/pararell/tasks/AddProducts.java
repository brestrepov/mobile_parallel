package co.com.devco.pararell.tasks;

import co.com.devco.automation.mobile.actions.Scroll;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

import static co.com.devco.pararell.userinterfaces.HomePage.LBL_NAME_PRODUCT;
import static co.com.devco.pararell.userinterfaces.ProductPage.BTN_ADD_TO_CART;
import static co.com.devco.pararell.userinterfaces.ProductPage.BTN_BACK_TO_HOME;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class AddProducts implements Task {

    private List<Map<String, String>> nameProduct;

    public AddProducts(List<Map<String, String>> nameProduct) {
        this.nameProduct = nameProduct;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        IntStream.range(0, nameProduct.size())
                .forEach(
                        (product) ->
                                actor.attemptsTo(
                                        Scroll.untilVisibleTarget(LBL_NAME_PRODUCT.of(nameProduct.get(product).get("products"))),
                                        Click.on(LBL_NAME_PRODUCT.of(nameProduct.get(product).get("products"))),
                                        Scroll.untilVisibleTarget(BTN_ADD_TO_CART),
                                        WaitUntil.the(BTN_ADD_TO_CART, isClickable()).forNoMoreThan(3).seconds(),
                                        Click.on(BTN_ADD_TO_CART),
                                        Click.on(BTN_BACK_TO_HOME)));
    }

    public static Performable toCart(List<Map<String, String>> nameProduct){
        return instrumented(AddProducts.class, nameProduct);
    }
}
