@Smoke
Feature: Login into account

  Scenario: Valid username and password
    Given User launch application
    Then User enter correct username and password
    And Clicked on Login Button
    Then User login into application