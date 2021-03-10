package co.com.choucair.certification.reto.tasks;

import co.com.choucair.certification.reto.userinterface.LlenarRegistro2;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

public class Registro2 implements Task {

    private String strCiudad;
    private String strCoPostal;
    private String strPais;

    public Registro2 (String strCiudad,String strCoPostal, String strPais){
        this.strCiudad = strCiudad;
        this.strCoPostal = strCoPostal;
        this.strPais = strPais;
    }

    public static Registro2 the2(String strCiudad, String strCoPostal, String strPais) {
        return Tasks.instrumented(Registro2.class,strCiudad,strCoPostal,strPais);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(strCiudad).into(LlenarRegistro2.CIUDAD),
                Hit.the(Keys.ARROW_DOWN).into(LlenarRegistro2.CIUDAD),
                Click.on(LlenarRegistro2.BOTON_PAIS),
                Enter.theValue(strPais).into(LlenarRegistro2.PAIS),
                Hit.the(Keys.ENTER).into(LlenarRegistro2.PAIS),
                Enter.theValue(strCoPostal).into(LlenarRegistro2.CODIGO_POSTAL),
                Click.on(LlenarRegistro2.BOTON_NEXT2)
        );

    }
}
