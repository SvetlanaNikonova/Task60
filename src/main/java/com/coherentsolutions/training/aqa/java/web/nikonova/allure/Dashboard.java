package com.coherentsolutions.training.aqa.java.web.nikonova.allure;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class Dashboard {

    private WebDriver driver;
    private By heading = By.className("PSHeader-User");
    private By logoutBtn = By.xpath("//a[text()='Log out']");

    public Dashboard(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage clickLogout() {
        driver.findElement(logoutBtn).click();
        return new LoginPage(driver);
    }

    public boolean isLoaded() {
        return driver.findElements(heading).size() == 0;
    }
}