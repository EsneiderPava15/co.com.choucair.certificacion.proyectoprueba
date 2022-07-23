package co.com.choucair.certification.proyectoprueba.tasks;

import co.com.choucair.certification.proyectoprueba.userinterface.UtestStep1Page;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;
import org.openqa.selenium.Keys;

public class Step1 implements Task {
    public static Performable registerUser() {
        return Tasks.instrumented(Step1.class);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(UtestStep1Page.LOGIN_REGISTER),
                Enter.theValue("Pedro").into(UtestStep1Page.INPUT_NAME),
                Enter.theValue("Castillo").into(UtestStep1Page.INPUT_SURMANE),
                Enter.theValue("pedrocastillo@gmail.com").into(UtestStep1Page.INPUT_EMAIL),
                Click.on(UtestStep1Page.Value_Month),
                Click.on(UtestStep1Page.Value_day),
                Click.on(UtestStep1Page.Value_year),
                Enter.theValue("Spanish").into(UtestStep1Page.INPUT_IDIOM),
                SendKeys.of(Keys.ENTER).into(UtestStep1Page.INPUT_IDIOM),
                Click.on(UtestStep1Page.BUTTON_NEXT)
                );

    }
}