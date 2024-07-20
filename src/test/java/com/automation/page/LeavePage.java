package com.automation.page;

import com.automation.utils.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LeavePage extends BasePage{

    @FindBy(xpath = "//h6[text()='Leave']")
    WebElement leaveText;

    @FindBy(xpath = "//a[text()='Apply']")
    WebElement applyLink;

    @FindBy(xpath = "//label[text()='Leave Type']/../following-sibling::div")
    WebElement leaveTypeInput;

    @FindBy(xpath = "//span[text()='CAN - FMLA']")
    WebElement leaveTypeOne;

    @FindBy(xpath = "//label[text()='From Date']/../following-sibling::div//input")
    WebElement fromDateInput;

    @FindBy(xpath = "//label[text()='To Date']/../following-sibling::div//input")
    WebElement toDateInput;


    @FindBy(xpath = "//div[@class='oxd-calendar-selector-month-selected']/p")
    WebElement currentMonthName;

    @FindBy(xpath = "//i[@class='oxd-icon bi-chevron-right']/..")
    WebElement currentCalenderLeftArrow;

    @FindBy(xpath = "//div[text()='3']/..")
    WebElement fromDate3Date;

    @FindBy(xpath = "//div[text()='5']/..")
    WebElement toDate5Date;

    @FindBy(xpath = "//label[text()='Partial Days']/../following-sibling::div")
    WebElement partialDaysInput;

    @FindBy(xpath = "//label[text()='Duration']/../following-sibling::div")
    WebElement durationInput;

    @FindBy(xpath = "//span[text()='All Days']")
    WebElement partialDaysDropAllDays;

    @FindBy(xpath = "//span[text()='Half Day - Morning']")
    WebElement durationDropDownHalfDay;

    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
    WebElement applyButton;

    @FindBy(id = "oxd-toaster_1")
    WebElement successPopUp;

    public boolean verifyLeavePage(){
        return leaveText.isDisplayed();
    }

    public void clickOnApplyLink(){
        applyLink.click();
    }

    public void clickOnLeaveType(){
        leaveTypeInput.click();
    }

    public void clickOnLeaveTypeOne(){
        leaveTypeOne.click();
    }

    public void clickOnFromDateInput(){
        fromDateInput.click();
    }

    public void clickOnToDateInput(){
        toDateInput.click();
    }

    public String getMonthName(){
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(60));
        wait.until(ExpectedConditions.visibilityOf(currentMonthName));
        return currentMonthName.getText();
    }

    public void clickOnLeftArrow(){
        currentCalenderLeftArrow.click();
    }

    public void clickOnFromDate3Date(){
        fromDate3Date.click();
    }
    public void clickOnToDate5Date(){
        toDate5Date.click();
    }

    public void clickOnPartialDaysInput(){
        partialDaysInput.click();
    }

    public void clickOnAllDays(){
        partialDaysDropAllDays.click();
    }

    public void clickOnDurationInput(){
        durationInput.click();
    }

    public void clickOnDurationDropDownHalfDay(){
        durationDropDownHalfDay.click();
    }

    public void clickOnApplyButton(){
        applyButton.click();
    }

    public boolean verifyLeaveApplied(){
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(60));
        wait.until(ExpectedConditions.visibilityOf(successPopUp));
        return successPopUp.isDisplayed();
    }
}
