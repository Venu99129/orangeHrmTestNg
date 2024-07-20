package com.automation.test;

import com.automation.page.AdminPage;
import com.automation.page.HomePage;
import com.automation.page.LeavePage;
import com.automation.page.LoginPage;
import com.automation.utils.DriverManager;
import com.automation.utils.PropertiesReader;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


import java.io.IOException;

public class BaseTest {

    LoginPage loginPage;
    HomePage homePage;
    AdminPage adminPage;
    LeavePage leavePage;

    @BeforeMethod
    void setUp() throws IOException {
        DriverManager.init();
        PropertiesReader.init();
        homePage = new HomePage();
        loginPage = new LoginPage();
        adminPage = new AdminPage();
        leavePage = new LeavePage();
    }

    @AfterMethod
    void close(){
        DriverManager.getDriver().quit();
    }

}
