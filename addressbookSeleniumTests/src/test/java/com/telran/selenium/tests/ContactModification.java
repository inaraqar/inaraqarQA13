package com.telran.selenium.tests;

import org.testng.annotations.Test;

public class ContactModification extends TestBase {


    @Test

    public void addressBookContactModification(){

        app.getContactHelper().initContactModification();
        app.getContactHelper().changeContactDetails();
        app.getContactHelper().confirmContactModification();
    }
}
