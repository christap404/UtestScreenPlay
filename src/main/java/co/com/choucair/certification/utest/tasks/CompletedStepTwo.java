package co.com.choucair.certification.utest.tasks;

import co.com.choucair.certification.utest.iteractions.EnterDataStepTwo;
import co.com.choucair.certification.utest.models.InfoPersonal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import java.util.List;

import static co.com.choucair.certification.utest.userinterfaces.StepTwo.*;

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
