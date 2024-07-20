package com.automation.page;

import com.automation.utils.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AdminPage extends BasePage{
    @FindBy(xpath = "//label[text()='User Role']/../..//div[text()='-- Select --']")
    WebElement userRoleSearch;

    @FindBy(xpath = "//h6[text()='Admin']")
    WebElement adminText;

    @FindBy(xpath = "//h6[text()='User Management']")
    WebElement userManagementText;

    @FindBy(xpath = "//button[@type='submit' and text()=' Search ']")
    WebElement searchButton;

    @FindBy(className = "oxd-table-card")
    List<WebElement> usersList;

    public boolean validateAdminPage(){
        return adminText.isDisplayed()&& userManagementText.isDisplayed();
    }

    public void clickOnUseRoleSearch(){
        userRoleSearch.click();
    }

    public void selectOnUserSearchDropDown(String role){
        String dropDownXpath = "//div/span[text()='%s']";
        DriverManager.getDriver().findElement(By.xpath(String.format(dropDownXpath,role))).click();
    }

    public void clickOnSearchButton(){
        searchButton.click();
    }

    public List<WebElement> getUsersList(){
        return usersList;
    }

}
