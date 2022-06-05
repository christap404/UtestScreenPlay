package co.com.choucair.certification.utest.interactions;

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

        actor.attemptsTo(Click.on(INPUT_COMPUTER),
                Enter.theValue(info.get(0).getComputer()).into(ENTER_COMPUTER),
                SendKeys.of(Keys.ENTER).into(ENTER_COMPUTER),
                Click.on(INPUT_VERSION),
                Enter.theValue(info.get(0).getVersion()).into(ENTER_VERSION),
                SendKeys.of(Keys.ENTER).into(ENTER_VERSION),
                Click.on(INPUT_LANGUAGE),
                Enter.theValue(info.get(0).getLanguage()).into(ENTER_LANGUAGE),
                SendKeys.of(Keys.ENTER).into(ENTER_LANGUAGE),
                Click.on(INPUT_MOBILE),
                Enter.theValue(info.get(0).getMovileDivice()).into(ENTER_MOBILE),
                SendKeys.of(Keys.ENTER).into(ENTER_MOBILE),
                Click.on(INPUT_MODEL),
                Enter.theValue(info.get(0).getModel()).into(ENTER_MODEL),
                SendKeys.of(Keys.ENTER).into(ENTER_MODEL),
                Click.on(INPUT_SYSTEM),
                Enter.theValue(info.get(0).getOperationSystem()).into(ENTER_SYSTEM),
                SendKeys.of(Keys.ENTER).into(ENTER_SYSTEM),
                Click.on(BUTTON_NEXT));
    }

    public static EnterDataStepThree complete(List<InfoPersonal> info) {
        return Tasks.instrumented(EnterDataStepThree.class, info);
    }
}
