package com.telran.selenium.appManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends HelperBase {
    private WebDriver wd;

    public NavigationHelper(WebDriver wd) {
        super(wd);
        this.wd = wd;

    }

    public void goToGroupPage() {
        wd.findElement(By.linkText("groups")).click();





    }
}



