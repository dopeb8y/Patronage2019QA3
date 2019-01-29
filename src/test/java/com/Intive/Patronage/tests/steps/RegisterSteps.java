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

    @And("^I fill up Email address with \"([^\"]*)\"$")
    public void iFillUpEmailAddressWith(String emailAddress) {
        register.fillEmail(emailAddress);
    }

    @Then("^I see that error pop-up about email address already registered is visible$")
    public void iSeeThatErrorPopUpAboutEmailAddressAlreadyRegisteredIsVisible() {
        register.catchAlertPopUpTextAlreadyRegisteredEmail();
    }

    @And("^I fill up Email address with correct not registered phrase$")
    public void iFillUpEmailAddressWithCorrectNotRegisteredPhrase() {
        register.generateRandomEmail();
    }

    @And("^I fill up First name with \"([^\"]*)\"$")
    public void iFillUpFirstNameWith(String name) {
        register.fillUpFirstName(name);
    }

    @And("^I fill up Last name with \"([^\"]*)\"$")
    public void iFillUpLastNameWith(String name) {
        register.fillUpLastName(name);
    }

    @And("^I fill up Password with \"([^\"]*)\"$")
    public void iFillUpPasswordWith(String passwd) {
        register.fillUpPassword(passwd);
    }

    @And("^I fill up Address with \"([^\"]*)\"$")
    public void iFillUpAddressWith(String addr) {
        register.fillUpAddress(addr);
    }

    @And("^I fill up City with \"([^\"]*)\"$")
    public void iFillUpCityWith(String c) {
        register.fillUpCity(c);
    }

    @And("^I choose State$")
    public void iChooseState() {
        register.chooseState();
    }

    @And("^I fill up Zip Code with \"([^\"]*)\"$")
    public void iFillUpZipCodeWith(String code) {
        register.fillUpPostalCode(code);
    }

    @And("^I fill up Mobile phone with \"([^\"]*)\"$")
    public void iFillUpMobilePhoneWith(String phone) {
        register.fillUpMobilePhone(phone);
    }

    @And("^I click on register button$")
    public void iClickOnRegisterButton() {
        register.clickOnRegisterButton();
    }

    @Then("^I see my account view$")
    public void iSeeMyAccountView() {
        register.iAmOnMyAccPage();
    }

    @Then("^I see many error pop-ups$")
    public void iSeeManyErrorPopUps() {
        register.catchAlertPopUpWithAllErrors();
    }
}
