package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegisterModuloCuatro {

    public static final Target CONTRASENA = Target.the("").located(By.xpath("//*[@id=password]"));
    public static final Target CONFIRMAR_CONTRASENA = Target.the("").located(By.xpath("//*[@id=confirmPassword]"));
    public static final Target CONFIRMAR_PRIMERO = Target.the("").located(By.xpath("//*[@class=\"checkmark signup-consent__checkbox signup-consent__checkbox--highlight\"]"));
    public static final Target CONFIRMAR_SEGUNDO = Target.the("").located(By.xpath("//*[@class=\"checkmark signup-consent__checkbox error\"][1]"));
    public static final Target CONFIRMAR_TERCERO = Target.the("").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target CONFIRMAR_REGISTRO = Target.the("").located(By.xpath("//*[@class=\"btn btn-blue\"]"));
    public static final Target MENSAJE_ESPERADO = Target.the("").locatedBy("//strong[text()='Welcome to the world's largest community of freelance software testers!']");
}
