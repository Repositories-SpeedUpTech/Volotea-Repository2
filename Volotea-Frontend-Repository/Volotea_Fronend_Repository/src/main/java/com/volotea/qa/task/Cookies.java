package com.volotea.qa.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.volotea.qa.userinterfaces.Passanger.CLOSE_COOKIES;

public class Cookies implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(CLOSE_COOKIES));
    }
    public static Cookies cookies(){
        return Tasks.instrumented(Cookies.class);
    }
}
