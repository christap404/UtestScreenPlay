package co.com.choucair.certification.utest.iteractions;

import co.com.choucair.certification.utest.models.InfoPersonal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;
import org.openqa.selenium.Keys;

import java.util.List;

import static co.com.choucair.certification.utest.userinterfaces.StepThree.*;

public class EnterDataStepThree implements Interaction {

    private List<InfoPersonal> info;

    public EnterDataStepThree(List<InfoPersonal> info) {
        this.info = info;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(INPUT_COMPUTER));
        actor.attemptsTo(Enter.theValue(info.get(0).getComputer()).into(ENTER_COMPUTER));
        actor.attemptsTo(SendKeys.of(Keys.ENTER).into(ENTER_COMPUTER));
        actor.attemptsTo(Click.on(INPUT_VERSION));
        actor.attemptsTo(Enter.theValue(info.get(0).getVersion()).into(ENTER_VERSION));
        actor.attemptsTo(SendKeys.of(Keys.ENTER).into(ENTER_VERSION));
        actor.attemptsTo(Click.on(INPUT_LANGUAGE));
        actor.attemptsTo(Enter.theValue(info.get(0).getLanguage()).into(ENTER_LANGUAGE));
        actor.attemptsTo(SendKeys.of(Keys.ENTER).into(ENTER_LANGUAGE));
        actor.attemptsTo(Click.on(INPUT_MOBILE));
        actor.attemptsTo(Enter.theValue(info.get(0).getMovileDivice()).into(ENTER_MOBILE));
        actor.attemptsTo(SendKeys.of(Keys.ENTER).into(ENTER_MOBILE));
        actor.attemptsTo(Click.on(INPUT_MODEL));
        actor.attemptsTo(Enter.theValue(info.get(0).getModel()).into(ENTER_MODEL));
        actor.attemptsTo(SendKeys.of(Keys.ENTER).into(ENTER_MODEL));
        actor.attemptsTo(Click.on(INPUT_SYSTEM));
        actor.attemptsTo(Enter.theValue(info.get(0).getOperationSystem()).into(ENTER_SYSTEM));
        actor.attemptsTo(SendKeys.of(Keys.ENTER).into(ENTER_SYSTEM));
        actor.attemptsTo(Click.on(BUTTON_NEXT));
    }

    public static EnterDataStepThree complete(List<InfoPersonal> info) {
        return Tasks.instrumented(EnterDataStepThree.class, info);
    }
}
