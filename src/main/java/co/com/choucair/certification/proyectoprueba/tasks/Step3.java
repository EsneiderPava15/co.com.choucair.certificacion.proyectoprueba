package co.com.choucair.certification.proyectoprueba.tasks;

import co.com.choucair.certification.proyectoprueba.userinterface.UtestStep3page;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;
import org.openqa.selenium.Keys;

public class Step3  implements Task {
    public static Performable Machine() {
        return Tasks.instrumented(Step3.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Click.on(UtestStep3page.Value_MOBILE),
                Enter.theValue("Samsung").into(UtestStep3page.INPUT_MOBILE),
                SendKeys.of(Keys.ENTER).into(UtestStep3page.INPUT_MOBILE),

                Click.on(UtestStep3page.Value_MODEL),
                Enter.theValue("galaxy a23").into(UtestStep3page.INPUT_MODEL),
                SendKeys.of(Keys.ENTER).into(UtestStep3page.INPUT_MODEL),

                Click.on(UtestStep3page.Value_SYSTEM),
                Enter.theValue("Android 12").into(UtestStep3page.INPUT_SYSTEM),
                SendKeys.of(Keys.ENTER).into(UtestStep3page.INPUT_SYSTEM),

                Click.on(UtestStep3page.BUTTON_END));

    }
}
