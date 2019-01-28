package com.Intive.Patronage.tests.steps;

import com.Intive.Patronage.tests.DriverFactory;
import com.Intive.Patronage.tests.pages.ContactUsPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ContactUsSteps extends DriverFactory {

    ContactUsPage contactUsPage = new ContactUsPage(driver);

    @Given("^I open testAutomation Webpage$")
    public void iOpenTestAutomationWebpage() {
        contactUsPage.openAutomationPage();
    }

    @When("^I click on Contact Us Navigation Menu$")
    public void iClickOnContactUsNavigationMenu() {
        contactUsPage.clickOnContactUs();
    }

    @And("^I Click on Send button$")
    public void iClickOnSendButton() {
        contactUsPage.clickOnSendButton();
    }

    @Then("^I see that error pop-up is visible$")
    public void iSeeThatErrorPopUpIsVisible() {
        contactUsPage.catchAlertPopUpText();
    }

    @Then("^I see that error pop-up about blank message is visible$")
    public void iSeeThatErrorPopUpAboutBlankMessageIsVisible() {
        contactUsPage.catchAlertPopUpTextMessage();
    }

    @And("^I fill up validate email address with phrase \"([^\"]*)\"$")
    public void iFillUpValidateEmailAddressWithPhrase(String emailAddress) {
        contactUsPage.fillEmailAddress(emailAddress);
    }

    @And("^I fill up message with phrase \"([^\"]*)\"$")
    public void iFillUpMessageWithPhrase(String message) {
        contactUsPage.fillMessageBox(message);
    }

    @Then("^I see that error pop-up about subject not chosen is visible$")
    public void iSeeThatErrorPopUpAboutSubjectNotChosenIsVisible() {
        contactUsPage.catchAlertPopUpSubjectMissing();
    }

    @And("^I choose subject heading$")
    public void iChooseSubjectHeading() {
        contactUsPage.chooseSubjectHeading();
    }

    @Then("^I see that success pop-up about successfully sent is visible$")
    public void iSeeThatSuccessPopUpAboutSuccessfullySentIsVisible() {
        contactUsPage.catchPopUpMessageSent();
    }
}
