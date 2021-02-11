package com.bancolombia.utest.tasks;

import static com.bancolombia.utest.userinterfaces.LocationInformation.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.bancolombia.utest.models.Location;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

public class CompleteLocationInformation implements Task {

  private Location location;

  public CompleteLocationInformation(Location location) {
    this.location = location;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        Enter.theValue(location.getCity()).into(CITY),
        Enter.theValue(location.getZip()).into(ZIP),
        Click.on(COUNTRY),
        Enter.theValue(location.getCountry()).into(COUNTRY_TEXT).thenHit(Keys.TAB));
  }

  public static CompleteLocationInformation withTheFollowingData(Location location) {
    return instrumented(CompleteLocationInformation.class, location);
  }
}
