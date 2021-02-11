package com.bancolombia.utest.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public final class GeneralOptions {

  public static final Target NEXT_STEP =
      Target.the("Button to go to the next step").locatedBy("//span[contains (text(), 'Next')]");
}
