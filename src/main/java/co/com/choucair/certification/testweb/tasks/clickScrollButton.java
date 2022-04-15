package co.com.choucair.certification.testweb.tasks;

import co.com.choucair.certification.testweb.userinterfaces.mainPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class clickScrollButton implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(mainPage.ROLL_BUTTON));
    }

    public static clickScrollButton click() {
        return Tasks.instrumented(clickScrollButton.class);
    }
}
