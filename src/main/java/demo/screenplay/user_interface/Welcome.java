package demo.screenplay.user_interface;

import net.serenitybdd.screenplay.targets.Target;

import java.time.Duration;

public class Welcome {

    public static final Target GREETING = Target.the("the greeting")
            .locatedBy("#maincontent .mt-sm-5.text-capitalize")
            .waitingForNoMoreThan(Duration.ofSeconds(30));
}