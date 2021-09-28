package demo.screenplay.tasks;

import demo.screenplay.model.User;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static demo.screenplay.user_interface.CreateAccount.*;

public class CreateAnAccount {
    public static Performable asSome(User user) {
        return Task.where("{0} creates an account as user: " + user.getEmail(),
                Enter.theValue(user.getFirstname()).into(FIRST_NAME_FIELD),
                Enter.theValue(user.getLastname()).into(LAST_NAME_FIELD),
                Enter.theValue(user.getEmail()).into(EMAIL_FIELD),
                Enter.theValue(user.getPassword()).into(PASSWORD_FIELD),
                Enter.theValue(user.getPassword()).into(CONFIRM_PASSWORD_FIELD),
                Click.on(STAY_UPDATED_CHECKBOX),
                Click.on(CREATE_ACCOUNT_BUTTON)
        );
    }
}