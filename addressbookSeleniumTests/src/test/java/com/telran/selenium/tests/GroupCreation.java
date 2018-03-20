package com.telran.selenium.tests;

import com.telran.selenium.model.GroupData;
import org.testng.annotations.Test;

public class GroupCreation extends TestBase {

    @Test
    public void addressBookCreationGroup() {
        app.getNavigationHelper().goToGroupPage();
        app.getGroupHelper().initGroupCreation();
        app.getGroupHelper().fillGroupForm(new GroupData("groupName", "groupHeader", "groupFooter"));
        app.getGroupHelper().backToGroupsPage();
    }

}
