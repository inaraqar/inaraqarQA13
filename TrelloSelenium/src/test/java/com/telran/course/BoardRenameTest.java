package com.telran.course;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BoardRenameTest extends TestBase {
    @BeforeClass
    public void precondition() {
        app.logIn("elena.telran@yahoo.com", "p");
    }

    @Test
    public void renameBoard() {
        app.selectBoard();
        app.clickOnTheBoardTitle();
        app.fillRenameBoardTitle(new BoardData("new"));
        app.clickRenameBoardTitle();
        app.ReturnToHomePage();

    }

}
