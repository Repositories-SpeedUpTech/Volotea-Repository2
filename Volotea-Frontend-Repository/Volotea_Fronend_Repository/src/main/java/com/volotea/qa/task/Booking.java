package com.volotea.qa.task;

import com.volotea.qa.interactions.ScrollDown;
import com.volotea.qa.interactions.WaitInteraction;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;


import static com.volotea.qa.userinterfaces.Booking.*;


public class Booking implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(DEPARTURE_DATE),WaitInteraction.waitFor(5));
        actor.attemptsTo(Click.on(SEARCH));
        actor.attemptsTo(Click.on(SEARCH_MONTH),WaitInteraction.waitFor(3));
        actor.attemptsTo(Click.on(SELECT_DEPARTURE_DATE));
        actor.attemptsTo(Click.on(SEARCH));
        actor.attemptsTo(Click.on(SEARCH_MONTH),WaitInteraction.waitFor(3));
        actor.attemptsTo(Click.on(RETURN_DATE), WaitInteraction.waitFor(3));
        actor.attemptsTo(Click.on(ENTER_FLIGHT));
        actor.attemptsTo(Click.on(SAVE_BUTTON));

    }
    public static Booking booking(){
        return Tasks.instrumented(Booking.class);
    }
}

