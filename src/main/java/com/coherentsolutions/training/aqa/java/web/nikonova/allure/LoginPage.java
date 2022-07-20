package com.coherentsolutions.training.aqa.java.web.nikonova.allure;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginPage {

    private WebDriver driver;
    private static final String LOGIN_URL = "https://mail.yandex.com/";
    private static final String TITLE = "Authorization";

    @FindBy(how = How.ID, using = "passp-field-login")
    private WebElement uName;

    @FindBy(how = How.NAME, using = "passwd")
    private WebElement pswd;


    @FindBy(how = How.ID, using = "passp:sign-in")
    private WebElement loginBtn;

    public LoginPage(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public Dashboard login(String userName, String password) {
        enterUsername(userName);
        clickLogin();
        enterPassword(password);
        clickLogin();
        return new Dashboard(driver);
    }

    private void enterUsername(String user) {
        uName.clear();
        uName.sendKeys(user);
    }

    private void enterPassword(String pass) {
        WebElement pswd2 = new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(pswd));
        pswd2.clear();
        pswd2.sendKeys(pass);
    }

    private void clickLogin() {
        loginBtn.click();
    }

    public boolean isLoaded() {
        return new WebDriverWait(driver, 10).until(ExpectedConditions.titleContains(TITLE));
    }
}

