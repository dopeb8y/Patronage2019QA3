package com.Intive.Patronage.tests.steps;

import com.Intive.Patronage.tests.DriverFactory;
import com.Intive.Patronage.tests.pages.RegisterPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegisterSteps extends DriverFactory {

    RegisterPage register = new RegisterPage(driver);

    @Given("^I open automationpractice page$")
    public void iOpenAutomationpracticePage() {
        register.openAutomationPractUrl();
    }

    @When("^I click on Sign in on Navigation Menu$")
    public void iClickOnSignInOnNavigationMenu() {
        register.clickOnSignInNav();
    }

    @And("^I fill up Email address with correct not registered phrase \"([^\"]*)\"$")
    public void iFillUpEmailAddressWithCorrectNotRegisteredPhrase(String emailAddress) {
        register.fillEmail(emailAddress);
    }

    @And("^I click on Create an account button$")
    public void iClickOnCreateAnAccountButton() {
        register.clickOnSubmitCreateButton();
    }

    @Then("^I see Create an acount page$")
    public void iSeeCreateAnAcountPage() {
        register.iAmOnCreateAnAccountPage();
    }

    @Then("^I see that error pop-up about wrong email address is visible$")
    public void iSeeThatErrorPopUpAboutWrongEmailAddressIsVisible() {
        register.catchAlertPopUpTextInvalidEmail();
    }

    @And("^I fill up Email address with incorrect phrase \"([^\"]*)\"$")
    public void iFillUpEmailAddressWithIncorrectPhrase(String emailAddress) {
        register.fillEmail(emailAddress);
    }

    @Then("^I see that error pop-up about email address already registered is visible$")
    public void iSeeThatErrorPopUpAboutEmailAddressAlreadyRegisteredIsVisible() {
        register.catchAlertPopUpTextAlreadyRegisteredEmail();
    }
}
