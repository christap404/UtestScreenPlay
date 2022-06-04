package co.com.choucair.certification.utest.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class StepOne {
    public static final Target INPUT_FIRTS_NAME = Target.the("input first name").
            located(By.id("firstName"));

    public static final Target INPUT_LAST_NAME = Target.the("input last name").
            located(By.id("lastName"));

    public static final Target INPUT_EMAIL = Target.the("input email").
            located(By.id("email"));

    public static final Target LIST_MONTH = Target.the("list month").
            located(By.id("birthMonth"));

    public static final Target SELECT_MONTH = Target.the("select month").
            locatedBy("//option[contains(text(),'{0}')]");

    public static final Target LIST_DAY = Target.the("list day").
            located(By.id("birthDay"));

    public static final Target SELECT_DAY = Target.the("select day").
            locatedBy("(//option[contains(text(),'{0}')])[1]");

    public static final Target LIST_YEAR= Target.the("list year").
            located(By.id("birthYear"));

    public static final Target SELECT_YEAR= Target.the("select year").
            locatedBy("//option[contains(text(),'{0}')]");

    public static final Target LIST_LANGUAGE= Target.the("list language").
            located(By.xpath("//input[@role='combobox']"));

    public static final Target SELECT_LANGUAGE= Target.the("select language").
            locatedBy("//div[contains(text(),'{0}')]");

    public static final Target BUTTON_NEXT= Target.the("button next").
            located(By.xpath("//a[@role='button']"));


}
