package com.coherentsolutions.training.aqa.java.web.nikonova.pageObjectPattern;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class WebDriverUtils {

    WebDriver driver;

    public WebDriverUtils(WebDriver driver)  {
        this.driver = driver;
    }

    public void takeScreenShot(String screenShotName) throws IOException {
        File screenShotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenShotFile, new File("c:\\webdriverScreenshot\\" + screenShotName + ".png"));
    }
}
