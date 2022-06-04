package co.com.choucair.certification.utest.iteractions;

import co.com.choucair.certification.utest.models.InfoPersonal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static co.com.choucair.certification.utest.userinterfaces.StepOne.*;
import static co.com.choucair.certification.utest.userinterfaces.StepOne.BUTTON_NEXT;

public class EnterDataStepOne implements Interaction {
    private List<InfoPersonal> info;

    public EnterDataStepOne(List<InfoPersonal> info) {
        this.info = info;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(info.get(0).getName()).into(INPUT_FIRTS_NAME));
        actor.attemptsTo(Enter.theValue(info.get(0).getLastName()).into(INPUT_LAST_NAME));
        actor.attemptsTo(Enter.theValue(info.get(0).getEmail()).into(INPUT_EMAIL));
        actor.attemptsTo(Click.on(LIST_MONTH));
        actor.attemptsTo(Click.on(SELECT_MONTH.of(info.get(0).getMonth())));
        actor.attemptsTo(Click.on(LIST_DAY));
        actor.attemptsTo(Click.on(SELECT_DAY.of(info.get(0).getDay())));
        actor.attemptsTo(Click.on(LIST_YEAR));
        actor.attemptsTo(Click.on(SELECT_YEAR.of(info.get(0).getYear())));
        actor.attemptsTo(Click.on(LIST_LANGUAGE));
        actor.attemptsTo(Click.on(SELECT_LANGUAGE.of(info.get(0).getIdiom())));
        actor.attemptsTo(Click.on(BUTTON_NEXT));
    }

    public static EnterDataStepOne complete(List<InfoPersonal> info) {
        return Tasks.instrumented(EnterDataStepOne.class, info);
    }
}
