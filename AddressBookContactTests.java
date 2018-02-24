package com.telran.selenium.tests;

import org.testng.annotations.Test;

public class AddressBookContactTests extends TestBase {
     @Test
    public void addressBookContactCreation() {

         app.initContactAddition();
         app.fillContactForm();
         app.submitTheForm();

     }

     @Test

    public void addressBookContactDeletion(){

         app.selectContact();
         app.contactDeletion();

     }

     @Test

    public void addressBookContactModification(){

         app.initContactModification();
         app.changeContactDetails();
         app.confirmContactModification();
     }
    }


