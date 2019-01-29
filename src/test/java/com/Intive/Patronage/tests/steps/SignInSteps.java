package com.Intive.Patronage.tests.steps;

import com.Intive.Patronage.tests.DriverFactory;
import com.Intive.Patronage.tests.pages.SignInPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignInSteps extends DriverFactory {

    SignInPage signIn = new SignInPage(driver);

    @Given("^I open automationpractice Webpage$")
    public void iOpenAutomationpracticeWebpage() {
        signIn.openAutomationUrl();
    }

    @When("^I click on Sign in Navigation Menu$")
    public void iClickOnSignInNavigationMenu() {
        signIn.clickOnSignIn();
    }

    @And("^I fill up Email address with validate phrase \"([^\"]*)\"$")
    public void iFillUpEmailAddressWithValidatePhrase(String emailAddress) {
        signIn.fillEmail(emailAddress);
    }

    @And("^I fill up Password with validate phrase \"([^\"]*)\"$")
    public void iFillUpPasswordWithValidatePhrase(String passwd) {
        signIn.fillPasswd(passwd);
    }

    @And("^I click on Sign in button$")
    public void iClickOnSignInButton() {
        signIn.clickOnSignInButton();
    }

    @Then("^I see My Account page$")
    public void iSeeMyAccountPage() {
        signIn.iAmOnMyAccountPage();
    }

    @Then("^I see that error pop-up about required email address is visible$")
    public void iSeeThatErrorPopUpAboutRequiredEmailAddressIsVisible() {
        signIn.catchAlertPopUpText();
    }


    @And("^I fill up Email address with phrase \"([^\"]*)\"$")
    public void iFillUpEmailAddressWithPhrase(String phrase) {
        signIn.fillEmail(phrase);
    }

    @Then("^I see that error pop-up about invalid email address is visible$")
    public void iSeeThatErrorPopUpAboutInvalidEmailAddressIsVisible() {
        signIn.catchAlertPopUpInvalidEmail();
    }

    @Then("^I see that error pop-up about required password is visible$")
    public void iSeeThatErrorPopUpAboutRequiredPasswordIsVisible() {
        signIn.catchAlertPopUpPasswordRequired();
    }

    @And("^I fill up Password with phrase \"([^\"]*)\"$")
    public void iFillUpPasswordWithPhrase(String phrase) {
        signIn.fillPasswd(phrase);
    }

    @Then("^I see that error pop-up about failed authentication is visible$")
    public void iSeeThatErrorPopUpAboutFailedAuthenticationIsVisible() {
        signIn.catchAlertPopUpAuthenticationFail();
    }
}
