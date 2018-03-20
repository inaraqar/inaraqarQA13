package com.telran.selenium.tests;

import com.telran.selenium.appManager.AppManager;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {

    protected static AppManager app = new AppManager(System.getProperty("browser", BrowserType.FIREFOX));

    @BeforeSuite
    public void setUp() throws Exception {
        app.start();

    }

    @AfterSuite
    public void tearDown() {
        app.stop();
    }

}
