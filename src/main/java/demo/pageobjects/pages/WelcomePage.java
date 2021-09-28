package demo.pageobjects.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.List;

@DefaultUrl("https://www.westmarine.com/my-account/welcome")
public class WelcomePage extends PageObject {

    // -----------------------------------------------------------------------------------------------------------------
    // SELECTORS
    private static final String ALERT_SUCCESS = "#globalMessages > div";

    // -----------------------------------------------------------------------------------------------------------------
    // ACTIONS
    @FindBys({@FindBy(tagName = "a")})
    List<WebElement> testFindBys;

    @FindBy(css = "#todo-count")
    public WebElement itemsLeft;

    // -----------------------------------------------------------------------------------------------------------------
    // GETTERS
    public String successAlert() {
        return $(ALERT_SUCCESS).getText();
    }

}
