package com.Intive.Patronage.tests.steps;

import com.Intive.Patronage.tests.DriverFactory;
import com.Intive.Patronage.tests.pages.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomeSteps extends DriverFactory {

    HomePage homePage = new HomePage(driver);

    @Given("^User is on automationpractice page$")
    public void userIsOnAutomationpracticePage() {
        homePage.openHomePage();
    }

    @When("^I search with phrase \"([^\"]*)\"$")
    public void iSearchWithPhrase(String searchPhrase) {
        homePage.searchInBox(searchPhrase);
    }

    @When("^I click on search button$")
    public void iClickOnSearchButton() {
        homePage.clickOnSearchButton();
    }

    @Then("^I see that error pop-up about entering keyword is visible$")
    public void iSeeThatErrorPopUpIsAboutEnteringKeywordIsVisible() {
        homePage.displayAlertPopUP();
    }

    @Then("^I see that an error pop-up about no results is visible$")
    public void iSeeThatAnErrorPopUpAboutNoResultsIsVisible() {
        homePage.catchAlertPopUpText();
    }

    @Then("^I can see results on page$")
    public void iCanSeeResultsOnPage() {
        homePage.catchConteiner();
    }
}
