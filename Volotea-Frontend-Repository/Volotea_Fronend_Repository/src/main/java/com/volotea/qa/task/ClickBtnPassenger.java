package com.volotea.qa.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.volotea.qa.userinterfaces.Passanger.CLICK_IN_PASSANGER;

public class ClickBtnPassenger implements Task {
    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Click.on(CLICK_IN_PASSANGER));
    }
    public static ClickBtnPassenger clickBtnPassenger(){
        return Tasks.instrumented(ClickBtnPassenger.class);
    }
}

