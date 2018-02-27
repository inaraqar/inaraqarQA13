package com.telran.selenium.tests;

import org.testng.annotations.Test;

public class AddressBookContactTests extends TestBase {
     @Test
    public void addressBookContactCreation() {

         app.getGroupHelper().initContactAddition();
         app.getGroupHelper().fillContactForm();
         app.getGroupHelper().submitTheForm();

     }

     @Test

    public void addressBookContactDeletion(){

         app.getGroupHelper().selectContact();
         app.getGroupHelper().contactDeletion();

     }

     @Test

    public void addressBookContactModification(){

         app.getGroupHelper().initContactModification();
         app.getGroupHelper().changeContactDetails();
         app.getGroupHelper().confirmContactModification();
     }
    }


