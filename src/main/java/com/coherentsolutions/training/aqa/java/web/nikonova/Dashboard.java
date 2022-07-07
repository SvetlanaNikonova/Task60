package com.coherentsolutions.training.aqa.java.web.nikonova;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Dashboard {

    private WebDriver driver;


    public Dashboard(WebDriver driver) {
        this.driver = driver;
    }

    private By heading = By.className("PSHeader-User");
    private By logoutBtn = By.xpath("//a[text()='Log out']");


    public LoginPage clickLogout() {
        driver.findElement(logoutBtn).click();
        return new LoginPage(driver);
    }

    public List<WebElement> isLoaded() {
        return driver.findElements(By.className("PSHeader-User"));

    }
}