package com.coherentsolutions.training.aqa.java.web.nikonova;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


public class TestLogin {

    private static WebDriver driver = new ChromeDriver();
    private final String USERNAME = "SeleniumTest789";
    private final String PASSWORD = "belekoks_789!";

    @BeforeAll
    public static void setUp() {

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    @Order(1)
    public void testLogin()  {


        driver.get("https://mail.yandex.com/");

        HomePage home = new HomePage(driver);


        LoginPage login = home.clickLogin();

        Dashboard dashboard = login.login(USERNAME, PASSWORD);

        Assertions.assertTrue(dashboard.isLoaded());

    }

    @Test
    @Order(2)
    public void testLogOut()  {

        Dashboard dashboard = new Dashboard(driver);
        LoginPage login = dashboard.clickLogout();
        Assertions.assertTrue(login.isLoaded());

    }

    @AfterAll
    public static void cleanUp() {
        driver.quit();
    }

}
