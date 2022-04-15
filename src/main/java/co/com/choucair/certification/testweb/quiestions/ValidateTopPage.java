package co.com.choucair.certification.testweb.quiestions;

import co.com.choucair.certification.testweb.userinterfaces.mainPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Visibility;
import net.serenitybdd.screenplay.questions.WebElementQuestion;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class ValidateTopPage implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        boolean state = false;
        state = Visibility.of(mainPage.MAIN_TITLE).viewedBy(actor).resolve();
        return state;
    }
    public static ValidateTopPage validate() {
        return new ValidateTopPage();
    }

}
