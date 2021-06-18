package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegistroModuloUno {

    public static final Target TXT_FIRSTNAME =
            Target.the("Ingreso del primer nombre").located(By.xpath("//*[@id=firstName]"));
    public static final Target TXT_LASTNAME =
            Target.the("Ingreso del otro nombre").located(By.xpath("//*[@id=lastName]"));
    public static final Target TXT_EMAIL =
            Target.the("Ingreso del email").located(By.xpath("//*[@id=email]"));
    public static final Target BUTTON_MONTH =
            Target.the("Ingreso del mes de nacimiento").located(By.xpath("//*[@id=birthMonth]"));
    public static final Target BUTTON_DAY =
            Target.the("Ingreso del dia de nacimiento").located(By.xpath("//*[@id=birthDay]"));
    public static final Target BUTTON_YEAR =
            Target.the("Ingreso del año de nacimiento").located(By.xpath("//*[@id=birthYear]"));
    public static final Target TXT_LANGUAGES =
            Target.the("Ingreso los lenguajes que habla el usuario").located(By.xpath("//*[@id=languages]"));
    public static final Target BTN_LOCATION =
            Target.the("Pasar al siguiente modulo").located(By.xpath("//*[@class='btn btn-blue']"));
}
