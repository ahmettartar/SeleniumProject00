package com.Eduzeny.day05;

import com.Eduzeny.utilities.ConfigurationReader;
import com.Eduzeny.utilities.Driver;
import com.pages.LibraryLoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LibraryAppTest {

    @Test
    public void TC1_loginTest() {
        //TC #1: Required field error message test (+Library)
//        TC #1: Required field error message test
//        1- Open a chrome browser
//        2- Go to: https://library1.cydeo.com
        Driver.getDriver().get(ConfigurationReader.getProperty("library.url"));



//        3- Do not enter any information
//        4- Click to “Sign in” button
        LibraryLoginPage library = new LibraryLoginPage();
        library.signInBtn.click();

//        5- Verify expected error is displayed:
        library.errorMsg.isDisplayed();

//        Expected: This field is required.
//        NOTE: FOLLOW POM DESIGN PATTERN

        Assert.assertTrue(library.errorMsg.getText().equals("This field is required."));


       Driver.closeDriver();
        }


    @Test
    //TC #2: Invalid email format error message test (+Library)
    public void TC2_verify_error_text() {
//        TC #2: Invalid email format error message test
//        1- Open a chrome browser
//        2- Go to: https://library1.cydeo.com


       // Driver.getDriver().get(ConfigurationReader.getProperty("library.url"));
        Driver.getDriver().get(ConfigurationReader.getProperty("library.url2"));

//        3- Enter invalid email format
        LibraryLoginPage lib1 = new LibraryLoginPage();

        //lib1.emailArea.sendKeys("incorrect@gmail.com");
        lib1.emailArea.sendKeys("kgkgkhgkhhk");
        // valid student1@library
        lib1.password.sendKeys("d5fv9BtX");
        //valid d5fv9BtX


        //click the sign in button
        lib1.signInBtn.click();

//        4- Verify expected error is displayed:
        lib1.errorMsg.isDisplayed();

//        Expected: Please enter a valid email address.
//        NOTE: FOLLOW POM DESIGN PATTERN
        Assert.assertEquals(lib1.errorMsg.getText(), "Please enter a valid email address.");
         Driver.closeDriver();
    }


    @Test
    public void TC3_verify_login() {
//        TC #2: Invalid email format error message test
//        1- Open a chrome browser
//        2- Go to: https://library1.cydeo.com


        // Driver.getDriver().get(ConfigurationReader.getProperty("library.url"));
        Driver.getDriver().get(ConfigurationReader.getProperty("library.url2"));

//        3- Enter invalid email format
        LibraryLoginPage lib1 = new LibraryLoginPage();


        lib1.emailArea.sendKeys("student1@library.com");
        // valid student1@library
        lib1.password.sendKeys("d5fv9BtX");
        //valid d5fv9BtX


        //click the sign in button
        lib1.signInBtn.click();


        Driver.closeDriver();
    }
}

