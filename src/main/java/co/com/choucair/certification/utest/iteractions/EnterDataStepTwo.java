package co.com.choucair.certification.utest.iteractions;

import co.com.choucair.certification.utest.models.InfoPersonal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import java.util.List;

import static co.com.choucair.certification.utest.userinterfaces.StepTwo.*;

public class EnterDataStepTwo implements Interaction {

    private List<InfoPersonal> info;

    public EnterDataStepTwo(List<InfoPersonal> info) {
        this.info = info;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(info.get(0).getCity()).into(INPUT_CITY));
        actor.attemptsTo(Enter.keyValues(Keys.ARROW_DOWN).into(INPUT_CITY));
        actor.attemptsTo(Click.on(INPUT_COUNTRY));
        actor.attemptsTo(Enter.theValue(info.get(0).getCountry()).into(ENTER_COUNTRY));
        actor.attemptsTo(Enter.theValue(info.get(0).getCode()).into(INPUT_ZIP));
        actor.attemptsTo(Click.on(BUTTON_NEXT));
    }

    public static EnterDataStepTwo complete(List<InfoPersonal> info) {
        return Tasks.instrumented(EnterDataStepTwo.class, info);
    }
}
