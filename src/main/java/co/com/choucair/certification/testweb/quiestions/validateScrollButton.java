package co.com.choucair.certification.testweb.quiestions;

import co.com.choucair.certification.testweb.userinterfaces.mainPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

public class validateScrollButton implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        boolean result = false;
       result = Visibility.of(mainPage.MAIN_TITLE).viewedBy(actor).resolve().equals(false);

        return result;
    }

    public static validateScrollButton validate() {
        return new validateScrollButton();
    }
}
