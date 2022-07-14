package com.coherentsolutions.training.aqa.java.web.nikonova;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;


    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    private By uName = By.id("passp-field-login");

    private By pswd = By.id("passp-field-passwd");

    private By loginBtn = By.id("passp:sign-in");

    private static final String TITLE = "Yandex.Mail — free, reliable email";

    public Dashboard login(String userName, String password)  {
        enterUsername(userName);
        driver.findElement(loginBtn).click();
        enterPassword(password);
        return clickLogin();
    }

    private void enterUsername(String user) {
        driver.findElement(uName).clear();
        driver.findElement(uName).sendKeys(user);

    }

    private void enterPassword(String pass) {
        driver.findElement(pswd).clear();
        driver.findElement(pswd).sendKeys(pass);

    }

    private Dashboard clickLogin() {
        driver.findElement(loginBtn).click();
        return new Dashboard(driver);

    }

    public boolean isLoaded() {
        return driver.getTitle().contains(TITLE);
    }

}

