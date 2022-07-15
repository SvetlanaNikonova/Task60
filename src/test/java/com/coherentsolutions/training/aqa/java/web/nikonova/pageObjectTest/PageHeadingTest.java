package com.coherentsolutions.training.aqa.java.web.nikonova.pageObjectTest;

import com.coherentsolutions.training.aqa.java.web.nikonova.pageObjectPattern.WebDriverUtils;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;

public class PageHeadingTest {

    public static final By BUTTON = By.cssSelector(".HeadBanner-ButtonsWrapper > a:last-child");
    public static final By USERNAME_INPUT = By.id("passp-field-login");
    public static final By SIGN_IN = By.id("passp:sign-in");
    public static final By PASSWORD_INPUT = By.id("passp-field-passwd");
    public static final By NAME = By.cssSelector(".PSHeader-Left");


    @Test
    public void shouldCheckHomePage() throws IOException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://mail.yandex.com/");
        WebDriverUtils util = new WebDriverUtils(driver);
        util.takeScreenShot("loginPage");

        driver.findElement(BUTTON).click();
        WebElement usernameInput = driver.findElement(USERNAME_INPUT);
        usernameInput.clear();
        usernameInput.sendKeys("SeleniumTest789");
        driver.findElement(SIGN_IN).click();
        WebElement passwordInput = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(PASSWORD_INPUT));
        passwordInput.clear();
        passwordInput.sendKeys("belekoks_789!");
        driver.findElement(SIGN_IN).click();
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(NAME));
        util.takeScreenShot("homePage");

        driver.quit();
    }
}


