package co.com.choucair.certification.utest.interactions;

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
        actor.attemptsTo(Enter.theValue(info.get(0).getCity()).into(INPUT_CITY),
                Enter.keyValues(Keys.ARROW_DOWN).into(INPUT_CITY),
                Click.on(INPUT_COUNTRY),
                Enter.theValue(info.get(0).getCountry()).into(ENTER_COUNTRY),
                Enter.theValue(info.get(0).getCode()).into(INPUT_ZIP),
                Click.on(BUTTON_NEXT));
    }

    public static EnterDataStepTwo complete(List<InfoPersonal> info) {
        return Tasks.instrumented(EnterDataStepTwo.class, info);
    }
}
