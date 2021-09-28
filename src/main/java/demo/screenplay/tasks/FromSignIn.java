package demo.screenplay.tasks;

import demo.screenplay.user_interface.Header;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class FromSignIn {
    public static Performable gotoCreateAccount() {
        return Task.where("{0} goto create account page",
                Click.on(Header.SIGN_IN_DROPDOWN),
                Click.on(Header.CREATE_AN_ACCOUNT_BUTTON)
        );
    }
}