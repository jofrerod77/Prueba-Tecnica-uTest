package co.com.choucair.certification.reto.tasks;

import co.com.choucair.certification.reto.userinterface.LlenarRegistro3;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

public class Registro3 implements Task {
    private String strSiOperativo;
    private String strVersion;
    private String strLenguaje;

    public Registro3 (String strSiOperativo,String strVersion, String strLenguaje){
        this.strSiOperativo = strSiOperativo;
        this.strVersion = strVersion;
        this.strLenguaje = strLenguaje;
    }

    public static Registro3 the3(String strSiOperativo, String strVersion, String strLenguaje) {
        return Tasks.instrumented(Registro3.class,strSiOperativo,strVersion,strLenguaje);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LlenarRegistro3.COMP),
                Enter.theValue(strSiOperativo).into(LlenarRegistro3.COMPUTER),
                Hit.the(Keys.ENTER).into(LlenarRegistro3.COMPUTER),
                Click.on(LlenarRegistro3.VERS),
                Enter.theValue(strVersion).into(LlenarRegistro3.VERSION),
                Hit.the(Keys.ENTER).into(LlenarRegistro3.VERSION),
                Click.on(LlenarRegistro3.LENG),
                Enter.theValue(strLenguaje).into(LlenarRegistro3.LENGUAJE),
                Hit.the(Keys.ENTER).into(LlenarRegistro3.LENGUAJE),
                Click.on(LlenarRegistro3.BOTON_NEXT3)
        );
    }
}
