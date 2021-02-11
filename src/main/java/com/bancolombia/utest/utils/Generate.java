package com.bancolombia.utest.utils;

import com.bancolombia.utest.models.Location;
import com.bancolombia.utest.models.User;
import java.io.IOException;

public class Generate {

  public static User getUser(String filter) throws IOException {
    User user;
    try {
      user = User.getUsers(CsvUtilities.getDataTest("user", filter)).get(0);
    } catch (IOException e) {
      throw new IOException("There were problems reading the file", e);
    }
    return user;
  }

  public static Location getLocation(String filter) throws IOException {
    Location location;
    try {
      location = Location.getLocations(CsvUtilities.getDataTest("location", filter)).get(0);
    } catch (IOException e) {
      throw new IOException("There were problems reading the file", e);
    }
    return location;
  }
}
