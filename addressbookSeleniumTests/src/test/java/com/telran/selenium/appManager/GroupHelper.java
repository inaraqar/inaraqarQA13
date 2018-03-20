package com.telran.selenium.appManager;

import com.telran.selenium.model.GroupData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GroupHelper extends HelperBase {

    WebDriver wd;

    public GroupHelper(WebDriver wd) {
        super(wd);
        this.wd = wd;

    }

    public void backToGroupsPage() {
        wd.findElement(By.linkText("group page")).click();

    }

    public void initGroupCreation() {
        wd.findElement(By.name("new")).click();
    }

    public void fillGroupForm(GroupData groupData) {
        type(By.name("group_name"), groupData.getGroupName());

        wd.findElement(By.name("group_footer")).click();
        wd.findElement(By.name("group_footer")).clear();
        wd.findElement(By.name("group_footer")).sendKeys(groupData.getGroupFooter());
        wd.findElement(By.name("submit")).click();

    }

//    public void type(GroupData groupData) {
//        wd.findElement(By.name("group_header")).click();
//        wd.findElement(By.name("group_header")).clear();
//        wd.findElement(By.name("group_header")).sendKeys(groupData.getGroupHeader());
//    }

    public void type(By locator, String text) {
        wd.findElement(locator).click();
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(text);
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


    
    public int getGroupCount() {
        return  wd.findElements(By.name("selected[]")).size();
    }


    public void selectGroup() {
        click(By.name("selected[]"));
    }



    public void initGroupDeletion() {
        click(By.name("delete"));
    }


}
