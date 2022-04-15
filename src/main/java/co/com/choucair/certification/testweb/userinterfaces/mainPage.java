package co.com.choucair.certification.testweb.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class mainPage {
    private  mainPage(){
        throw new IllegalStateException("Utility class");
    }

    public static final Target SECTION_INDUSTRIAS = Target.the("seccion industrias").
            located(By.xpath("(//div[@class='elementor-widget-container'])[20]"));

    public static final Target BUTTON_GO_TOP = Target.the("boton flecha").
            located(By.xpath("//a[@class='go-top show']"));

    public static final Target ACEPT_COCKIE = Target.the("aceptar cokies").
            located(By.xpath("//a[@id='cookie_action_close_header']"));

    public static final Target MAIN_TITLE = Target.the("titulo inicial").
            located(By.xpath("(//h2[@class='maintitle'])[2]"));

    public static final Target ROLL_BUTTON =Target.the("boton para bajar").
            located(By.xpath("(//a[@class='roll-button'])[2]"));
}
