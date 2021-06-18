package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterfaces.RegisterModuloCuatro;

public class Revisar implements Question<Boolean> {

    private String mensaje;

    public Revisar(String mensaje) {
        this.mensaje = mensaje;
    }

    public static Revisar RegistroCorrecto(String mensaje) {
        return new Revisar(mensaje);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String MensajeEsperado = Text.of(RegisterModuloCuatro.MENSAJE_ESPERADO).viewedBy(actor).asString();
        return mensaje.equals(MensajeEsperado);
    }
}
