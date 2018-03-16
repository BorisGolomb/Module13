package com.epam.cdp.slon.page;

import com.epam.cdp.slon.service.WebdriverHolder;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    protected WebDriver getDriver(){
        return WebdriverHolder.getInstance();
    }



    public BasePage() {
        PageFactory.initElements(getDriver(), this);

    }

    public void waitForAngular(String getControlPointUrl) {
        JavascriptExecutor executor = (JavascriptExecutor)getDriver();
        executor.executeAsyncScript("angular.element(document.querySelector('*[ng-app]')).injector().get('$browser').notifyWhenNoOutstandingRequests(arguments[arguments.length - 1]);");
    }
    public String getNotificationMasssage() {
       return getDriver().findElement(By.className("so-message-text")).getText();
    }
}

