package demo.screenplay;

import demo.screenplay.model.User;
import demo.screenplay.questions.TheGreeting;
import demo.screenplay.tasks.Start;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.WithTag;
import net.thucydides.core.annotations.WithTags;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import demo.screenplay.model.Random;
import demo.screenplay.tasks.CreateAnAccount;
import demo.screenplay.tasks.FromSignIn;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static org.hamcrest.CoreMatchers.is;

//@RunWith(SerenityRunner.class)
@WithTags({
        @WithTag("Screenplay pattern"),
        @WithTag("version:RELEASE-1")
})
public class CreateNewAccountDemoTest {

    private final Actor james = Actor.named("James");

    @Managed
    private WebDriver hisBrowser;

    @Before
    public void init() {

        james.can(BrowseTheWeb.with(hisBrowser));
    }

    //@Test
    public void should_be_able_to_create_an_account() {

        User randomUser = Random.user();

        givenThat(james).wasAbleTo(
                Start.onTheHomePage().then(FromSignIn.gotoCreateAccount()) );
        when(james).attemptsTo(
                CreateAnAccount.asSome(randomUser));
        then(james).should(
                seeThat(TheGreeting.displayed(), is(String.format("Welcome, %s.", randomUser.getFirstname()))) );
    }
}
