package com.epam.cdp.slon.service;

import com.epam.cdp.slon.model.Topic;
import com.epam.cdp.slon.page.AddCustomerAMPage;
import com.epam.cdp.slon.page.NavigationPage;
import org.openqa.selenium.WebDriver;

public class TopicService extends BaseService {




    public void createTopic(Topic topic){

        AddCustomerAMPage addCustomerAMPage =  new NavigationPage().openSupplyonServices().openActioManagement().craeteTopicFromTemlate(topic.getTemplateName());
        addCustomerAMPage.enterName(topic.getName());
        addCustomerAMPage.enterDescription(topic.getDescription());
        addCustomerAMPage.searchSupplier().searchRecord(topic.getSupplier());
        addCustomerAMPage.searchSupplierResponsible().searchRecord(topic.getSupplierResponsible());
        addCustomerAMPage.save();

    }

}
