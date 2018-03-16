package com.epam.cdp.slon.test;

import com.epam.cdp.slon.model.User;
import com.epam.cdp.slon.model.UserFactory;
import com.epam.cdp.slon.page.ControlPoint;
import com.epam.cdp.slon.page.LoginPage;
import com.epam.cdp.slon.util.TestConfig;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HubTest extends BaseTest {

    @Test
    public void testPlantCalendar () {

        String applicationUrl = TestConfig.getApplicationUrl();
        User user = UserFactory.getUser();
        LoginPage loginPage = new LoginPage();
        loginPage.login(user.getUsername(), user.getPassword());
        String getControlPointUrl = TestConfig.getControlPointUrl();
        ControlPoint controlPoint;
        controlPoint = new ControlPoint();
        controlPoint.selectDays(5, 10, getControlPointUrl);
        int startDay = controlPoint.getStartDay();
        int endDay = controlPoint.getEndDay();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(startDay, 5, "Start day is incorrect");
        softAssert.assertEquals(endDay, 10, "End day is incorrect");

        softAssert.assertAll();
    }


}
