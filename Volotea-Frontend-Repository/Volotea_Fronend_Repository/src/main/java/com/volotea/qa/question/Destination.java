package com.volotea.qa.question;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.volotea.qa.userinterfaces.EnterCities.VALIDATE_DESTINATION;

public class Destination implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the((VALIDATE_DESTINATION), WebElementStateMatchers.isVisible()));
        return Text.of(VALIDATE_DESTINATION).viewedBy(actor).asString();
    }

    public static Destination message(){
        return new Destination();
    }
}
