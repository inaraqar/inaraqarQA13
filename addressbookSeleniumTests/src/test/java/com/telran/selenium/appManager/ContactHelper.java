package com.telran.selenium.appManager;
import com.telran.selenium.model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactHelper{

    WebDriver wd;

    public ContactHelper(WebDriver wd) {
        this.wd = wd;

    }

    public void initContactAddition() {
        wd.findElement(By.cssSelector("#nav > ul > li:nth-child(2) > a")).click();

    }

    public void fillContactForm(ContactData contactData) {
        wd.findElement(By.name("firstname")).click();
        wd.findElement(By.name("firstname")).clear();
        wd.findElement(By.name("firstname")).sendKeys("none");
        wd.findElement(By.name("lastname")).click();
        wd.findElement(By.name("lastname")).clear();
        wd.findElement(By.name("lastname")).sendKeys("none");
        wd.findElement(By.name("address")).click();
        wd.findElement(By.name("address")).clear();
        wd.findElement(By.name("address")).sendKeys("avot yeshurun");
        wd.findElement(By.name("mobile")).click();
        wd.findElement(By.name("mobile")).clear();
        wd.findElement(By.name("mobile")).sendKeys("000000");
        wd.findElement(By.name("email")).click();
        wd.findElement(By.name("email")).clear();
        wd.findElement(By.name("email")).sendKeys("none@gmail.com");

    }

    public void submitTheForm() {
        wd.findElement(By.name("submit")).click();
    }

    public void selectContact() {
        wd.findElement(By.name("selected[]")).click();
    }

    public void contactDeletion() {
        wd.findElement(By.xpath("//*[@id=\"content\"]/form[2]/div[2]/input")).click();
        wd.switchTo().alert().accept();
    }

    public void initContactModification() {

        wd.findElement(By.xpath("//*[@id=\"maintable\"]/tbody/tr[2]/td[8]/a/img")).click();
    }

    public void changeContactDetails() {

        wd.findElement(By.name("address")).click();
        wd.findElement(By.name("address")).clear();
        wd.findElement(By.name("address")).sendKeys("paris");
    }

    public void confirmContactModification() {
        wd.findElement(By.name("update")).click();
    }
}
