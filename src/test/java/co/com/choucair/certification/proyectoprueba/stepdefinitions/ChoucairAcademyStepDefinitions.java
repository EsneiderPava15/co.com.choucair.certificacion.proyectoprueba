package co.com.choucair.certification.proyectoprueba.stepdefinitions;

import co.com.choucair.certification.proyectoprueba.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


public class ChoucairAcademyStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^i want to register on the page$")
    public void iWantToRegisterOnThePage() {
        OnStage.theActorCalled("User").wasAbleTo(OpenUp.thePage());
    }


    @When("^the information has been completed with the basic data$")
    public void theInformationHasBeenCompletedWithTheBasicData() {
        OnStage.theActorInTheSpotlight().attemptsTo(Step1.registerUser(),  (Step2.Information()), (Step3.Machine()), (Step4.Keyword())

        );

    }

    @Then("^fill in the form and get Complete Setup$")
    public void theUserWasCreatedInTheSystem() {

    }
}
