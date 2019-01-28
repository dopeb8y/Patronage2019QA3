Feature: As a user I want to be able to search something in searchbox on automationpractice site

  Scenario: Search in searchbox item that is in shop
    Given User is on AutomationPractice page
    When I search with phrase "top"
    And I click on search button
    Then I can see results on page

  Scenario: Check error pop-up when user search with empty box
    Given User is on AutomationPractice page
    When I click on search button
    Then I see that error pop-up about entering keyword is visible

  Scenario: Check error pop-up when user search with item that is not in shop
    Given User is on AutomationPractice page
    When I search with phrase "a"
    And I click on search button
    Then I see that an error pop-up about no results is visible