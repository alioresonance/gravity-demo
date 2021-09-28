package demo.screenplay.questions;

import demo.screenplay.user_interface.Welcome;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class TheGreeting implements Question<String> {

    public static Question<String> displayed() {
        return Text.of(Welcome.GREETING)
                .describedAs("the greeting")
                .asAString();
    }

    @Override
    public String answeredBy(Actor actor) {
        return null;
    }
}