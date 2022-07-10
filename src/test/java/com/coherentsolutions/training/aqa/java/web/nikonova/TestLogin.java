package com.coherentsolutions.training.aqa.java.web.nikonova;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


public class TestLogin {
    public static WebDriver driver;

    private final String USERNAME = "SeleniumTest789";
    private final String PASSWORD = "belekoks_789!";

    @BeforeAll
    public static void setUp() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    @Order(1)
    public void testLogin() {

        driver.get("https://mail.yandex.com/");

        HomePage home = new HomePage(driver);

        LoginPage loginPage = home.clickLogin();
        Dashboard dashboard = loginPage.login(USERNAME, PASSWORD);
        Assertions.assertTrue(dashboard.isLoaded());

    }

    @Test
    @Order(2)
    public void testLogOut() {

        Dashboard dashboard = new Dashboard(driver);
        LoginPage loginPage = dashboard.clickLogout();
        Assertions.assertEquals(loginPage.isLoaded(), "Yandex.Mail — free, reliable email");

    }

    @AfterAll
    public static void cleanUp() {
        driver.quit();
    }

}
