package com.Eduzeny.base;

import com.Eduzeny.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {

    //WebDriver driver; bu sekilde olunca, inheritance olunca bunu gormez.
    // cunku default is only visible in the same package.
    public WebDriver driver; //other packages can have access here in this way (public)

    @BeforeMethod
    public void setUpMethod(){
        //Open browser
        // driver = WebDriverFactory.getDriver("chrome");
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //Providing extra time for our driver before it throws NoSuchElementException
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @AfterMethod
    public void tearDownMethod(){
        driver.quit();
    }
}

