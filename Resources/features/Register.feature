Feature: As a user I want to be able to register account on automationpractice site

  Scenario: Check create an account functionality if user uses not registered before correct email address
    Given I open automationpractice page
    When I click on Sign in on Navigation Menu
    And I fill up Email address with correct not registered phrase "asd@wp.pl"
    And I click on Create an account button
    Then I see Create an acount page

  Scenario: Check error pop-up when user uses no email address to create an account
    Given I open automationpractice page
    When I click on Sign in on Navigation Menu
    And I click on Create an account button
    Then I see that error pop-up about wrong email address is visible

  Scenario: Check error pop-up when user uses invalid email address to create an account
    Given I open automationpractice page
    When I click on Sign in on Navigation Menu
    And I fill up Email address with "asdwppl"
    And I click on Create an account button
    Then I see that error pop-up about wrong email address is visible

  Scenario: Check error pop-up when user uses valid email address which was registered before to create an account
    Given I open automationpractice page
    When I click on Sign in on Navigation Menu
    And I fill up Email address with "qwerty@op.pl"
    And I click on Create an account button
    Then I see that error pop-up about email address already registered is visible

  Scenario: Check create an account functionality if user uses not registered before correct email address and fulfill all required fields
    Given I open automationpractice page
    When I click on Sign in on Navigation Menu
    And I fill up Email address with correct not registered phrase
    And I click on Create an account button
    And I fill up First name with "John"
    And I fill up Last name with "Kowalski"
    And I fill up Password with "qwerty"
    And I fill up Address with "example address"
    And I fill up City with "London"
    And I choose State
    And I fill up Zip Code with "12345"
    And I fill up Mobile phone with "123456789"
    And I click on register button
    Then I see my account view

  Scenario: Check create an account functionality if user uses not registered before correct email address without filling fields
    Given I open automationpractice page
    When I click on Sign in on Navigation Menu
    And I fill up Email address with correct not registered phrase
    And I click on Create an account button
    And I click on register button
    Then I see many error pop-ups