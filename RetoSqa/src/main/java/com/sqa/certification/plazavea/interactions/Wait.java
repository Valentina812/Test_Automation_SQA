package com.sqa.certification.plazavea.interactions;

import net.serenitybdd.core.time.InternalSystemClock;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

public class Wait implements Interaction {
    private int seconds;
    public Wait(int seconds){this.seconds=seconds;}
    public static Wait seconds(int seconds){return Tasks.instrumented(Wait.class, seconds);}

    @Override
    public <T extends Actor> void performAs(T actor) { new InternalSystemClock().pauseFor((seconds* 1000));}

}