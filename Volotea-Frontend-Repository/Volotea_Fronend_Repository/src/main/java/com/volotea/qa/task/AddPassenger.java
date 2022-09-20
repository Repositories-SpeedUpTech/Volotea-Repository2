package com.volotea.qa.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.volotea.qa.userinterfaces.Passanger.SELECT_PASSANGER;

public class AddPassenger implements Task {

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Click.on(SELECT_PASSANGER));
    }
    public static AddPassenger addPassenger(){
        return Tasks.instrumented(AddPassenger.class);
    }
}
