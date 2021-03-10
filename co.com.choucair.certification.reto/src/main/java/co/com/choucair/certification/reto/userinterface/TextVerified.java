package co.com.choucair.certification.reto.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TextVerified {
    public static final Target TEXT_VERIF = Target.the("texto de verificación").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[1]/div/div/h1/span[2]"));
}
