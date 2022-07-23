package co.com.choucair.certification.proyectoprueba.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

;

public class UtestStep3page {

    public static final Target Value_MOBILE = Target.the("We will select our mobile device")
            .located(By.xpath("//div[@aria-label='Select Brand']"));

    public static final Target INPUT_MOBILE = Target.the("We will select our mobile device")
            .located(By.xpath("//input[@placeholder='Select Brand']"));

    public static final Target Value_MODEL =Target.the("We will select the model of our mobile")
            .located(By.xpath("//div[@aria-label='Select a Model']"));

    public static final Target INPUT_MODEL =Target.the("We will select the model of our mobile")
            .located(By.xpath("//input[@placeholder='Select a Model']"));

    public static final Target Value_SYSTEM =Target.the("We will select the operating system of our mobile")
            .located(By.xpath("//div[@aria-label='Select OS']"));

    public static final Target INPUT_SYSTEM =Target.the("We will select the operating system of our mobile")
            .located(By.xpath("//input[@placeholder='Select OS']"));

    public static final Target BUTTON_END =Target.the("next form")
            .located(By.cssSelector("#regs_container > div > div:nth-child(2) > div > div.ui-view > div > div:nth-child(2) > div > a"));


}
