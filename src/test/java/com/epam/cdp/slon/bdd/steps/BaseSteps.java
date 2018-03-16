package com.epam.cdp.slon.bdd.steps;

import com.epam.cdp.slon.model.Topic;
import com.epam.cdp.slon.model.TopicFactory;
import com.epam.cdp.slon.model.User;
import com.epam.cdp.slon.model.UserFactory;
import com.epam.cdp.slon.page.AddCustomerAMPage;
import com.epam.cdp.slon.page.LoginPage;
import com.epam.cdp.slon.page.NavigationPage;
import com.epam.cdp.slon.service.WebdriverHolder;
import com.epam.cdp.slon.test.FirstTest;
import com.epam.cdp.slon.util.TestConfig;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class BaseSteps  {

 @Given("^Buyer Login$")

 public void buyer_Login_and_navigates_to_AM() {
  WebdriverHolder.getInstance().get(TestConfig.getApplicationUrl());
  User user = UserFactory.getUser();
  LoginPage loginPage = new LoginPage();
  loginPage.login(user.getUsername(), user.getPassword());

 }

 @When("^Buyer navigates to AM and choose template$")
 public void buyer_navigates_to_am_and_choose_templates() {
  NavigationPage navigationPage = new NavigationPage();
  navigationPage.openSupplyonServices().openActioManagement();
 }
@When("^enter all required fields and click on [Save] Button$")

 public void buyer_enter_all_required_fields_and_click_save() {
 Topic topic = TopicFactory.getTopic();
 AddCustomerAMPage addCustomerAMPage = new AddCustomerAMPage();
  addCustomerAMPage.enterName(topic.getName());
  addCustomerAMPage.enterDescription(topic.getDescription());
  addCustomerAMPage.searchSupplier().searchRecord(topic.getSupplier());
  addCustomerAMPage.searchSupplierResponsible().searchRecord(topic.getSupplierResponsible());
  addCustomerAMPage.save();
 }
 @Then("^new Topic is created$")

 public void new_topic_is_created() {
  Topic topic = TopicFactory.getTopic();
  AddCustomerAMPage addCustomerAMPage = new AddCustomerAMPage();
  String message = addCustomerAMPage.getNotificationMasssage();
  String expectedMessage = String.format("You have created the topic '%S'.",topic.getName()	);
  Assert.assertEquals(message, expectedMessage);
 }
}
