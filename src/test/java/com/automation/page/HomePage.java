package com.automation.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    @FindBy(xpath = "//h6[text()='Dashboard']")
    WebElement dashboardText;

    @FindBy(xpath = "//span[text()='Admin']")
    WebElement adminOption;

    @FindBy(xpath = "//span[text()='Leave']")
    WebElement leaveOption;



    public boolean validateHomePage(){
        return dashboardText.isDisplayed();
    }

    public void clickOnAdminOption(){
        adminOption.click();
    }

    public void clickOnLeaveOption(){
        leaveOption.click();
    }

}
