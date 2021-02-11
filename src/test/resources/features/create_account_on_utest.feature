#Autor: Jisela Londoño Herrera

Feature: Create an account at UTest System
  As a user of the UTest system
  I want to create an account
  To interact with the services of the page

  Scenario: Create an account at UTest
    Given that Jisela wants create an account at UTest
    When she indicates "correct information" of her personal data and devices
    And she specifies the password associated with the new account
    Then she should see the following message: "Welcome to the world's largest community of freelance software testers!"