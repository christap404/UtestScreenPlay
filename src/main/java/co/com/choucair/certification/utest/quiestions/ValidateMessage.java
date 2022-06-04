package co.com.choucair.certification.utest.quiestions;

import co.com.choucair.certification.utest.userinterfaces.WelcomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidateMessage implements Question {
    private String message;

    public ValidateMessage(String message) {
        this.message = message;
    }

    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(WelcomePage.IMG_WELCOME).viewedBy(actor).asString().equals(message);
    }

    public static ValidateMessage Validate(String message) {
        return new ValidateMessage(message);
    }
}
