package demo.pageobject;

import demo.pageobjects.model.Random;
import demo.pageobjects.steps.CreateAccountSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

//@RunWith(SerenityRunner.class)
@WithTags({
        @WithTag("PageObjects Pattern"),
        @WithTag("version:RELEASE-1"),
})
public class CreateNewAccountDemoTest {

    @Managed WebDriver driver;

    @Steps
    CreateAccountSteps mike;

    @Title("Test to resolve issue #616172")
    //@Test
    public void should_be_able_to_create_an_account() {
        mike.
                starts_on_create_account_page().
                creates_an_account_as_some(Random.user()).
                should_see_that_success_alert_says("Thank you for completing XXX registration!");
    }

}