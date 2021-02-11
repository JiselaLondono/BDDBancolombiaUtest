package com.bancolombia.utest.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class User {

  private String firstName;
  private String lastName;
  private String email;
  private String dateOfBirth;
  private String language;

  public User(Map<String, String> userData) {
    this.firstName = userData.get("firstName");
    this.lastName = userData.get("lastName");
    this.email = userData.get("email");
    this.dateOfBirth = userData.get("dateOfBirth");
    this.language = userData.get("language");
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public static List<User> getUsers(List<Map<String, String>> userList) {
    List<User> users = new ArrayList<>();
    userList.forEach(user -> users.add(new User(user)));
    return users;
  }
}
