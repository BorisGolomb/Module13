package com.epam.cdp.slon.bdd;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import cucumber.api.CucumberOptions;

import cucumber.api.testng.AbstractTestNGCucumberTests;

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
