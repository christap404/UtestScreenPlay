package co.com.choucair.certification.utest.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class StepTwo {

    public static final Target INPUT_CITY = Target.the("input city").
            located(By.id("city"));

    public static final Target INPUT_ZIP = Target.the("input zip").
            located(By.id("zip"));

    public static final Target INPUT_COUNTRY = Target.the("input country").
            located(By.xpath("//span[@class='ui-select-match-text pull-left']"));

    public static final Target ENTER_COUNTRY = Target.the("enter country").
            located(By.xpath("(//input[@type='search'])[2]"));

    public static final Target BUTTON_NEXT= Target.the("button next").
            located(By.xpath("//a[@role='button']"));

}
