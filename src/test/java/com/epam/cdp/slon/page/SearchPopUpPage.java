package com.epam.cdp.slon.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPopUpPage extends BasePage{

    @FindBy(xpath ="//input[contains(@id,'markup_selectModalPanel:selectSearchForTopicForm')]" )
    private WebElement searchInput;

    @FindBy(xpath ="//button[text()='Search']" )
    private WebElement searchButton;

    @FindBy(xpath ="//tr[@class='so-selection-column']//input[@type='radio']" )
    private WebElement firstRadioButton;

    @FindBy(xpath ="//button[text()='OK']" )
    private WebElement okButton;




    public void searchRecord(String text){
        searchInput.sendKeys(text);
        searchButton.click();
        new WebDriverWait(getDriver(), 20).until(ExpectedConditions.elementToBeClickable(firstRadioButton));
        firstRadioButton.click();
        okButton.click();

    }
}