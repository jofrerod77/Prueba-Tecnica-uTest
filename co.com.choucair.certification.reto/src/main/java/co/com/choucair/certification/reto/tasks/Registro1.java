package co.com.choucair.certification.reto.tasks;

import co.com.choucair.certification.reto.userinterface.LlenarRegistro1;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class Registro1 implements Task {

    private String strNombre;
    private String strApellido;
    private String strCorreo;
    private String strMes;
    private String strDia;
    private String strYear;
    /*
    private String strSiOperativo;
    private String strVersion;
    private String strLenguaje;
    private String strMovil;
    private String strModelo;
    private String strSiOperativo1;
    private String strPassword;
    private String strPassConfirm;*/


    public Registro1(String strNombre, String strApellido, String strCorreo, String strMes, String strDia, String strYear){
        this.strNombre = strNombre;
        this.strApellido = strApellido;
        this.strCorreo = strCorreo;
        this.strMes = strMes;
        this.strYear = strYear;
        this.strDia = strDia;
    }

    public static Registro1 the(String strNombre, String strApellido, String strCorreo, String strMes, String strDia, String strYear){
        return Tasks.instrumented(Registro1.class,strNombre,strApellido,strCorreo,strMes,strDia,strYear);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(strNombre).into(LlenarRegistro1.NOMBRE),
                Enter.theValue(strApellido).into(LlenarRegistro1.APELLIDO),
                Enter.theValue(strCorreo).into(LlenarRegistro1.CORREO),
                SelectFromOptions.byVisibleText(strMes).from(LlenarRegistro1.MES),
                SelectFromOptions.byVisibleText(strDia).from(LlenarRegistro1.DIA),
                SelectFromOptions.byVisibleText(strYear).from(LlenarRegistro1.YEAR),
                Click.on(LlenarRegistro1.BOTON_NEXT1));
    }
}
