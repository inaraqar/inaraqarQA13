package com.telran.selenium.appManager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SessionHelper extends HelperBase{

    private FirefoxDriver wd;

    public SessionHelper(FirefoxDriver wd) {
        this.wd = wd;
    }
        public void logIn(String user, String text, By pass) {
            click(By.id("LoginForm"));
            type(By.name("user"), text);
            type(pass, text);
            click(By.xpath("//form[@id='LoginForm']/input[3]"));
        }

    public void click(By locator) {
        wd.findElement(locator).click();
    }

    public void type(By pass, By locator, CharSequence text) {
        click(locator);
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(text);
    }

    public void type(By locator, String text) {
        click(locator);
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(text);
    }
}
