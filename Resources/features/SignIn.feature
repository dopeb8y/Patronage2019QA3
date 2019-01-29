Feature: As a user I want to be able to sign in on automationpractice site

  Scenario: Check sign in functionality if user uses registered before correct username and password
    Given I open automationpractice Webpage
    When I click on Sign in Navigation Menu
    And I fill up Email address with validate phrase "qwerty@op.pl"
    And I fill up Password with validate phrase "qwerty"
    And I click on Sign in button
    Then I see My Account page

