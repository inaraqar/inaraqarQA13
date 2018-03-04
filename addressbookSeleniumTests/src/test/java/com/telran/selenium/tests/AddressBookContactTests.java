package com.telran.selenium.tests;

import org.testng.annotations.Test;

public class AddressBookContactTests extends TestBase {
     @Test
    public void addressBookContactCreation() {

         app.getContactHelper().initContactAddition();
         app.getContactHelper().fillContactForm();
         app.getContactHelper().submitTheForm();

     }

     @Test

    public void addressBookContactDeletion(){

         app.getContactHelper().selectContact();
         app.getContactHelper().contactDeletion();

     }

     @Test

    public void addressBookContactModification(){

         app.getContactHelper().initContactModification();
         app.getContactHelper().changeContactDetails();
         app.getContactHelper().confirmContactModification();
     }
    }


