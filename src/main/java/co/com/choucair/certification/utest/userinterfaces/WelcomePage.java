package co.com.choucair.certification.utest.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class WelcomePage {


    public static final Target IMG_WELCOME= Target.the("img welcome").
            located(By.xpath("//div[@class='image-box-header']"));
}
