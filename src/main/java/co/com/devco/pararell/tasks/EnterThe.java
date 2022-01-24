package co.com.devco.pararell.tasks;

import co.com.devco.pararell.models.UserModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.type.Type;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.devco.pararell.userinterfaces.LoginPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class EnterThe implements Task {

    private final UserModel userModel;

    public EnterThe(UserModel userModel){
        this.userModel=userModel;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(TXT_USERNAME, isPresent()).forNoMoreThan(5).seconds(),
                Enter.theValue(userModel.getUsername()).into(TXT_USERNAME),
                Enter.theValue(userModel.getPassword()).into(TXT_PASSWORD),
                Click.on(BTN_LOGIN)
        );
    }

    public static EnterThe credential(UserModel data){
        return instrumented(EnterThe.class, data);
    }
}
