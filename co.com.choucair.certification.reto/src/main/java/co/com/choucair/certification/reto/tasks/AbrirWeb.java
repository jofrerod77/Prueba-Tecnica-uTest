package co.com.choucair.certification.reto.tasks;

import co.com.choucair.certification.reto.userinterface.UTestPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirWeb implements Task {
    private UTestPage uTestPage;

    public static AbrirWeb thePage() {
        return Tasks.instrumented(AbrirWeb.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(uTestPage));
    }
}
