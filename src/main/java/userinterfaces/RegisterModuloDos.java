package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegisterModuloDos {

    public static final Target TXT_CITY =
            Target.the("Ingresar la ciudad donde reside el usuario").located(By.xpath("//*[@id=city]"));
    public static final Target TXT_ZIP =
            Target.the("Ingreso el codigo postal de la ciudad").located(By.xpath("//*[@id=zip]"));
    public static final Target BTN_COUNTRY =
            Target.the("Ingreso el páis donde vive el usuario").located(By.xpath("//*[@class=\"btn btn-default form-control ui-select-toggle\"]"));
    public static final Target BTN_DEVICES =
            Target.the("Pasar al tercer modulo").located(By.xpath("//*[@class=\"btn btn-blue pull-right\"]"));
}
