package com.sqa.certification.plazavea.stepdefinitions;

import com.sqa.certification.plazavea.exceptions.ErrorException;
import com.sqa.certification.plazavea.models.User;
import com.sqa.certification.plazavea.questions.ValidateCart;
import com.sqa.certification.plazavea.tasks.ProcessAddProduct;
import com.sqa.certification.plazavea.utils.Messages;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;
import java.util.List;
import static com.sqa.certification.plazavea.userinterfaces.AddProductElements.TXT_VALIDATE_SHOPPING;
import static com.sqa.certification.plazavea.utils.Constants.TXT_TITLE_RECORD;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AddProductStepDefinitions {

    @Managed
    WebDriver driver;

    @Before
    public void setUp(){
        OnStage.setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(driver)));
        OnStage.theActorCalled("user");
    }
    @Given("^The user enters the page plaza Vea$")
    public void theUserEntersThePagePlazaVea() {
        theActorInTheSpotlight().wasAbleTo(Open.url("https://www.plazavea.com.pe/."));
    }

    @When("^User search for the product$")
    public void userSearchForTheProduct(List<User> data) {
        theActorInTheSpotlight().attemptsTo(ProcessAddProduct.ofPlazaVea(data));
    }

    @Then("^Validate the status of the product$")
    public void validateTheStatusOfTheProduct() {
        theActorInTheSpotlight().should(seeThat(ValidateCart.inRecord(TXT_VALIDATE_SHOPPING ), Matchers.containsString(TXT_TITLE_RECORD.getValue())).orComplainWith(ErrorException.class, Messages.MSG_INCORRECT.getMsg()));
    }
}
