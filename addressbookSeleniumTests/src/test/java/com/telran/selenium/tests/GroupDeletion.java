package com.telran.selenium.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupDeletion extends TestBase {


    @Test
    public void deletionGroup(){


        app.getNavigationHelper().goToGroupPage();
        int before = app.getGroupHelper().getGroupCount();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().initGroupDeletion();
        app.getGroupHelper().backToGroupsPage();
        int after = app.getGroupHelper().getGroupCount();
        Assert.assertEquals(after, before-1);

    }
}
