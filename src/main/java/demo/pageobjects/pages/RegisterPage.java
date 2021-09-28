package demo.pageobjects.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.Keys;
import demo.pageobjects.model.User;
import java.util.List;
import java.util.stream.Collectors;

@DefaultUrl("https://www.westmarine.com/register")
public class RegisterPage extends PageObject {

    // -----------------------------------------------------------------------------------------------------------------
    // SELECTORS
    private static final String INPUT_FIRST_NAME = "#register\\.firstName";
    private static final String INPUT_LAST_NAME = "#register\\.lastName";
    private static final String INPUT_EMAIL = "#register\\.email";
    private static final String INPUT_PASSWORD = "#password";

    private static final String CHECKBOX_EMAIL_ME_NEWS = ".custom-control.custom-checkbox.form-group";

    private static final String BUTTON_CREATE_ACCOUNT = "#registerWithAddressForm .btn.btn-primary";

    // -----------------------------------------------------------------------------------------------------------------
    // ACTIONS
    public RegisterPage enterRegistration(User user) {
        $(INPUT_FIRST_NAME).type(user.getFirstname());
        $(INPUT_LAST_NAME).type(user.getLastname());
        $(INPUT_EMAIL).type(user.getEmail());
        $(INPUT_PASSWORD).type(user.getPassword());
        if (!user.getEmailMeNews())
            $(CHECKBOX_EMAIL_ME_NEWS).click();
        return this;
    }

    public RegisterPage createAccount() {
        //$(BUTTON_CREATE_ACCOUNT).click();
        $(INPUT_PASSWORD).sendKeys(Keys.ENTER);
        return this;
    }

    // -----------------------------------------------------------------------------------------------------------------
    // GETTERS
    public List<String> displayedItems() {
        return findAll(".view").stream()
                .map(WebElementFacade::getText)
                .collect(Collectors.toList());
    }

}
