package com.sqa.certification.plazavea.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class ValidateCart implements Question<String> {
    private Target target;

    public ValidateCart(Target target){
        this.target = target;
    }

    @Override
    public String answeredBy(Actor actor) {
        WaitUntil.the(target, WebElementStateMatchers.isVisible()).forNoMoreThan(40).seconds();
        return target.resolveFor(actor).getText();
    }

    public static ValidateCart inRecord(Target target) {
        return new ValidateCart(target);
    }
}
