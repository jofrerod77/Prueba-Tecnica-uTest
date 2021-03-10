package co.com.choucair.certification.reto.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LlenarRegistro4 {
    public static final Target PASSWORD = Target.the("ingresa la contraseña").located(By.xpath("//*[@id=\"password\"]"));
    public static final Target PASS_CONFIRM = Target.the("confirma la contraseña").located(By.xpath("//*[@id=\"confirmPassword\"]"));
    public static final Target TERMS = Target.the("aceptar terminos y condiciones").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target TERM2 = Target.the("aceptar terminos y condiciones").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target BOTON_COMPLETE = Target.the("completando registro").located(By.xpath("//*[@id=\"laddaBtn\"]/span"));
}
