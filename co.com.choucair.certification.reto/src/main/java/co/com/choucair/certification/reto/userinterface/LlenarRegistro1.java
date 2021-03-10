package co.com.choucair.certification.reto.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LlenarRegistro1 {
    public static final Target NOMBRE = Target.the("ingresa el nombre").located(By.xpath("//*[@id=\"firstName\"]"));
    public static final Target APELLIDO = Target.the("ingresa el apellido").located(By.xpath("//*[@id=\"lastName\"]"));
    public static final Target CORREO = Target.the("ingresa el correo").located(By.xpath("//*[@id=\"email\"]"));
    public static final Target MES = Target.the("selecciona el mes").located(By.xpath("//*[@id=\"birthMonth\"]"));
    public static final Target DIA = Target.the("selecciona el dia").located(By.xpath("//*[@id=\"birthDay\"]"));
    public static final Target YEAR = Target.the("selecciona el año").located(By.xpath("//*[@id=\"birthYear\"]"));
    public static final Target BOTON_NEXT1 = Target.the("presiona el boton").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a"));
}
