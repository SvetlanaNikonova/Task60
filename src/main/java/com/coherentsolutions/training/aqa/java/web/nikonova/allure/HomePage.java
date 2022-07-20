package com.coherentsolutions.training.aqa.java.web.nikonova.allure;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

    private WebDriver driver;
    private final static String TITLE = "Yandex";

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(how = How.CSS, using = ".HeadBanner-ButtonsWrapper > a:last-child")
    private WebElement LoginBtn;

    public LoginPage clickLogin() {
        LoginBtn.click();
        return new LoginPage(driver);
    }
    public boolean isLoaded() {
        return new WebDriverWait(driver, 10).until(ExpectedConditions.titleContains(TITLE));
    }
}

