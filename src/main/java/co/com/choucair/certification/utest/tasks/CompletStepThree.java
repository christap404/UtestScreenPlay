package co.com.choucair.certification.utest.tasks;

import co.com.choucair.certification.utest.interactions.EnterDataStepThree;
import co.com.choucair.certification.utest.models.InfoPersonal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import java.util.List;

public class CompletStepThree implements Task {

    private List<InfoPersonal> info;

    public CompletStepThree(List<InfoPersonal> info) {
        this.info = info;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(EnterDataStepThree.complete(info));
    }

    public static CompletStepThree complete(List<InfoPersonal> list) {
        return Tasks.instrumented(CompletStepThree.class, list);
    }
}
