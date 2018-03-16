package com.epam.cdp.slon.test;

import com.epam.cdp.slon.service.WebdriverHolder;
import com.epam.cdp.slon.util.TestConfig;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public abstract class BaseTest {

    protected WebDriver driver;
    private static Wait<WebDriver> wait;





    @BeforeClass
    public void setup() throws MalformedURLException {

        wait = new WebDriverWait(driver, 6000);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(TestConfig.getApplicationUrl());
    }

    @AfterClass
    public void cleanup() {
        driver.close();
    }

}
