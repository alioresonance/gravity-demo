package demo.screenplay.user_interface;

import net.serenitybdd.screenplay.targets.Target;

public class CreateAccount {

    public static final Target FIRST_NAME_FIELD = Target.the("'First Name' field")
            .locatedBy("#registration-form-fname");
    public static final Target LAST_NAME_FIELD = Target.the("'Last Name' field")
            .locatedBy("#registration-form-lname");
    public static final Target EMAIL_FIELD = Target.the("'Email' field")
            .locatedBy("#registration-form-email");
    public static final Target PASSWORD_FIELD = Target.the("'Password' field")
            .locatedBy("#registration-form-password");
    public static final Target CONFIRM_PASSWORD_FIELD = Target.the("'Confirm Password' field")
            .locatedBy("#registration-form-password-confirm");

    public static final Target STAY_UPDATED_CHECKBOX = Target.the("'Stay updated on new products, great offers and store events' checkbox")
            .locatedBy("#register > form > div.form-group.custom-checkbox.my-3");

    public static final Target CREATE_ACCOUNT_BUTTON = Target.the("'Create Account' button")
            .locatedBy("//button[contains(.,'Create Account')]");
}