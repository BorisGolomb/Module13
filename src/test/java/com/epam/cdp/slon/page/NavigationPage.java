package com.epam.cdp.slon.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class NavigationPage extends BasePage {



    public SupplyOnServices openSupplyonServices() {

        WebElement element = getDriver().findElement(By.xpath("//div[text()='SupplyOn Services']/ancestor::li[@class='navBarTopMenuItemContainer']"));
        new Actions(getDriver()).moveToElement(element).build().perform();

        return new SupplyOnServices();
    }

    public class SupplyOnServices {
        public CreateApPage openActioManagement() {
            getDriver().findElement(By.xpath("//div[@templateid='navbarSubmenuItemText'][text()='Action Management']")).click();
            return new CreateApPage();
        }
    }
}


//                WebElement myDynamicElement = (new WebDriverWait(driver, 10))
//                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//div[contains(@class,'am-create-from-template-dropdown')]/div)[1]")));
//                myDynamicElement.click();