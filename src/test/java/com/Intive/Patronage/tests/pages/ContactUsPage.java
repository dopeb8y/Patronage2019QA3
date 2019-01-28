package com.Intive.Patronage.tests.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ContactUsPage {

    public WebDriver driver;
    private static String AUTOMATION_URL = "http://automationpractice.com/index.php/";

    @FindBy (how = How.ID, using = "contact-link")
    public WebElement contactUsLink;

    @FindBy (how = How.ID, using = "submitMessage")
    public WebElement submitSendButton;

    @FindBy (how = How.XPATH, using = "//ol/li[1]")
    public WebElement alertPopUpText;

    @FindBy (how = How.ID, using = "email")
    public WebElement emailBox;

    @FindBy (how = How.ID, using = "message")
    public WebElement messageBox;

    @FindBy (how = How.CLASS_NAME, using = "alert-success")
    public WebElement messageSent;


    public ContactUsPage(final WebDriver driver) {
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

    public void catchAlertPopUpText() {
        String catchAlertText = alertPopUpText.getText();
        String checkAlertText = "Invalid email address.";
        Assert.assertEquals(checkAlertText, catchAlertText);
    }

    public void fillEmailAddress(String emailAddres) {
        emailBox.sendKeys(emailAddres);
    }

    public void catchAlertPopUpTextMessage() {
        String catchAlertText = alertPopUpText.getText();
        String checkAlertText = "The message cannot be blank.";
        Assert.assertEquals(checkAlertText, catchAlertText);
    }

    public void fillMessageBox(String message) {
        messageBox.sendKeys(message);
    }

    public void catchAlertPopUpSubjectMissing() {
        String catchAlertText = alertPopUpText.getText();
        String checkAlertText = "Please select a subject from the list provided.";
        Assert.assertEquals(checkAlertText, catchAlertText);
    }

    public void chooseSubjectHeading() {
        Select subjectHeading = new Select(driver.findElement(By.id("id_contact")));
        subjectHeading.selectByIndex(2);
    }

    public void catchPopUpMessageSent() {
        String catchAlertText = messageSent.getText();
        String checkAlertText = "Your message has been successfully sent to our team.";
        Assert.assertEquals(checkAlertText, catchAlertText);
    }
}
