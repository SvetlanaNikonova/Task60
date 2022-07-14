package com.coherentsolutions.training.aqa.java.web.nikonova;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestYandex {

    WebDriver selenium;
    private static final String TITLE = "Authorization";

    @BeforeEach
    public void setUp() {
        selenium = new ChromeDriver();
    }

    @AfterEach
    public void tearDown() {
        selenium.quit();
    }

    @Test
    public void
       ShouldLoadHomePageAndCheckTitle() {
        selenium.get("https://mail.yandex.com/");
        HomePageYandex hp = new HomePageYandex(selenium);
        LoginPageYandex lp = hp.loudLoginPageYandex();
        Assertions.assertTrue(lp.isTitlePresents(TITLE));
    }
}
