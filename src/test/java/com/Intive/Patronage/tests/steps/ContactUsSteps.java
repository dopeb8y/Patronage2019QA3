package com.Intive.Patronage.tests.steps;

import com.Intive.Patronage.tests.DriverFactory;
import com.Intive.Patronage.tests.pages.ContactUsPage;
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
        //homePage.displayAlertPopUP();
        contactUsPage.catchAlertPopUpText();
    }
}
