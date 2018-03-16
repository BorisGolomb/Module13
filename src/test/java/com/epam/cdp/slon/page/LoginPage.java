package com.epam.cdp.slon.page;

import com.epam.cdp.slon.page.BasePage;
import com.epam.cdp.slon.service.WebdriverHolder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(xpath = "//input[@name='j_username']")
    private WebElement usernameInput ;

    @FindBy(xpath = "//input[@name='j_password']")
    private WebElement passwordInput;

    @FindBy(xpath = "(//div[@class='login-button']/a)[1]")
    private WebElement loginButton;





    public void login(String username, String password ) {
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();
    }
}

