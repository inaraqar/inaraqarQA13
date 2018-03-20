package com.telran.selenium.appManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HelperBase {
    protected WebDriver wd;

    public HelperBase(WebDriver wd) {
        this.wd = wd;
    }

    public void click(By locator) {
        wd.findElement(locator).click();
    }

    public void type(By locator, String text) {
        click(locator);
        if (text != null) {
            String existText = wd.findElement(locator).getAttribute("value");
            if (!text.equals(existText)) {
                wd.findElement(locator).clear();
                wd.findElement(locator).sendKeys(text);
            }


        }

    }
}
