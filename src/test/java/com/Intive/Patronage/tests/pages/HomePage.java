package com.Intive.Patronage.tests.pages;

import com.sun.org.apache.xpath.internal.operations.Bool;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public WebDriver driver;
    private static String AUTOMATION_URL = "http://automationpractice.com/index.php/";

    @FindBy (how = How.ID, using = "contact-link")
    public WebElement contactUsLink;

    @FindBy (how = How.ID, using = "submitMessage")
    public WebElement submitSendButton;

    @FindBy (how = How.CLASS_NAME, using = "alert-danger")
    public WebElement alertPopUp;

    @FindBy (how = How.XPATH, using = "//ol/li[1]")
    public WebElement alertPopUpText;

    public HomePage(final WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void openAutomationPage() {
        driver.get(AUTOMATION_URL);
    }

    public void clickOnContactUs() {
        contactUsLink.click();
    }

    public void clickOnSendButton() {
        submitSendButton.click();
    }

    public void displayAlertPopUP() {
        alertPopUp.isDisplayed();
    }

    public void catchAlertPopUpText() {
        String tekst = alertPopUpText.getText();
        String test = "Invalid email address.";
        Assert.assertEquals(test, tekst);

        System.out.println(tekst);

    }
}
