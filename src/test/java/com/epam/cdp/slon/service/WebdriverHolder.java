package com.epam.cdp.slon.service;

import com.epam.cdp.slon.util.TestConfig;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class WebdriverHolder {
 private static WebDriver driver;



    private WebdriverHolder() {
    }

    public static WebDriver getInstance(){
        if(driver == null){


            driver = new FirefoxDriver();

            driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        }

        return driver;
    }


    }
