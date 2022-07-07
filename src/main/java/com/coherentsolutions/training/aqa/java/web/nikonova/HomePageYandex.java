package com.coherentsolutions.training.aqa.java.web.nikonova;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageYandex {

    WebDriver selenium;
    public HomePageYandex (WebDriver selenium) {
        this.selenium = selenium;
    }
    public LoginPageYandex clickLoginPageYandex() {
        clickLoginPageYandex("Authorization");
        return new LoginPageYandex(selenium);
    }

    private void clickLoginPageYandex(String title) {
        selenium.findElement(By.cssSelector(".HeadBanner-ButtonsWrapper > a:last-child")).click();
    }
}
