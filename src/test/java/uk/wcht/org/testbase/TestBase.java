package uk.wcht.org.testbase;

import org.openqa.selenium.Point;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import uk.wcht.org.basepage.BasePage;
import uk.wcht.org.browserselector.BrowserSelector;

import java.util.concurrent.TimeUnit;

/*
Created By Bhavesh
*/

public class TestBase extends BasePage {

    BrowserSelector browserSelector = new BrowserSelector();
    String baseUrl = "https://www.wcht.org.uk/";

    @BeforeMethod
    public void openBrowser(){
        browserSelector.selectBrowser("chrome");
        driver.manage().window().setPosition(new Point(-2000, 0));//display into second screen
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
