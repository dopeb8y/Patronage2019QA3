package com.Intive.Patronage.tests.steps;

import com.Intive.Patronage.tests.DriverFactory;
import com.Intive.Patronage.tests.pages.GooglePage;
import com.Intive.Patronage.tests.pages.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ContactUsSteps extends DriverFactory {

    HomePage homePage = new HomePage(driver);

    @Given("^I open testAutomation Webapage$")
    public void iOpenTestAutomationWebapage() {
        homePage.openAutomationPage();
    }

    @When("^I click on Contact Us Navigation Menu$")
    public void iClickOnContactUsNavigationMenu() {
        homePage.clickOnContactUs();
    }

    @And("^I Click on Send button$")
    public void iClickOnSendButton() {
        homePage.clickOnSendButton();
    }

    @Then("^I see that error pop-up is visible$")
    public void iSeeThatErrorPopUpIsVisible() {
        //homePage.displayAlertPopUP();
        homePage.catchAlertPopUpText();
    }
}
