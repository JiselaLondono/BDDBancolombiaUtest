package com.bancolombia.utest.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public final class UserInformation {

  public static final Target FIRST_NAME =
      Target.the("Text field to enter user first name").located(By.id("firstName"));
  public static final Target LAST_NAME =
      Target.the("Text field to enter user lastname").located(By.id("lastName"));
  public static final Target EMAIL =
      Target.the("Text field to enter user email").located(By.id("email"));
  public static final Target BIRTH_MONTH =
      Target.the("Selection list to choose user birth month").located(By.id("birthMonth"));
  public static final Target BIRTH_DAY =
      Target.the("Selection list to choose user birth day").located(By.id("birthDay"));
  public static final Target BIRTH_YEAR =
      Target.the("Selection list to choose user birth year").located(By.id("birthYear"));
  public static final Target LANGUAGE =
      Target.the("Text field to enter user language").locatedBy("//div[@id='languages']//input");

  public UserInformation() {}
}
