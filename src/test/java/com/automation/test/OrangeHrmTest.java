package com.automation.test;

import com.automation.utils.PropertiesReader;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Objects;

public class OrangeHrmTest extends BaseTest {

    @Test
    public void loginTest(){

        loginPage.gotoLoginUrl();
        loginPage.doLogin(PropertiesReader.getPropValue("login.username"),PropertiesReader.getPropValue("login.password"));

        Assert.assertTrue(homePage.validateHomePage());
    }

    @Test
    public void selectAdmin(){
        loginPage.gotoLoginUrl();
        loginPage.doLogin(PropertiesReader.getPropValue("login.username"),PropertiesReader.getPropValue("login.password"));

        Assert.assertTrue(homePage.validateHomePage());

        homePage.clickOnAdminOption();
        Assert.assertTrue(adminPage.validateAdminPage());

        adminPage.clickOnUseRoleSearch();
        adminPage.selectOnUserSearchDropDown("Admin");
        adminPage.clickOnSearchButton();

        Assert.assertFalse(adminPage.getUsersList().isEmpty());
    }


    @Test
    public void userLeaveTest(){

        loginPage.gotoLoginUrl();
        loginPage.doLogin(PropertiesReader.getPropValue("login.username"),PropertiesReader.getPropValue("login.password"));

        Assert.assertTrue(homePage.validateHomePage());

        homePage.clickOnLeaveOption();

        Assert.assertTrue(leavePage.verifyLeavePage());
        leavePage.clickOnApplyLink();
        leavePage.clickOnLeaveType();
        leavePage.clickOnLeaveTypeOne();

        leavePage.clickOnFromDateInput();

        String fromDateMonthName = leavePage.getMonthName();
        while (!fromDateMonthName.equals("September")){
            leavePage.clickOnLeftArrow();
            fromDateMonthName = leavePage.getMonthName();
        }

        leavePage.clickOnFromDate3Date();

        leavePage.clickOnToDateInput();
        String toDateMonthName = leavePage.getMonthName();

        while (!Objects.equals(toDateMonthName, "September")){
            leavePage.clickOnLeftArrow();
            toDateMonthName = leavePage.getMonthName();
        }

        leavePage.clickOnToDate5Date();

        leavePage.clickOnPartialDaysInput();
        leavePage.clickOnAllDays();

        leavePage.clickOnDurationInput();
        leavePage.clickOnDurationDropDownHalfDay();

        leavePage.clickOnApplyButton();

        Assert.assertTrue(leavePage.verifyLeaveApplied());

    }

}
