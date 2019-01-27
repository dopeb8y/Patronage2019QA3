package com.Intive.Patronage.tests.pages;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public WebDriver driver;
    private static String AUTOMATION_URL = "http://automationpractice.com/index.php/";

    @FindBy (how = How.ID, using = "search_query_top")
    public WebElement searchField;

    @FindBy (how = How.CLASS_NAME, using = "button-search")
    public WebElement submitSearchButton;

    @FindBy (how = How.CLASS_NAME, using = "alert-warning")
    public WebElement alertPopUp;

    @FindBy (how = How.CLASS_NAME, using = "product-image-container")
    public WebElement productContainer;


    public HomePage(final WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void openHomePage() {
        driver.get(AUTOMATION_URL);
    }

    public void searchInBox(String searchPhrase) {
        searchField.sendKeys(searchPhrase);
    }

    public void clickOnSearchButton() {
        submitSearchButton.click();
    }

    public void displayAlertPopUP() {
        String catchAlertText = alertPopUp.getText();
        String checkAlertText = "Please enter a search keyword";
        Assert.assertEquals(checkAlertText, catchAlertText);
    }

    public void catchAlertPopUpText() {
        String catchAlertText = alertPopUp.getText();
        String checkAlertText = "No results were found for your search \"a\"";
        Assert.assertEquals(checkAlertText, catchAlertText);
    }

    public void catchConteiner() {
        productContainer.isDisplayed();
    }
}
