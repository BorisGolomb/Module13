package com.epam.cdp.slon.reporting;

import com.epam.cdp.slon.service.WebdriverHolder;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class ReportListener extends TestListenerAdapter {
    @Override
    public void onTestFailure(ITestResult iTestResult) {
        MyLogger.error("Test Failed: ", iTestResult.getThrowable());
        WebdriverHolder.takeScreenshot();

    }
}
