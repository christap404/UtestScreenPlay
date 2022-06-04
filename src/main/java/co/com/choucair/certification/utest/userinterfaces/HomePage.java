package co.com.choucair.certification.utest.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {
    public static final Target JOIN_TODAY_BUTTON = Target.the("join today button").
            located(By.className("unauthenticated-nav-bar__sign-up"));
}
