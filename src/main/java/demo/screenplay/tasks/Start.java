package demo.screenplay.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import demo.screenplay.user_interface.Home;

public class Start {

    public static Performable onTheHomePage() {
        return Task.where("{0} on the home page",
                Open.browserOn().thePageNamed("home.page"),
                Click.on(Home.TRACKING_CONSENT_NO_BUTTON),
                Click.on(Home.COOKIES_WARNING_ACCEPT_BUTTON)
        );
    }

}