package com.telran.selenium.tests;

import org.testng.annotations.Test;

public class ContactDeletion extends TestBase {


    @Test

    public void addressBookContactDeletion(){

        app.getContactHelper().selectContact();
        app.getContactHelper().contactDeletion();

    }
}
