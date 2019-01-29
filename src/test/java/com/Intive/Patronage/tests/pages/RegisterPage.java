package com.Intive.Patronage.tests.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class RegisterPage {

    public WebDriver driver;
    private static String AUTOMATION_URL = "http://automationpractice.com/index.php/";

    @FindBy (how = How.CLASS_NAME, using = "header_user_info")
    public WebElement signInLink;

    @FindBy (how = How.ID, using = "email_create")
    public WebElement emailBox;

    @FindBy (how = How.ID, using = "SubmitCreate")
    public WebElement submitCreateButton;

    @FindBy (how = How.CLASS_NAME, using = "page-subheading")
    public WebElement yourPersonalInformationH;

    @FindBy (how = How.XPATH, using = "//ol/li[1]")
    public WebElement alertPopUpText;


    public RegisterPage(final WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void openAutomationPractUrl() {
        driver.get(AUTOMATION_URL);
    }

    public void clickOnSignInNav() {
        signInLink.click();
    }

    public void fillEmail(String emailAddress) {
        emailBox.sendKeys(emailAddress);
    }

    public void clickOnSubmitCreateButton() {
        submitCreateButton.click();
    }

    public void iAmOnCreateAnAccountPage() {
        yourPersonalInformationH.isDisplayed();
    }

    public void catchAlertPopUpTextInvalidEmail() {
        String catchAlertText = alertPopUpText.getText();
        String checkAlertText = "Invalid email address.";
        Assert.assertEquals(checkAlertText, catchAlertText);
    }

    public void catchAlertPopUpTextAlreadyRegisteredEmail() {
        String catchAlertText = alertPopUpText.getText();
        String checkAlertText = "An account using this email address has already been registered. Please enter a valid password or request a new one.";
        Assert.assertEquals(checkAlertText, catchAlertText);
    }
}
