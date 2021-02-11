package com.bancolombia.utest.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public final class LocationInformation {

  public static final Target CITY =
      Target.the("Text field to enter user city").located(By.id("city"));
  public static final Target ZIP = Target.the("Text field to enter user zip").located(By.id("zip"));
  public static final Target COUNTRY =
      Target.the("Text field to enter user country").locatedBy("//div[@name='countryId']");
  public static final Target COUNTRY_TEXT =
      Target.the("Text field to enter user country")
          .locatedBy("//div[@name='countryId']//input[@type='search']");

  public LocationInformation() {}
}
