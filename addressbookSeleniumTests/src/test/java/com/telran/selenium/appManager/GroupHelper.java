package com.telran.selenium.appManager;

import com.telran.selenium.model.GroupData;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GroupHelper {

    FirefoxDriver wd;

    public GroupHelper(FirefoxDriver wd) {
        this.wd = wd;
    }

    public void backToGroupsPage() {
        wd.findElement(By.linkText("group page")).click();
    }

    public void initGroupCreation() {
        wd.findElement(By.name("new")).click();
    }

    public void fillGroupForm(GroupData groupData) {
        type(groupData, "group_name");
        type(groupData);
        wd.findElement(By.name("group_footer")).click();
        wd.findElement(By.name("group_footer")).clear();
        wd.findElement(By.name("group_footer")).sendKeys(groupData.getGroupFooter());
        wd.findElement(By.name("submit")).click();
    }

    public void type(GroupData groupData) {
        wd.findElement(By.name("group_header")).click();
        wd.findElement(By.name("group_header")).clear();
        wd.findElement(By.name("group_header")).sendKeys(groupData.getGroupHeader());
    }

    public void type(GroupData groupData, String locator) {
        wd.findElement(By.name(locator)).click();
        wd.findElement(By.name(locator)).clear();
        wd.findElement(By.name(locator)).sendKeys(groupData.getGroupName());
    }

    public void logIn(String user, String pass) {
        wd.findElement(By.id("LoginForm")).click();
        wd.findElement(By.name("user")).click();
        wd.findElement(By.name("user")).clear();
        wd.findElement(By.name("user")).sendKeys(user);
        wd.findElement(By.name("pass")).click();
        wd.findElement(By.name("pass")).clear();
        wd.findElement(By.name("pass")).sendKeys(pass);
        wd.findElement(By.xpath("//form[@id='LoginForm']/input[3]")).click();
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
