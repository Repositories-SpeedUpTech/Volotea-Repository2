package com.volotea.qa.stepdefinition;



import com.volotea.qa.models.Destination;
import com.volotea.qa.models.Origin;
import com.volotea.qa.task.*;
import com.volotea.qa.userinterfaces.Passanger;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;


public class BookigStepDefinition {

    @Managed
    private static WebDriver myBrowser;

    @Before
    public static void setUpOnstage() {
        setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(myBrowser)));
        theActorCalled("Ismael Carvajal");
    }

    @When("^the user select date and look for the flight$")
    public void theUserSelectDateAndLookForTheFlight() {
        OnStage.theActorInTheSpotlight().attemptsTo(Booking.booking());

    }

    @Then("^the use user can view flight details$")
    public void theUseUserCanViewFlightDetails() {

    }


}
