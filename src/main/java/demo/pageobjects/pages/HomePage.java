package demo.pageobjects.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.time.Duration;
import java.util.List;

@DefaultUrl("https://www.westmarine.com/")
public class HomePage extends PageObject {

    // -----------------------------------------------------------------------------------------------------------------
    // SELECTORS
    private static final String DROPDOWN_SIGN_IN = "//span[contains(.,'Sign In')]";

    private static final String BUTTON_CREATE_AN_ACCOUNT = "//a[contains(.,'Create An Account')]";
    private static final String BUTTON_CLOSE_PRIVACY_DISCLAIMER = "#privacyDisclaimer > a.btn.btn-secondary.secondary.privacy-disclaimer-accept";

    // -----------------------------------------------------------------------------------------------------------------
    // ACTIONS
    @FindBys({@FindBy(tagName = "a")})
    List<WebElement> testFindBys;

    @FindBy(css = "#todo-count")
    public WebElement itemsLeft;

    public HomePage openApplication() {
        open();
        waitForTheApplicationToLoad();
        $(BUTTON_CLOSE_PRIVACY_DISCLAIMER).click();
        return this;
    }

    private void waitForTheApplicationToLoad() {
        withTimeoutOf(Duration.ofSeconds(60)).waitFor(DROPDOWN_SIGN_IN);
    }

    public HomePage gotoRegister() {
        $(DROPDOWN_SIGN_IN).click();
        $(BUTTON_CREATE_AN_ACCOUNT).click();
        return this;
    }

    private boolean isShownAsCompleted(WebElementFacade itemRow) {
        return itemRow.find(By.tagName("label")).getCssValue("text-decoration").contains("line-through");
    }

    public void toggleAll() {
        evaluateJavascript("arguments[0].click();",$("#toggle-all"), $("."));
    }


    // -----------------------------------------------------------------------------------------------------------------
    // GETTERS
    //public AccountStatus statusOf(String todoItem) {
    //    WebElementFacade itemRow = inItemRowFor(todoItem);
    //    return isShownAsCompleted(itemRow) ? TodoStatus.Completed : TodoStatus.Active;
    //}

    //public List<String> displayedItems() {
    //    return findAll(".view").stream()
    //            .map(WebElementFacade::getText)
    //            .collect(Collectors.toList());
    //}
}
