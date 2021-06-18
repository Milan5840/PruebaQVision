package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import models.Registro;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import questions.Revisar;
import tasks.AbrirURL;
import tasks.Registrarse;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class RunnerStepDefinitions {

    @Given("^Cuando (.*) este en la plataforma ire a registrarme$")
    public void cuando_Santiago_este_en_la_plataforma_ire_a_registrarme(String Santiago) {
        theActorCalled(Santiago).wasAbleTo(AbrirURL.PaginaDeUTest());
    }

    @When("^estemos en el modulo (\\d+) ingresaremos los siguientes valores$")
    public void estemosEnElModuloIngresaremosLosSiguientesValores(List<Registro> formulario) {
       OnStage.theActorInTheSpotlight().attemptsTo(Registrarse.enLaPaginaConMis(formulario.get(0)));
    }

    @Then("^Debera ver el mensaje 'Welcome to the world's largest community of freelance software testers!'$")
    public void deberaVerElMensajeWelcomeToTheWorldSLargestCommunityOfFreelanceSoftwareTesters(String mensaje) {
      OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Revisar.RegistroCorrecto(mensaje)));
    }
}
