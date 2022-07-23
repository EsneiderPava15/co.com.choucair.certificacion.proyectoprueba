package co.com.choucair.certification.proyectoprueba.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class UtestStep1Page {

    public static final Target LOGIN_REGISTER = Target.the("button that shows us the form to login")
            .located(By.xpath("//a[@class=\"unauthenticated-nav-bar__sign-up\"]"));

    public static final Target INPUT_NAME =Target.the("enter your name here")
            .located(By.id("firstName"));

    public static final Target INPUT_SURMANE =Target.the("enter your surname here")
            .located(By.id("lastName"));

    public static final Target INPUT_EMAIL =Target.the("enter your email here")
            .located(By.id("email"));

    public static final Target Value_Month = Target.the("Select month of your birthday")
            .located(By.xpath("//select[@name='birthMonth']//option[text()='August']"));

    public static final Target Value_day = Target.the("Select your day of birthDay")
            .located(By.xpath("//select[@name='birthDay']//option[text()='1']"));

    public static final Target Value_year = Target.the("Select year of your birthYear")
            .located(By.xpath("//select[@name='birthYear']//option[text()='1989']"));

    public static final Target INPUT_IDIOM =Target.the("choose the lenguage with which you want to enter")
            .located(By.xpath("//*[@id='languages']/div[1]/input"));

    public static final Target BUTTON_NEXT = Target.the("Button that continues the registration form")
            .located(By.cssSelector("#regs_container > div > div:nth-child(2) > div > div.ui-view > div > form > div.form-group.col-xs-12.text-right > a"));



}
