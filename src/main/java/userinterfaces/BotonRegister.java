package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BotonRegister {

    public static final Target BTN_REGIS =
            Target.the("Boton para iniciar el proceso").located(By.xpath("//*[@class=\"ng-binding btn btn-unauth margin-bottom-100\"]"));


}
