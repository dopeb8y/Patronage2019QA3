package com.Intive.Patronage.tests.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {

    public WebDriver driver;
    private static String AUTOMATION_URL = "http://automationpractice.com/index.php/";

    @FindBy (how = How.CLASS_NAME, using = "header_user_info")
    public WebElement signInLink;

    @FindBy (how = How.ID, using = "email")
    public WebElement emailBox;

    @FindBy (how = How.ID, using = "passwd")
    public WebElement passwdBox;

    @FindBy (how = How.ID, using = "SubmitLogin")
    public WebElement submitLoginButton;

    @FindBy (how = How.XPATH, using = "//ol/li[1]")
    public WebElement alertPopUpText;


    public SignInPage(final WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void openAutomationUrl() {
        driver.get(AUTOMATION_URL);
    }

    public void clickOnSignIn() {
        signInLink.click();
    }

    public void fillEmail(String emailAddress) {
        emailBox.sendKeys(emailAddress);
    }

    public void fillPasswd(String passwd) {
        passwdBox.sendKeys(passwd);
    }

    public void clickOnSignInButton() {
        submitLoginButton.click();
    }

    public void iAmOnMyAccountPage() {
        String currPage = driver.getCurrentUrl();
        String myAccPage = "http://automationpractice.com/index.php?controller=my-account";
        Assert.assertEquals(currPage, myAccPage);
    }

    public void catchAlertPopUpText() {
        String catchAlertText = alertPopUpText.getText();
        String checkAlertText = "An email address required.";
        Assert.assertEquals(checkAlertText, catchAlertText);
    }

    public void catchAlertPopUpInvalidEmail() {
        String catchAlertText = alertPopUpText.getText();
        String checkAlertText = "Invalid email address.";
        Assert.assertEquals(checkAlertText, catchAlertText);
    }

    public void catchAlertPopUpPasswordRequired() {
        String catchAlertText = alertPopUpText.getText();
        String checkAlertText = "Password is required.";
        Assert.assertEquals(checkAlertText, catchAlertText);
    }

    public void catchAlertPopUpAuthenticationFail() {
        String catchAlertText = alertPopUpText.getText();
        String checkAlertText = "Authentication failed.";
        Assert.assertEquals(checkAlertText, catchAlertText);
    }
}
