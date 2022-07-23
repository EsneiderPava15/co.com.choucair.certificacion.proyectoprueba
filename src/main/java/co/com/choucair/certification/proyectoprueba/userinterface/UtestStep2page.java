package co.com.choucair.certification.proyectoprueba.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestStep2page {

    public static final Target INPUT_CITY = Target.the("What city you live")
            .located(By.xpath("//*[@id=\"city\"]"));

    public static final Target POSTAL_CODE =Target.the("Enter your zip code")
            .located(By.id("zip"));

    public static final Target country =Target.the("Select the country where you are")
            .located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));

    public static final Target select_country =Target.the("Select the country where you are")
            .located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]/span"));

    public static final Target BUTTON_NEXT = Target.the("Button that continues the registration form")
            .located(By.xpath("//div[@class='pull-right next-step']//a[@class='btn btn-blue pull-right']"));

}
