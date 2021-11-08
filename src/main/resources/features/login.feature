@Smoke
Feature: Login into account

  Background:
    Given User launch Chrome browser

  Scenario: Valid username and password with Chrome browser
    Given User launch application
    Then User enter correct username and password
    And Clicked on Login Button
    Then User login into application