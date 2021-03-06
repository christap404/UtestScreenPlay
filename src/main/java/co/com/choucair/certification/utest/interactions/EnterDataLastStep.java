package co.com.choucair.certification.utest.interactions;

import co.com.choucair.certification.utest.models.InfoPersonal;
import co.com.choucair.certification.utest.userinterfaces.LastStep;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static co.com.choucair.certification.utest.userinterfaces.LastStep.*;

public class EnterDataLastStep implements Interaction {
    private List<InfoPersonal> info;

    public EnterDataLastStep(List<InfoPersonal> info) {
        this.info = info;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(info.get(0).getPassword()).into(INPUT_PASSWORD),
                Enter.theValue(info.get(0).getPassword()).into(INPUT_PASSWORD),
                Enter.theValue(info.get(0).getConfirmPassword()).into(INPUT_CONFIRM_PASSWORD),
                Click.on(CHECK_INFORMED),
                Click.on(CHECK_TERMS),
                Click.on(CHECK_POLICY),
                Click.on(BUTTON_NEXT));


        /*actor.attemptsTo(Enter.theValue(info.get(0).getPassword()).into(LastStep.INPUT_PASSWORD));
        actor.attemptsTo(Enter.theValue(info.get(0).getConfirmPassword()).into(LastStep.INPUT_CONFIRM_PASSWORD));
        actor.attemptsTo(Click.on(LastStep.CHECK_INFORMED));
        actor.attemptsTo(Click.on(LastStep.CHECK_TERMS));
        actor.attemptsTo(Click.on(LastStep.CHECK_POLICY));
        actor.attemptsTo(Click.on(LastStep.BUTTON_NEXT));*/
    }

    public static EnterDataLastStep complete(List<InfoPersonal> list) {
        return Tasks.instrumented(EnterDataLastStep.class, list);
    }
}
