package com.Intive.Patronage.tests.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;


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

    @FindBy (how = How.ID, using = "customer_firstname")
    public WebElement firstName;

    @FindBy (how = How.ID, using = "customer_lastname")
    public WebElement lastName;

    @FindBy (how = How.ID, using = "passwd")
    public WebElement password;

    @FindBy (how = How.ID, using = "address1")
    public WebElement address;

    @FindBy (how = How.ID, using = "city")
    public WebElement city;

    @FindBy (how = How.ID, using = "postcode")
    public WebElement postalCode;

    @FindBy (how = How.ID, using = "phone_mobile")
    public WebElement mobilePhone;

    @FindBy (how = How.ID, using = "submitAccount")
    public WebElement registerButton;

    @FindBy (how = How.CLASS_NAME, using = "alert-danger")
    public WebElement alertPopUpMany;



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

    public void generateRandomEmail() {
        Random objGenerator = new Random();
        int randomNumber = objGenerator.nextInt(100000);

        String emailAddress = randomNumber + "@gmail.com";
        emailBox.sendKeys(emailAddress);
    }

    public void fillUpFirstName(String name) {
        firstName.sendKeys(name);
    }

    public void fillUpLastName(String name) {
        lastName.sendKeys(name);
    }

    public void fillUpPassword(String passwd) {
        password.sendKeys(passwd);
    }

    public void fillUpAddress(String addr) {
        address.sendKeys(addr);
    }

    public void fillUpCity(String c) {
        city.sendKeys(c);
    }

    public void fillUpPostalCode(String code) {
        postalCode.sendKeys(code);
    }

    public void fillUpMobilePhone(String phone) {
        mobilePhone.sendKeys(phone);
    }

    public void clickOnRegisterButton() {
        registerButton.click();
    }

    public void iAmOnMyAccPage() {
        String currPage = driver.getCurrentUrl();
        String myAccPage = "http://automationpractice.com/index.php?controller=my-account";
        Assert.assertEquals(currPage, myAccPage);
    }

    public void chooseState() {
        Select state = new Select(driver.findElement(By.id("id_state")));
        state.selectByIndex(2);
    }

    public void catchAlertPopUpWithAllErrors() {
        String catchAlertText = alertPopUpMany.getText();
        String checkAlertText = "There are 8 errors\n" +
                "You must register at least one phone number.\n" +
                "lastname is required.\n" +
                "firstname is required.\n" +
                "passwd is required.\n" +
                "address1 is required.\n" +
                "city is required.\n" +
                "The Zip/Postal code you've entered is invalid. It must follow this format: 00000\n" +
                "This country requires you to choose a State.";
        Assert.assertEquals(checkAlertText, catchAlertText);
    }
}
