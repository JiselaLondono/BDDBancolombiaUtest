package com.bancolombia.utest.interactions;

import static com.bancolombia.utest.userinterfaces.UserInformation.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class SelectDate implements Interaction {

  private String month;
  private String day;
  private String year;

  public SelectDate(String date) {
    String[] splitDate = date.split(" ");
    this.month = splitDate[0];
    this.day = splitDate[1];
    this.year = splitDate[2];
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        SelectFromOptions.byVisibleText(month).from(BIRTH_MONTH),
        SelectFromOptions.byVisibleText(day).from(BIRTH_DAY),
        SelectFromOptions.byVisibleText(year).from(BIRTH_YEAR));
  }

  public static SelectDate indicatedIn(String date) {
    return instrumented(SelectDate.class, date);
  }
}
