package com.telran.selenium.appManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SessionHelper extends HelperBase{

    private WebDriver wd;

    public SessionHelper(WebDriver wd) {
        super(wd);
        this.wd = wd;
        ;
    }
        public void logIn(String user, String pass) {
           // click(By.id("LoginForm"));
            type(By.name("user"), user);
            type(By.name("pass"), pass);
            click(By.xpath("//form[@id='LoginForm']/input[3]"));
        }


}
