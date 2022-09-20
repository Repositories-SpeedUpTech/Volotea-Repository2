package com.volotea.qa.task;

import com.volotea.qa.models.Destination;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.volotea.qa.userinterfaces.EnterCities.DESTINATION;

public class CityOfDestination implements Task {
    private Destination destination;

    public CityOfDestination(Destination destination) {
        this.destination = destination;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(DESTINATION));
        actor.attemptsTo(Enter.theValue(destination.getDestinationCity()).into(DESTINATION));
    }
    public static CityOfDestination cityDestination(Destination destination){
        return new CityOfDestination(destination);
    }
}
