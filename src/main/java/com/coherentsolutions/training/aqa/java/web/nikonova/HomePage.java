package com.coherentsolutions.training.aqa.java.web.nikonova;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    private WebDriver driver;

    private static String URL = ("https://mail.yandex.com/");

    @FindBy(how = How.CSS, using = ".HeadBanner-ButtonsWrapper > a:last-child")
    private WebElement LoginBtn;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public LoginPage clickLogin() {
        LoginBtn.click();
        return new LoginPage(driver);
    }
}

