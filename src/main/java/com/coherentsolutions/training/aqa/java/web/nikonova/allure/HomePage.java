package com.coherentsolutions.training.aqa.java.web.nikonova.allure;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

   private By LoginBtn = By.cssSelector(".HeadBanner-ButtonsWrapper > a:last-child");

    public LoginPage clickLogin() {
        driver.findElement(LoginBtn).click();
        return new LoginPage(driver);
    }
}

