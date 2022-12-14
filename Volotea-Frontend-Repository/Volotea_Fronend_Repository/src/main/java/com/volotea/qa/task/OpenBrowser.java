package com.volotea.qa.task;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenBrowser implements Task {

    @Override
    public <T extends Actor> void performAs(T actor){

        actor.attemptsTo(Open.url("https://www.volotea.com/es/"));
    }
    public static OpenBrowser browser(){
        return Tasks.instrumented(OpenBrowser.class);
    }
}

