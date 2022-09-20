package com.volotea.qa.stepdefinition;

//import com.volotea.qa.question.Passanger;
import com.volotea.qa.task.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
//import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

//import static com.volotea.qa.userinterfaces.Passanger.NUMBER_VISIBLE;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class PassengerStepDefinition {
    @Managed
    private WebDriver myBrowser;

    @Before
    public void setUpOnstage() {
        setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(myBrowser)));
        theActorCalled("Ismael Carvajal");

    }

    @Given("^the user is on the volotea page$")
    public void theUserIsOnTheVoloteaPage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(OpenBrowser.browser());
    }

    @When("^click on the passenger '(\\d+)','(\\d+)','(\\d+)'$")
    public void clickOnThePassenger(int arg1, int arg2, int arg3) {
        OnStage.theActorInTheSpotlight().attemptsTo(ClickBtnPassenger.clickBtnPassenger());
        for (int i = 0; i < arg1; i++) {
            OnStage.theActorInTheSpotlight().attemptsTo(AddPassenger.addPassenger());
        }
        for (int i = 0; i < arg2; i++) {
            OnStage.theActorInTheSpotlight().attemptsTo(SelectPassenger.selectPassenger());
        }
        for (int i = 0; i < arg3 ; i++) {
            OnStage.theActorInTheSpotlight().attemptsTo(SelectBabys.selectBabys());
        }
    }
    @Then("^check that the number of passenger$")
    public void checkThatTheNumberOfPassenger() {
       /* System.out.println(NUMBER_VISIBLE);
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Passanger.passanger(), org.hamcrest.CoreMatchers.is(arg1)));*/
    }
}

