package com.coherentsolutions.training.aqa.java.web.nikonova;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageYandex {

    WebDriver selenium;


    public HomePageYandex (WebDriver selenium) {
        this.selenium = selenium;
    }

    private By heading = By.className("PSHeader-User");

    public LoginPageYandex loudLoginPageYandex() {
        selenium.findElement(heading).isDisplayed();
        return new LoginPageYandex(selenium);
    }
}
