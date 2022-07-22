package com.coherentsolutions.training.aqa.java.web.nikonova.allure;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Dashboard {

    private WebDriver driver;

    private final static String  TITLE = "Inbox";

    @FindBy(how = How.XPATH, using = "//a[text()='Log out']")
    private WebElement logoutBtn;


    public Dashboard(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public HomePage clickLogout() {
        logoutBtn.click();
        return new HomePage(driver);
    }

    public boolean isLoaded() {
     return   new WebDriverWait(driver, 10).until(ExpectedConditions.titleContains(TITLE));

    }
}