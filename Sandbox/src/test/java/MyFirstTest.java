import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

import java.util.concurrent.TimeUnit;
import java.util.Date;
import java.io.File;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
import static org.openqa.selenium.OutputType.*;

public class MyFirstTest {
    FirefoxDriver wd;
    
    @BeforeMethod
    public void setUp() throws Exception {
        wd = new FirefoxDriver(new FirefoxOptions().setLegacy(true));
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }
    
    @Test
    public void MyFirstTest() {
        wd.get("https://www.google.co.il/?gfe_rd=cr&dcr=0&ei=T1d_Wo6UC8j68Afvl5qoAQ");
        wd.findElement(By.id("lst-ib")).click();
        wd.findElement(By.id("lst-ib")).click();
        wd.findElement(By.id("lst-ib")).clear();
        wd.findElement(By.id("lst-ib")).sendKeys("selenium driver");
        wd.findElement(By.xpath("//div/div[3]/form/div[2]/div[2]/div[1]/div[1]/div[2]/div/div/div[2]/div/input[1]")).click();
        wd.findElement(By.xpath("//div/div[3]/form/div[2]/div[2]/div[1]/div[1]/div[2]/div/div/div[2]/div/input[1]")).sendKeys("\n");
    }
    
    @AfterMethod
    public void tearDown() {
        wd.quit();
    }
    
    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
