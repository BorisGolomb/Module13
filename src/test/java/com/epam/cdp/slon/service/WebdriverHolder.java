package com.epam.cdp.slon.service;

import com.epam.cdp.slon.reporting.MyLogger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.concurrent.TimeUnit;

public class WebdriverHolder {
    private static WebDriver driver;


    private WebdriverHolder() {
    }

    public static WebDriver getInstance() {
        if (driver == null) {

            System.setProperty("webdriver.gecko.driver", "./src/test/resources/geckodriver.exe");
            System.setProperty("webdriver.firefox.logfile", "/dev/null");


            driver = new FirefoxDriver();

            driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        }

        return driver;
    }


    public static  void takeScreenshot() {
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE.FILE);
        try {
            String screenshotName = "screenshot_" + System.nanoTime();
            File copy = new File(screenshotName + ".png");
            Files.copy(screenshot.toPath(), copy.toPath());
//            FileUtils.copyFile(screenshot, copy);
            MyLogger.info("Saved screenshot: " + screenshotName);
        } catch (IOException e) {
            MyLogger.error("Failed to make screenshot", e);
        }
    }


}
