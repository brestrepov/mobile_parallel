package co.com.devco.pararell.userinterfaces;

import co.com.devco.automation.mobile.locator.Locator;
import net.serenitybdd.screenplay.targets.Target;

import static co.com.devco.automation.mobile.locator.ElementFinder.theElementBy;
import static co.com.devco.automation.mobile.locator.Locator.locator;

public class ProductPage {
    public static final Locator BTN_ADD_TO_CART_LOCATOR = locator().withAndroidXpathStatic("//android.view.ViewGroup[@content-desc='test-ADD TO CART']" )
            .withIosAccesibilityId("test-ADD TO CART" );
    public static final Locator BTN_BACK_TO_HOME_LOCATOR = locator().withAndroidXpathStatic("//android.view.ViewGroup[@content-desc='test-BACK TO PRODUCTS']" )
            .withIosAccesibilityId("test-BACK TO PRODUCTS" );
    public static final Locator BTN_OPEN_SHOP_CART_LOCATOR = locator().withAndroidXpathStatic("//android.view.ViewGroup[@content-desc='test-Cart']" )
            .withIosAccesibilityId("test-Cart" );


    public static final Target BTN_ADD_TO_CART = Target.the("Button Add Product to Cart").located(theElementBy(BTN_ADD_TO_CART_LOCATOR));
    public static final Target BTN_BACK_TO_HOME= Target.the("Button Back to the Home").located(theElementBy(BTN_BACK_TO_HOME_LOCATOR));
    public static final Target BTN_OPEN_SHOP_CART= Target.the("Button Cart").located(theElementBy(BTN_OPEN_SHOP_CART_LOCATOR));

}
