package com.coherentsolutions.training.aqa.java.web.nikonova.allure;

import com.coherentsolutions.training.aqa.java.web.nikonova.pageObjectPattern.Dashboard;
import com.coherentsolutions.training.aqa.java.web.nikonova.pageObjectPattern.HomePage;
import com.coherentsolutions.training.aqa.java.web.nikonova.pageObjectPattern.LoginPage;
import io.qameta.allure.AllureId;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;

import org.junit.jupiter.api.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class TestLogin {

    public static WebDriver driver = new ChromeDriver();
    private final String USERNAME = "SeleniumTest789";
    private final String PASSWORD = "belekoks_789!";

    @BeforeAll
    @Feature("SetUp")
    @Description("Description of the Method - Launching browser")
    public static void setUp() {

        driver.manage().window().maximize();
        driver.get("https://mail.yandex.com/");
    }

    @Test
    @AllureId("1")
    @Order(1)
    @Feature("Login")
    @Description("Verify the ability to login")
    public void testLogin() throws InterruptedException {

        driver.get("https://mail.yandex.com/");

        HomePage home = new HomePage(driver);
        LoginPage login = home.clickLogin();
        Thread.sleep(3000);
        Dashboard dashboard = login.login(USERNAME, PASSWORD);
        Thread.sleep(3000);
        Assertions.assertTrue(dashboard.isLoaded());

    }

    @Test
    @AllureId("2")
    @Order(2)
    @Feature("LogOut")
    @Description("Verify the ability to logout")
    public void testLogOut() throws InterruptedException {

        Dashboard dashboard = new Dashboard(driver);
        LoginPage login = dashboard.clickLogout();
        Assertions.assertTrue(login.isLoaded());

    }

    @AfterAll
    @Feature("LogOut")
    @Description("Description of the Method - Closing Browser")
    public static void cleanUp() {
        driver.quit();
    }

}
