package com.telran.selenium.tests;

import com.telran.selenium.model.ContactData;
import org.testng.annotations.Test;

public class ContactCreation extends TestBase {
     @Test
    public void addressBookContactCreation() {

         app.getContactHelper().initContactAddition();
         app.getContactHelper().fillContactForm(new ContactData()
                 .setFirstName("fName")
                 .setLastName("lName")
                 .setAddress("address"));
         app.getContactHelper().submitTheForm();

     }




    }


