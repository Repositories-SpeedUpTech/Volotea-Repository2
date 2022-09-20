package com.volotea.qa.task;


import com.volotea.qa.models.Origin;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

//import static com.volotea.qa.userinterfaces.EnterCities.FIRST_ORIGIN;
import static com.volotea.qa.userinterfaces.EnterCities.FIRST_ORIGIN;
import static com.volotea.qa.userinterfaces.EnterCities.ORIGIN;

public class CityOfOrigin implements Task {

    private Origin origin;

    public CityOfOrigin(Origin origin) {
        this.origin = origin;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        //actor.attemptsTo(Click.on(FIRST_ORIGIN));
        actor.attemptsTo(Click.on(ORIGIN));
        actor.attemptsTo(Enter.theValue(origin.getOriginCity()).into(ORIGIN));

    }

    public static CityOfOrigin cityOfOrigin (Origin origin){
        return new CityOfOrigin(origin);

    }
}
