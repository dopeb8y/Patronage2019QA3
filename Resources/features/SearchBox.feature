Feature: As a user I want to be able to search something in searchbox on automationpractice site

  Scenario: Search in searchbox item that exist in shop
    Given User is on AutomationPractice page
    When I search with phrase "top"
    And I click on search button
    Then I can see results on page

  Scenario: Check error pop-up when user search with empty box
    Given User is on AutomationPractice page
    When I click on search button
    Then I see that error pop-up about entering keyword is visible

  Scenario: Check error pop-up when user search with item that do not exist in shop
    Given User is on AutomationPractice page
    When I search with phrase "a"
    And I click on search button
    Then I see that an error pop-up about no results is visible

  Scenario: Check if searching works when user press enter
    Given User is on AutomationPractice page
    When I search with phrase "dress"
    And I click on enter button
    Then I see that search engine works using enter button