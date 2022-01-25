package co.com.devco.pararell.stepdefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.AppiumDriver;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.logging.Level;
import java.util.logging.Logger;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getProxiedDriver;

public class Hook {
    //@Managed(driver = "Appium" )
    //public static WebDriver thePhone;
    public static AppiumDriver thePhone;
    private static boolean beforeAll = true;

    @Before
    public void setUp() {
        if (beforeAll) {
            Runtime.getRuntime().addShutdownHook(new Thread() {
                public void run() {
                    thePhone.quit();
                    thePhone = null;
                }
            });
            beforeAll = false;
        }
    }

    @After
    public void logOut() {
        try {
            /*WebDriver facade = getProxiedDriver();
            ((AppiumDriver) facade).closeApp();
            ((AppiumDriver) facade).launchApp();*/
            AppiumDriver facade = getProxiedDriver();
            facade.closeApp();
            facade.launchApp();
        } catch (Exception ex) {
            Logger.getAnonymousLogger().log(Level.WARNING, "Could not close driver. AppiumDriver not found", ex);
        }

    }
}
