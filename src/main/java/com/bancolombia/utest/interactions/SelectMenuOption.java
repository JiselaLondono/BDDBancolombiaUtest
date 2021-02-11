package com.bancolombia.utest.interactions;

import static com.bancolombia.utest.userinterfaces.UtestMenu.MENU_OPTION;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

public class SelectMenuOption implements Interaction {

  private String menuOption;

  public SelectMenuOption(String menuOption) {
    this.menuOption = menuOption;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Click.on(MENU_OPTION.of(menuOption)));
  }

  public static SelectMenuOption of(String menuOption) {
    return instrumented(SelectMenuOption.class, menuOption);
  }
}
