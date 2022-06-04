package co.com.choucair.certification.utest.tasks;

import co.com.choucair.certification.utest.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class ClickOnJoinToday implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(HomePage.JOIN_TODAY_BUTTON));

    }
    public static ClickOnJoinToday click() {
        return Tasks.instrumented(ClickOnJoinToday.class);
    }
}
