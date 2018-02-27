import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class TrelloLogIn extends TestBase {

    @Test
    public void TrelloLogIn() {


        getLogIn();
        fillInUserName("elena.telran@yahoo.com");
        fillInPassword("p");
        proceedLogIn();
        logOut();
    }

    public void logOut() {
        wd.findElementByCssSelector("span.member-initials").click();
        wd.findElementByCssSelector("a.js-logout").click();
    }


    @Test
    public void TrelloLogInvalidUserName() {


        getLogIn();
        fillInUserName("lckvdk");
        fillInPassword("p");
        proceedLogIn();
        logOut();
    }
    @Test
    public void TrelloLogInEmptyDetails() {


        getLogIn();
        fillInUserName("");
        fillInPassword("");
        proceedLogIn();
    }

}
