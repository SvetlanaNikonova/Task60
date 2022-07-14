package com.coherentsolutions.training.aqa.java.web.nikonova;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageYandex {
    WebDriver selenium;
    public LoginPageYandex (WebDriver selenium) {

        if (!"LoginPageYandex".equalsIgnoreCase(this.selenium.getTitle())) {
        selenium.get(
                "https://mail.yandex.com/" );
        }
    }
    public boolean isTitlePresents(String title) {
        return title.equalsIgnoreCase(this.selenium.getTitle());
    }
}
