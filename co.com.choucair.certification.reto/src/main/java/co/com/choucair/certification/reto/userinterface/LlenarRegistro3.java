package co.com.choucair.certification.reto.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LlenarRegistro3 {
    public static final Target COMP = Target.the("presiona la caja de selección").located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/div[1]/span/span[2]"));
    public static final Target COMPUTER = Target.the("selecciona el tipo de sistema operativo").located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/input[1]"));
    public static final Target VERS = Target.the("presiona la caja de selección").located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div/div[1]/span/span[1]"));
    public static final Target VERSION = Target.the("selecciona la version del sistema operativo").located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div/input[1]"));
    public static final Target LENG = Target.the("presiona la caja de selección").located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/div[1]/span"));
    public static final Target LENGUAJE = Target.the("selecciona el lenguaje").located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/input[1]"));
    public static final Target BOTON_NEXT3 = Target.the("presiona el boton").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a/span"));
}
