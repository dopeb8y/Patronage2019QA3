Feature: As a user i want to be able to contact Shop

  Scenario: Check error pop-up when user send empty form
    Given I open testAutomation Webpage
    When I click on Contact Us Navigation Menu
    And I Click on Send button
    Then I see that error pop-up is visible
