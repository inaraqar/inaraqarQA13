package com.telran.selenium.tests;

import com.telran.selenium.appManager.AppManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBase {

    protected final AppManager app = new AppManager();

    @BeforeClass
    public void setUp() throws Exception {
        app.start();

    }

    @AfterClass
    public void tearDown() {
        app.stop();
    }

}
