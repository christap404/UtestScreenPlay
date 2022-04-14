package co.com.choucair.certification.testweb.tasks;

import co.com.choucair.certification.testweb.userinterfaces.mainPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class ClickButtonToTop implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(mainPage.ACEPT_COCKIE));
        actor.attemptsTo(Click.on(mainPage.BUTTON_GO_TOP));
    }

    public static ClickButtonToTop click() {
        return Tasks.instrumented(ClickButtonToTop.class);
    }
}
