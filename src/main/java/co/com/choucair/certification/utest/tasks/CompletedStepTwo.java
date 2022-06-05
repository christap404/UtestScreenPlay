package co.com.choucair.certification.utest.tasks;

import co.com.choucair.certification.utest.interactions.EnterDataStepTwo;
import co.com.choucair.certification.utest.models.InfoPersonal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import java.util.List;

public class CompletedStepTwo implements Task {

    private List<InfoPersonal> info;

    public CompletedStepTwo(List<InfoPersonal> info) {
        this.info = info;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(EnterDataStepTwo.complete(info));
    }

    public static CompletedStepTwo complete(List<InfoPersonal> list) {
        return Tasks.instrumented(CompletedStepTwo.class, list);
    }
}
