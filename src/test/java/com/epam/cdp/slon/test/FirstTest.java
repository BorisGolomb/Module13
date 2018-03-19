package com.epam.cdp.slon.test;

import com.epam.cdp.slon.model.Topic;
import com.epam.cdp.slon.model.TopicFactory;
import com.epam.cdp.slon.model.User;
import com.epam.cdp.slon.model.UserFactory;
import com.epam.cdp.slon.page.LoginPage;
import com.epam.cdp.slon.page.NavigationPage;
import com.epam.cdp.slon.reporting.MyLogger;
import com.epam.cdp.slon.service.TopicService;
import com.epam.cdp.slon.util.TestConfig;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class FirstTest extends BaseTest {

    @Test
    public void testSrcCreatingBo(){

        MyLogger.info("Start my test!");
        String applicationUrl = TestConfig.getApplicationUrl();
        User user = UserFactory.getUser();
        MyLogger.info("Do login");
        LoginPage loginPage = new LoginPage();
        loginPage.login(user.getUsername(), user.getPassword());
        Topic topic = TopicFactory.getTopic();
        TopicService topicService = new TopicService();
        topicService.createTopic(topic);






    }

























}




