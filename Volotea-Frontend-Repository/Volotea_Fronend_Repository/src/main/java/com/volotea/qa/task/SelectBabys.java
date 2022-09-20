package com.volotea.qa.task;

import com.volotea.qa.interactions.WaitInteraction;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.volotea.qa.userinterfaces.Passanger.SELECT_BABY;

public class SelectBabys implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SELECT_BABY), WaitInteraction.waitFor(7));
    }

    public static SelectBabys selectBabys() {
        return Tasks.instrumented(SelectBabys.class);
    }
}

