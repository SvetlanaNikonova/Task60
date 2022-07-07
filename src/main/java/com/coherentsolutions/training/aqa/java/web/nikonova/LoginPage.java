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

    public Dashboard login(String userName, String password)  {
        enterUsername(userName);
        clickLogin();
        enterPassword(password);
        clickLogin();
        return new Dashboard(driver);
    }

    private void enterUsername(String user) {
        driver.findElement(uName).clear();
        driver.findElement(uName).sendKeys(user);

    }

    private void enterPassword(String pass) {
        driver.findElement(pswd).clear();
        driver.findElement(pswd).sendKeys(pass);

    }

    private void clickLogin() {
        driver.findElement(loginBtn).click();

    }

    public String isLoaded() {
        return driver.getTitle();
    }

}

