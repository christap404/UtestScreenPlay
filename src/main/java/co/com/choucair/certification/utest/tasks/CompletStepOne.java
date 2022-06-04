package co.com.choucair.certification.utest.tasks;

import co.com.choucair.certification.utest.iteractions.EnterDataStepOne;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import co.com.choucair.certification.utest.models.InfoPersonal;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static co.com.choucair.certification.utest.userinterfaces.StepOne.*;

public class CompletStepOne implements Task {

    private List<InfoPersonal> info;

    public CompletStepOne(List<InfoPersonal> info) {
        this.info = info;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(EnterDataStepOne.complete(info));
    }

    public static CompletStepOne complete(List<InfoPersonal> list) {
        return Tasks.instrumented(CompletStepOne.class, list);
    }
}

