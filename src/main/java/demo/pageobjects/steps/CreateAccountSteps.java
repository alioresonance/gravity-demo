package demo.pageobjects.steps;

import net.thucydides.core.ThucydidesSystemProperty;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.util.EnvironmentVariables;
import demo.pageobjects.model.User;
import demo.pageobjects.pages.HomePage;
import demo.pageobjects.pages.RegisterPage;
import demo.pageobjects.pages.WelcomePage;

import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsIterableContainingInOrder.contains;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsCollectionContaining.hasItems;

public class CreateAccountSteps {

    HomePage homePage;
    RegisterPage registerPage;
    WelcomePage welcomePage;

    EnvironmentVariables environmentVariables;

    // -----------------------------------------------------------------------------------------------------------------
    // STEPS
    @Step
    public CreateAccountSteps starts_on_create_account_page() {
        homePage.
                openApplication().
                gotoRegister();

        String baseUrl = ThucydidesSystemProperty.WEBDRIVER_BASE_URL.from(environmentVariables);
        return this;
    }

    public CreateAccountSteps creates_an_account_as_some(User user) {
        registerPage.
                enterRegistration(user).
                createAccount();
        return this;
    }

    // -----------------------------------------------------------------------------------------------------------------
    // ASSERTIONS
    @Step
    public CreateAccountSteps should_see_that_success_alert_says(String expectedMessage) {
        assertThat(welcomePage.successAlert(), is(expectedMessage));
        return this;
    }

    //@Step
    //public void should_see_that_success_alert_says(String expectedPlaceholderText) {
    //    assertThat(todoListPage.placeholderText(), is(expectedPlaceholderText));
    //}

    //@Step
    //public void should_see_that_that_following_items_are_marked_as_complete(String... items) {
    //    asList(items).forEach(this::should_see_that_that_following_item_is_marked_as_complete);
    //}

}
