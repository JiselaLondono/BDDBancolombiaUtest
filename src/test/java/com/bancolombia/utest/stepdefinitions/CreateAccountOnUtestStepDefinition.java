package com.bancolombia.utest.stepdefinitions;

import static com.bancolombia.utest.utils.Constants.CREATE_ACCOUNT;
import static com.bancolombia.utest.utils.Constants.UTEST_URL;
import static com.bancolombia.utest.utils.Generate.getUser;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import com.bancolombia.utest.interactions.SelectMenuOption;
import com.bancolombia.utest.models.User;
import com.bancolombia.utest.tasks.CompleteUserInformation;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.io.IOException;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class CreateAccountOnUtestStepDefinition {

  @Managed WebDriver herDriver;

  @Before
  public void setTheStage() {
    OnStage.setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(herDriver)));
  }

  @Given("that {word} wants create an account at UTest")
  public void thatJiselaWantsCreateAnAccountAtUTest(String actor) {
    theActorCalled(actor).wasAbleTo(Open.url(UTEST_URL), SelectMenuOption.of(CREATE_ACCOUNT));
  }

  @When("she indicates {string} of her personal data and devices")
  public void sheIndicatesOfHerPersonalDataAndDevices(String dataFilter) throws IOException {
    User user = getUser(dataFilter);
    theActorInTheSpotlight().attemptsTo(CompleteUserInformation.withTheFollowingData(user));
  }

  @When("she specifies the password associated with the new account")
  public void sheSpecifiesThePasswordAssociatedWithTheNewAccount() {}

  @Then("she should see the following message: {string}")
  public void sheShouldSeeTheFollowingMessage(String string) {}
}
