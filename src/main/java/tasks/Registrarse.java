package tasks;

import models.Registro;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static userinterfaces.RegisterModuloCuatro.*;
import static userinterfaces.RegisterModuloDos.*;
import static userinterfaces.RegisterModuloTres.*;
import static userinterfaces.RegistroModuloUno.*;

public class Registrarse implements Task {

    private Registro formulario;

    public Registrarse(Registro formulario) {
        this.formulario = formulario;
    }

    public static Registrarse enLaPaginaConMis(Registro formulario) {
        return Tasks.instrumented(Registrarse.class, formulario);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(formulario.getFirstName()).into(TXT_FIRSTNAME),
                Enter.theValue(formulario.getLastName()).into(TXT_LASTNAME),
                Enter.theValue(formulario.getEmail()).into(TXT_EMAIL),
                Enter.theValue(formulario.getMonth()).into(BUTTON_MONTH),
                Enter.theValue(formulario.getDay()).into(BUTTON_DAY),
                Enter.theValue(formulario.getYear()).into(BUTTON_YEAR),
                Enter.theValue(formulario.getLanguages()).into(TXT_LANGUAGES),
                Click.on(BTN_LOCATION),
                Enter.theValue(formulario.getCity()).into(TXT_CITY),
                Enter.theValue(formulario.getPostalCode()).into(TXT_ZIP),
                Enter.theValue(formulario.getCountry()).into(BTN_COUNTRY),
                Click.on(BTN_DEVICES),
                Enter.theValue(formulario.getMobileDevice()).into(MOBILE_DEVICE),
                Enter.theValue(formulario.getModel()).into(BTN_MODELDEVICE),
                Click.on(BTN_LASTSTEP),
                Enter.theValue(formulario.getPassword()).into(CONTRASENA),
                Enter.theValue(formulario.getConfirmPassword()).into(CONFIRMAR_CONTRASENA),
                Click.on(CONFIRMAR_PRIMERO),
                Click.on(CONFIRMAR_SEGUNDO),
                Click.on(CONFIRMAR_TERCERO),
                Click.on(CONFIRMAR_REGISTRO));

    }
}
