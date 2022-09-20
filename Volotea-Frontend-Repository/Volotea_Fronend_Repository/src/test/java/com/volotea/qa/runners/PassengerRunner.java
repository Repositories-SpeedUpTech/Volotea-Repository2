package com.volotea.qa.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "classpath:feature/passenger.feature"
        , glue = "classpath:com/volotea/qa/stepdefinition"
        , snippets = SnippetType.CAMELCASE)

public class PassengerRunner {

}
