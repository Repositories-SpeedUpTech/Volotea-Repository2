package com.volotea.qa.stepdefinition;

import com.volotea.qa.models.Destination;
import com.volotea.qa.models.Origin;
import com.volotea.qa.task.CityOfDestination;
import com.volotea.qa.task.CityOfOrigin;
import com.volotea.qa.task.Cookies;
import com.volotea.qa.task.OpenBrowser;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class OrigenStepDefinition {
    @Managed
    private static WebDriver myBrowser;

    @Before
    public static void setUpOnstage() {
        setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(myBrowser)));
        theActorCalled("Ismael Carvajal");
    }

    @Given("^click on the source field$")
    public void clickOnTheSourceField() {
        OnStage.theActorInTheSpotlight().wasAbleTo(OpenBrowser.browser());

    }

    @When("^to close cookies$")
    public void toCloseCookies() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Cookies.cookies());
    }

    @When("^the user enter '(.*)' and the user enter '(.*)'$")
    public void theUserEnterAndTheUserEnter(List<Origin>cityOrigin, List<Destination>cityDestination) {
        OnStage.theActorInTheSpotlight().wasAbleTo(CityOfOrigin.cityOfOrigin(cityOrigin.get(0)));
        OnStage.theActorInTheSpotlight().wasAbleTo(CityOfDestination.cityDestination(cityDestination.get(0)));
    }

    @Then("^the user should see the name '(.*)'$")
    public void theUserShouldSeeTheName(String cityOrigin) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(com.volotea.qa.question.Destination.message(), org.hamcrest.CoreMatchers.is(cityOrigin)));
    }
}




