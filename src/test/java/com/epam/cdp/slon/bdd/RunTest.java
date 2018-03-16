package com.epam.cdp.slon.bdd;

import cucumber.api.CucumberOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

@CucumberOptions(strict = true, 
//features="src/test/java/spin/spin.feature:4",
plugin = { "pretty", "json:target/Cucumber.json", "html:target/cucumber-html-report" })
class RunTest extends AbstractTestNGCucumberTests {

    @BeforeClass
    public static void initSelenium() {
       
    }

    @AfterClass
    public static void closeSelenium() {
    }
}
