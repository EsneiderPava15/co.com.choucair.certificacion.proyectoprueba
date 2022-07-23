package co.com.choucair.certification.proyectoprueba.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestStep4page {

    public static final Target PASSWORD = Target.the("Create your uTest password")
            .located(By.xpath("//*[@id='password']"));

    public static final Target CONFIRM_PASSWORD =Target.the("Confirm password")
            .located(By.xpath("//*[@id='confirmPassword']"));

    public static final Target INPUT_TERMS =Target.the("i have read and accept the Utest terms of use and the Utest Guidelines")
            .located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));

    public static final Target PRIVACY =Target.the("I accept the terms privacy and security policies")
            .located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[6]"));

    public static final Target BUTTON_FINAL =Target.the("Send form")
            .located(By.cssSelector("#laddaBtn"));

}
