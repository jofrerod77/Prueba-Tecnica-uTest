package co.com.choucair.certification.reto.tasks;

import co.com.choucair.certification.reto.userinterface.LlenarRegistro3;
import co.com.choucair.certification.reto.userinterface.LlenarRegistro4;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

public class Registro4 implements Task {

    private String strPassword;
    private String strPassConfirm;

    public Registro4(String strPassword,String strPassConfirm){
        this.strPassword = strPassword;
        this.strPassConfirm = strPassConfirm;
    }

    public static Registro4 the4(String strPassword, String strPassConfirm) {
        return Tasks.instrumented(Registro4.class,strPassword,strPassConfirm);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(strPassword).into(LlenarRegistro4.PASSWORD),
                Enter.theValue(strPassConfirm).into(LlenarRegistro4.PASS_CONFIRM),
                Click.on(LlenarRegistro4.TERMS),
                Click.on(LlenarRegistro4.TERM2),
                Click.on(LlenarRegistro4.BOTON_COMPLETE)
        );
    }
}
