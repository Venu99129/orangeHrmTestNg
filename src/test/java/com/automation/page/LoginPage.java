package com.automation.page;

import com.automation.utils.DriverManager;
import com.automation.utils.PropertiesReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(name = "username")
    WebElement usernameInput;

    @FindBy(name = "password")
    WebElement passwordInput;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement loginButton;

    public void gotoLoginUrl(){
        DriverManager.getDriver().get(PropertiesReader.getPropValue("base.url"));
    }

    public void doLogin(String username,String password){
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();
    }
}
