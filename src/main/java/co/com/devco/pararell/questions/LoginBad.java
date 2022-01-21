package co.com.devco.pararell.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.devco.pararell.userinterfaces.LoginPage.LBL_USER_LOCKED;

public class LoginBad implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return LBL_USER_LOCKED.resolveFor(actor).isVisible();
    }

    public static LoginBad failed(){
        return new LoginBad();
    }
}
