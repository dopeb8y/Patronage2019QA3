Feature: As a user I want to be able to sign in on automationpractice site

  Scenario: Check sign in functionality if user uses registered before correct email address and password
    Given I open automationpractice Webpage
    When I click on Sign in Navigation Menu
    And I fill up Email address with validate phrase "qwerty@op.pl"
    And I fill up Password with validate phrase "qwerty"
    And I click on Sign in button
    Then I see My Account page

  Scenario: Check error pop-up when user uses no email address and no password
    Given I open automationpractice Webpage
    When I click on Sign in Navigation Menu
    And I click on Sign in button
    Then I see that error pop-up about required email address is visible

  Scenario: Check error pop-up when user uses invalid email address and no password
    Given I open automationpractice Webpage
    When I click on Sign in Navigation Menu
    And I fill up Email address with phrase "123test"
    And I click on Sign in button
    Then I see that error pop-up about invalid email address is visible

  Scenario: Check error pop-up when user uses valid email address and no password
    Given I open automationpractice Webpage
    When I click on Sign in Navigation Menu
    And I fill up Email address with validate phrase "qwerty@op.pl"
    And I click on Sign in button
    Then I see that error pop-up about required password is visible

  Scenario: Check error pop-up when user uses not registered email address and password
    Given I open automationpractice Webpage
    When I click on Sign in Navigation Menu
    And I fill up Email address with validate phrase "qwey@op.pl"
    And I fill up Password with phrase "123test"
    And I click on Sign in button
    Then I see that error pop-up about failed authentication is visible