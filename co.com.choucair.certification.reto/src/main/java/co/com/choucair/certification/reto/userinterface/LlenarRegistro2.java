package co.com.choucair.certification.reto.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LlenarRegistro2 {

    public static final Target CIUDAD = Target.the("ingresa la ciudad").located(By.xpath("//*[@id=\"city\"]"));
    public static final Target CODIGO_POSTAL = Target.the("ingresa el codigo postal").located(By.xpath("//*[@id=\"zip\"]"));
    public static final Target BOTON_PAIS = Target.the("selecciona la caja de pais").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]/span/span[2]"));
    public static final Target PAIS = Target.the("ingresa el pais").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));
    public static final Target BOTON_NEXT2 = Target.the("presiona el boton").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a/span"));
}
