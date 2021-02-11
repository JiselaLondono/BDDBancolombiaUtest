package com.bancolombia.utest.tasks;

import static com.bancolombia.utest.userinterfaces.GeneralOptions.NEXT_STEP;
import static com.bancolombia.utest.userinterfaces.UserInformation.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.bancolombia.utest.interactions.SelectDate;
import com.bancolombia.utest.models.User;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

public class CompleteUserInformation implements Task {

  private User user;

  public CompleteUserInformation(User user) {
    this.user = user;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        Enter.theValue(user.getFirstName()).into(FIRST_NAME),
        Enter.theValue(user.getLastName()).into(LAST_NAME),
        Enter.theValue(user.getEmail()).into(EMAIL),
        SelectDate.indicatedIn(user.getDateOfBirth()),
        Enter.theValue(user.getLanguage()).into(LANGUAGE).thenHit(Keys.ENTER),
        Click.on(NEXT_STEP));
  }

  public static CompleteUserInformation withTheFollowingData(User user) {
    return instrumented(CompleteUserInformation.class, user);
  }
}
