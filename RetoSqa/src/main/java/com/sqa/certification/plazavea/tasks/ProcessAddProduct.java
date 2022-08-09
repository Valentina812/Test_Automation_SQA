package com.sqa.certification.plazavea.tasks;

import com.sqa.certification.plazavea.interactions.Wait;
import com.sqa.certification.plazavea.models.User;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;
import java.util.List;
import static com.sqa.certification.plazavea.userinterfaces.AddProductElements.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;


public class ProcessAddProduct implements Task {

    private String consultOne;
    private String email;

    public ProcessAddProduct(List<User> data) {
        this.consultOne = data.get(0).getConsultOne();
        this.email = data.get(0).getEmail();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(TXT_SEARCH_PRODUCT,isEnabled()).forNoMoreThan(60).seconds(),
                Click.on(TXT_SEARCH_PRODUCT),
                Enter.theValue(consultOne).into(TXT_SEARCH_PRODUCT ).thenHit(Keys.ENTER),
                Click.on(SLC_PRODUCT),
                Wait.seconds(2),
                Click.on(BTN_ADD_PRODUCT),
                Click.on(SLC_CART),
                Click.on(BTN_CONTINUE),
                Click.on(BTN_CONTINUE_TWO),
                WaitUntil.the(TXT_EMAIL,isEnabled()).forNoMoreThan(60).seconds(),
                Enter.theValue(email).into(TXT_EMAIL),
                Click.on(SLC_ACCEPT_TERMS),
                Click.on(BTN_CONTINUE_THREE));

    }
    public static ProcessAddProduct ofPlazaVea(List<User> data) {
        return Tasks.instrumented(ProcessAddProduct.class, data);
    }
}
