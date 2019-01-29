package com.Intive.Patronage.tests.steps;

import com.Intive.Patronage.tests.DriverFactory;
import com.Intive.Patronage.tests.pages.SearchBoxPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchBoxSteps extends DriverFactory {

    SearchBoxPage searchBox = new SearchBoxPage(driver);

    @Given("^User is on AutomationPractice page$")
    public void userIsOnAutomationPracticePage() {
        searchBox.openHomePage();
    }

    @When("^I search with phrase \"([^\"]*)\"$")
    public void iSearchWithPhrase(String searchPhrase) {
        searchBox.searchInBox(searchPhrase);
    }

    @When("^I click on search button$")
    public void iClickOnSearchButton() {
        searchBox.clickOnSearchButton();
    }

    @Then("^I see that error pop-up about entering keyword is visible$")
    public void iSeeThatErrorPopUpIsAboutEnteringKeywordIsVisible() {
        searchBox.displayAlertPopUP();
    }

    @Then("^I see that an error pop-up about no results is visible$")
    public void iSeeThatAnErrorPopUpAboutNoResultsIsVisible() {
        searchBox.catchAlertPopUpText();
    }

    @Then("^I can see results on page$")
    public void iCanSeeResultsOnPage() {
        searchBox.catchProductConteiner();
    }

    @And("^I click on enter button$")
    public void iClickOnEnterButton() {
        searchBox.searchInBoxWithEnter();
    }

    @Then("^I see that search engine works using enter button$")
    public void iSeeThatSearchEngineWorksUsingEnterButton() {
        searchBox.catchProductConteiner();
    }
}
