@functionalityTest
Feature: Login functionality

  @SmokeTest
  Scenario: Login with HerokuApp
    Given User is on HerokuApp
    When User enters username and password
    Then User logged in successfully
   
