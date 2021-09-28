package demo.screenplay.user_interface;

import net.serenitybdd.screenplay.targets.Target;

public class Home {

    public static final Target PRIVACY_DISCLAIMER_CLOSE_BUTTON =
            Target.the("the privacy disclaimer close button")
                    .locatedBy("#privacyDisclaimer > a.secondary.privacy-disclaimer-accept");
    public static final Target TRACKING_CONSENT_NO_BUTTON =
            Target.the("the tracking consent no button")
                    .locatedBy("#consent-tracking button.decline");
    public static final Target COOKIES_WARNING_ACCEPT_BUTTON =
            Target.the("the cookies warning accept button")
                    .locatedBy(".modal-open .content-asset .cookie-warning-messaging .alert .btn");
}