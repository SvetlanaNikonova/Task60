package com.coherentsolutions.training.aqa.java.web.nikonova;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class Dashboard {

    private WebDriver driver;
    private static String URL = ("https://mail.yandex.com/");

    @FindBy(how = How.CLASS_NAME, using = "PSHeader-User")
    private WebElement heading;

    @FindBy(how = How.XPATH, using = "//a[text()='Log out']")
    private WebElement logoutBtn;


    public Dashboard(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public LoginPage clickLogout() {
        logoutBtn.click();
        return new LoginPage(driver);
    }

    public boolean isLoaded() {
        return heading.isDisplayed();
    }
}