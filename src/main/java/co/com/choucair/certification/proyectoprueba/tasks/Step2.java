package co.com.choucair.certification.proyectoprueba.tasks;

import co.com.choucair.certification.proyectoprueba.userinterface.UtestStep2page;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;
import org.openqa.selenium.Keys;

public class Step2 implements Task {
    public static Performable Information() {
        return Tasks.instrumented(Step2.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("Bogota").into(UtestStep2page.INPUT_CITY),
                SendKeys.of(Keys.ARROW_DOWN).into(UtestStep2page.INPUT_CITY),
                SendKeys.of(Keys.ENTER).into(UtestStep2page.INPUT_CITY),
                Enter.theValue("111131").into(UtestStep2page.POSTAL_CODE),
                Click.on(UtestStep2page.select_country),
                Enter.theValue("Colombia").into(UtestStep2page.country),
                SendKeys.of(Keys.ENTER).into(UtestStep2page.country),
                Click.on(UtestStep2page.BUTTON_NEXT)
        );

    }
}
