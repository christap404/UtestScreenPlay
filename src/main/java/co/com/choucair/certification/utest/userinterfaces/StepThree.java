package co.com.choucair.certification.utest.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class StepThree {

    public static final Target INPUT_COMPUTER= Target.the("input computer").
            located(By.xpath("(//span[@aria-label='Select OS'])[1]"));

    public static final Target ENTER_COMPUTER= Target.the("enter computer").
            located(By.xpath("(//input[@placeholder='Select OS'])[1]"));

    public static final Target INPUT_VERSION= Target.the("input version").
            located(By.xpath("(//span[@aria-label='Select a Version'])"));

    public static final Target ENTER_VERSION= Target.the("enter version").
            located(By.xpath("(//input[@placeholder='Select a Version'])"));

    public static final Target INPUT_LANGUAGE= Target.the("input language").
            located(By.xpath("(//span[@aria-label='Select OS language'])"));

    public static final Target ENTER_LANGUAGE= Target.the("enter language").
            located(By.xpath("(//input[@placeholder='Select OS language'])"));

    public static final Target INPUT_MOBILE= Target.the("input mobile").
            located(By.xpath("(//div[@placeholder='Select Brand'])"));

    public static final Target ENTER_MOBILE= Target.the("enter mobile").
            located(By.xpath("(//input[@placeholder='Select Brand'])"));

    public static final Target INPUT_MODEL= Target.the("input model").
            located(By.xpath("(//div[@aria-label='Select a Model'])[1]"));

    public static final Target ENTER_MODEL= Target.the("enter model").
            located(By.xpath("(//input[@placeholder='Select a Model'])"));

    public static final Target INPUT_SYSTEM= Target.the("input system").
            located(By.xpath("(//span[@aria-label='Select OS'])[2]"));

    public static final Target ENTER_SYSTEM= Target.the("enter system").
            located(By.xpath("(//input[@placeholder='Select OS'])[2]"));

    public static final Target BUTTON_NEXT= Target.the("button next").
            located(By.xpath("//a[@role='button']"));

}
