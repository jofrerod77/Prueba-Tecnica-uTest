package co.com.choucair.certification.reto.stepdefinitions;

import co.com.choucair.certification.reto.model.TestData;
import co.com.choucair.certification.reto.questions.Answer;
import co.com.choucair.certification.reto.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class UTestStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Jofre wants to register in uTest$")
    public void thanJofreWantsToRegisterInUTest() {
        OnStage.theActorCalled("Jofre").wasAbleTo(AbrirWeb.thePage(), JoinToday.onThePage());
    }

    @When("^he fills out the form$")
    public void heFillsOutTheForm(List<TestData> testData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Registro1.the(testData.get(0).getStrNombre(),testData.get(0).getStrApellido(),
                              testData.get(0).getStrCorreo(),testData.get(0).getStrMes(),testData.get(0).getStrDia(),testData.get(0).getStrYear()),
                Registro2.the2(testData.get(0).getStrCiudad(),testData.get(0).getStrCoPostal(),testData.get(0).getStrPais()),
                Registro3.the3(testData.get(0).getStrSiOperativo(),testData.get(0).getStrVersion(),testData.get(0).getStrLenguaje()),
                Registro4.the4(testData.get(0).getStrPassword(),testData.get(0).getStrPassConfirm()));
    }

    @Then("^he is verified$")
    public void heIsVerified(List<TestData> testData) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(testData.get(0).getStrVerified())));
    }
}
