package co.com.choucair.certification.utest.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LastStep {

    public static final Target INPUT_PASSWORD= Target.the("input password").
            located(By.id("password"));

    public static final Target INPUT_CONFIRM_PASSWORD= Target.the("confirm password").
            located(By.id("confirmPassword"));

    public static final Target CHECK_INFORMED= Target.the("check informed").
            located(By.xpath("(//span[@class='checkmark signup-consent__checkbox signup-consent__checkbox--highlight'])"));

    public static final Target CHECK_TERMS= Target.the("check terms").
            located(By.xpath("(//span[@class='checkmark signup-consent__checkbox error'])[1]"));

    public static final Target CHECK_POLICY= Target.the("check policy").
            located(By.xpath("(//span[@ng-class='{error: userForm.privacySetting.$error.required}'])"));

    public static final Target BUTTON_NEXT= Target.the("button next").
            located(By.xpath("//a[@role='button']"));
}
