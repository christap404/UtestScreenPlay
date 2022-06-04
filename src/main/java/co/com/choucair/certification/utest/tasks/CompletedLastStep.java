package co.com.choucair.certification.utest.tasks;

import co.com.choucair.certification.utest.iteractions.EnterDataLastStep;
import co.com.choucair.certification.utest.models.InfoPersonal;
import co.com.choucair.certification.utest.userinterfaces.LastStep;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class CompletedLastStep implements Task {

    private List<InfoPersonal> info;

    public CompletedLastStep(List<InfoPersonal> info) {
        this.info = info;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(EnterDataLastStep.complete(info));
    }

    public static CompletedLastStep complete(List<InfoPersonal> list) {
        return Tasks.instrumented(CompletedLastStep.class, list);
    }
}
