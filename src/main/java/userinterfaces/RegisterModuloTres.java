package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegisterModuloTres {

    public static final Target MOBILE_DEVICE= Target.the("").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a"));
    public static final Target BTN_MODELDEVICE = Target.the("").located(By.xpath("//*[@class='form-control ui-select-search ng-pristine ng-valid ng-empty ng-touched)"));
    public static final Target BTN_LASTSTEP = Target.the("").located(By.xpath("//*[@class=\"btn btn-blue pull-right\"])"));
}
