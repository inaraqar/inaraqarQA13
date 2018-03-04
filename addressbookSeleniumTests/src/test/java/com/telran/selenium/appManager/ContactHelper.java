package com.telran.selenium.appManager;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ContactHelper {

    FirefoxDriver wd;

    public ContactHelper(FirefoxDriver wd) {
        this.wd = wd;
    }

    public void initContactAddition() {
        wd.findElementByCssSelector("#nav > ul > li:nth-child(2) > a").click();
    }

    public void fillContactForm() {
        wd.findElementByName("firstname").click();
        wd.findElementByName("firstname").clear();
        wd.findElementByName("firstname").sendKeys("none");
        wd.findElementByName("lastname").click();
        wd.findElementByName("lastname").clear();
        wd.findElementByName("lastname").sendKeys("none");
        wd.findElementByName("address").click();
        wd.findElementByName("address").clear();
        wd.findElementByName("address").sendKeys("avot yeshurun");
        wd.findElementByName("mobile").click();
        wd.findElementByName("mobile").clear();
        wd.findElementByName("mobile").sendKeys("000000");
        wd.findElementByName("email").click();
        wd.findElementByName("email").clear();
        wd.findElementByName("email").sendKeys("none@gmail.com");

    }

    public void submitTheForm() {
        wd.findElementByName("submit").click();
    }

    public void selectContact() {
        wd.findElementByName("selected[]").click();
    }

    public void contactDeletion() {
        wd.findElementByXPath("//*[@id=\"content\"]/form[2]/div[2]/input").click();
        wd.switchTo().alert().accept();
    }

    public void initContactModification() {

        wd.findElementByXPath("//*[@id=\"maintable\"]/tbody/tr[2]/td[8]/a/img").click();
    }

    public void changeContactDetails() {

        wd.findElementByName("address").click();
        wd.findElementByName("address").clear();
        wd.findElementByName("address").sendKeys("paris");
    }

    public void confirmContactModification() {
        wd.findElementByName("update").click();
    }
}
