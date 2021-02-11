package com.bancolombia.utest.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Location {

  private String city;
  private String zip;
  private String country;

  public Location(Map<String, String> locationData) {
    this.city = locationData.get("city");
    this.zip = locationData.get("zip");
    this.country = locationData.get("country");
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getZip() {
    return zip;
  }

  public void setZip(String zip) {
    this.zip = zip;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public static List<Location> getLocations(List<Map<String, String>> locationList) {
    List<Location> locations = new ArrayList<>();
    locationList.forEach(location -> locations.add(new Location(location)));
    return locations;
  }
}
