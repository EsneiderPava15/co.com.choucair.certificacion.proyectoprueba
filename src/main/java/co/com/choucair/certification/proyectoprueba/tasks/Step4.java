package co.com.choucair.certification.proyectoprueba.tasks;

import co.com.choucair.certification.proyectoprueba.userinterface.UtestStep4page;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Step4 implements Task {
    public static Performable Keyword() {
        return Tasks.instrumented(Step4.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("Pavaserpa//2015#").into(UtestStep4page.PASSWORD),
                Enter.theValue("Pavaserpa//2015#").into(UtestStep4page.CONFIRM_PASSWORD),
                Click.on(UtestStep4page.INPUT_TERMS),
                Click.on(UtestStep4page.PRIVACY),
                Click.on(UtestStep4page.BUTTON_FINAL));

    }
}
