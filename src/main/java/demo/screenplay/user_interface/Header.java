package demo.screenplay.user_interface;

import net.serenitybdd.screenplay.targets.Target;

public class Header {

    public static final Target SIGN_IN_DROPDOWN = Target.the("the sign in dropdown")
            .locatedBy("//span[contains(.,'Sign In')]");

    public static final Target CREATE_AN_ACCOUNT_BUTTON = Target.the("the create an account button")
            .locatedBy("//a[contains(.,'Create an Account')]");
}