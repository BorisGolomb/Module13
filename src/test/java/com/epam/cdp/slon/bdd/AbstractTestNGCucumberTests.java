package com.epam.cdp.slon.bdd;

import org.testng.IHookCallBack;
import org.testng.IHookable;
import org.testng.ITestResult;
import org.testng.annotations.Test;

import java.io.IOException;
import org.testng.IHookCallBack;
import org.testng.IHookable;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public abstract class AbstractTestNGCucumberTests implements IHookable {
    public AbstractTestNGCucumberTests() {
    }

    @Test(
            groups = {"cucumber"},
            description = "Runs Cucumber Features"
    )
    public void run_cukes() throws IOException {
        (new TestNGCucumberRunner(this.getClass())).runCukes();
    }

    public void run(IHookCallBack iHookCallBack, ITestResult iTestResult) {
        iHookCallBack.runTestMethod(iTestResult);
    }
}
