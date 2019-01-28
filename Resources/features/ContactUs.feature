Feature: As a user i want to be able to contact Shop

  Scenario: Check error pop-up when user send empty form
    Given I open testAutomation Webpage
    When I click on Contact Us Navigation Menu
    And I Click on Send button
    Then I see that error pop-up is visible

  Scenario: Check error pop-up when user send empty message
    Given I open testAutomation Webpage
    When I click on Contact Us Navigation Menu
    And I fill up validate email address with phrase "xyz@gmail.com"
    And I Click on Send button
    Then I see that error pop-up about blank message is visible

  Scenario: Check error pop-up when user did not choose subject
    Given I open testAutomation Webpage
    When I click on Contact Us Navigation Menu
    And I fill up validate email address with phrase "xyz@gmail.com"
    And I fill up message with phrase "Testing message"
    And I Click on Send button
    Then I see that error pop-up about subject not chosen is visible

  Scenario: Check pop-up when user fill up validate email, message and have chosen subject heading
    Given I open testAutomation Webpage
    When I click on Contact Us Navigation Menu
    And I choose subject heading
    And I fill up validate email address with phrase "xyz@gmail.com"
    And I fill up message with phrase "Testing message"
    And I Click on Send button
    Then I see that success pop-up about successfully sent is visible