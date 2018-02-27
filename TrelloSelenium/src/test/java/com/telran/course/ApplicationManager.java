package com.telran.course;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    FirefoxDriver wd;

    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    public void start() {
        wd = new FirefoxDriver(new FirefoxOptions().setLegacy(true));
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        openSite("url");
    }

    public void proceedLogIn() {
        wd.findElement(By.id("login")).click();
    }

    public void fillInPassword(String p) {
        wd.findElement(By.id("password")).click();
        wd.findElement(By.id("password")).clear();
        wd.findElement(By.id("password")).sendKeys(p);
    }

    public void fillInUserName(String userName) {
        wd.findElement(By.id("user")).click();
        wd.findElement(By.id("user")).clear();
        wd.findElement(By.id("user")).sendKeys(userName);
    }

    public void getLogIn() {
        wd.findElement(By.linkText("Log In")).click();
    }

    public void openSite(String url) {
        wd.get(url);
    }

    public void stop() {
        wd.quit();
    }

    public void logOut() {
        wd.findElementByCssSelector("span.member-initials").click();
        wd.findElementByCssSelector("a.js-logout").click();
    }

    public void logIn(String user, String p){

        getLogIn();
        fillInUserName(user);
        fillInPassword(p);
        proceedLogIn();

    }

    public void ReturnToHomePage() {
        wd.findElementByCssSelector("span.header-logo-default").click();
    }

    public void clickRenameBoardTitle() {
        wd.findElementByXPath("//input[@type='submit]").click();
    }

    public void fillRenameBoardTitle(BoardData boardData) {
        wd.findElementByCssSelector("input.js-board-name.js-autofocus").click();
        wd.findElementByCssSelector("input.js-board-name.js-autofocus").clear();
        wd.findElementByCssSelector("input.js-board-name.js-autofocus").sendKeys(boardData.getName());

    }

    public void clickOnTheBoardTitle() {
        wd.findElementByCssSelector("a.board-header-btn.board-header-btn-name").click();
    }

    public void selectBoard() {
        wd.findElementByCssSelector("span[title=Eyecon]").click();
    }
}
