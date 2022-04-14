package co.com.choucair.certification.testweb.tasks;

import co.com.choucair.certification.testweb.userinterfaces.mainPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Scroll;

public class ScrollDownMainPage implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Scroll.to(mainPage.SECTION_INDUSTRIAS));
    }

    public static ScrollDownMainPage scroll() {
        return Tasks.instrumented(ScrollDownMainPage.class);
    }
}
