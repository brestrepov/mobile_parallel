package co.com.devco.pararell.userinterfaces;

import co.com.devco.automation.mobile.locator.Locator;
import net.serenitybdd.screenplay.targets.Target;

import static co.com.devco.automation.mobile.locator.ElementFinder.theElementBy;
import static co.com.devco.automation.mobile.locator.Locator.locator;

public class CheckoutPage {
    public static final Locator BTN_CHECKOUT_LOCATOR = locator().withAndroidXpathStatic("//android.view.ViewGroup[@content-desc='test-CHECKOUT']" )
            .withIosAccesibilityId("test-CHECKOUT" );
    public static final Locator TXT_NAME_LOCATOR = locator().withAndroidXpathStatic("//android.widget.EditText[@content-desc='test-First Name']" )
            .withIosAccesibilityId("test-First Name" );
    public static final Locator TXT_LAST_NAME_LOCATOR = locator().withAndroidXpathStatic("//android.widget.EditText[@content-desc='test-Last Name']" )
            .withIosAccesibilityId("test-Last Name" );
    public static final Locator TXT_POST_CODE_LOCATOR = locator().withAndroidXpathStatic("//android.widget.EditText[@content-desc='test-Zip/Postal Code']" )
            .withIosAccesibilityId("test-Zip/Postal Code" );
    public static final Locator BTN_CONTINUE_LOCATOR = locator().withAndroidXpathStatic("//android.view.ViewGroup[@content-desc='test-CONTINUE']" )
            .withIosAccesibilityId("test-CONTINUE" );
    public static final Locator BTN_FINISH_LOCATOR = locator().withAndroidXpathStatic("//android.view.ViewGroup[@content-desc='test-FINISH']" )
            .withIosAccesibilityId("test-FINISH" );

    public static final Target BTN_CHECKOUT = Target.the("Button to checkut").located(theElementBy(BTN_CHECKOUT_LOCATOR));
    public static final Target TXT_NAME = Target.the("Name Input").located(theElementBy(TXT_NAME_LOCATOR));
    public static final Target TXT_LAST_NAME = Target.the("Lastname Input").located(theElementBy(TXT_LAST_NAME_LOCATOR));
    public static final Target TXT_POST_CODE = Target.the("Post Code Input").located(theElementBy(TXT_POST_CODE_LOCATOR));
    public static final Target BTN_CONTINUE = Target.the("Button to Continue").located(theElementBy(BTN_CONTINUE_LOCATOR));
    public static final Target BTN_FINISH = Target.the("Button to Finish").located(theElementBy(BTN_FINISH_LOCATOR));

}
