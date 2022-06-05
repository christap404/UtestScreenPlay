package co.com.choucair.certification.utest.tasks;

import co.com.choucair.certification.utest.interactions.EnterDataStepOne;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import co.com.choucair.certification.utest.models.InfoPersonal;

import java.util.List;

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

