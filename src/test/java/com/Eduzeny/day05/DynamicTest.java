package com.Eduzeny.day05;

import com.Eduzeny.utilities.Driver;
import com.pages.DynamicLoadingPage;
import com.pages.DynamicPage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class DynamicTest {

        @Test
        public void dynamically_load_page_1(){
            //    1. Go to https://practice.cydeo.com/dynamic_loading/1

            Driver.getDriver().get("https://practice.cydeo.com/dynamic_loading/1");


            DynamicPage dp = new DynamicPage();

//            2. Click to start
            dp.startBtn.click();

//3. Wait until loading bar disappears
            //1.option
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);

            wait.until(ExpectedConditions.invisibilityOf(dp.bar));

            //2.option (after utilities)
            // BrowserUtils.waitForInvisibilityOf(dynamicallyLoadedPage1.loadingBar);

            //Ayni islemi daha pratik yapmis oluruz.

        //4. Assert username inputbox is displayed
            // Baska bir page  alanina gectik.
            // Yeni page icin Page Object Classi olusturduk

            DynamicLoadingPage dynamicLoadingPage = new DynamicLoadingPage();
            dynamicLoadingPage.username.isDisplayed();


//5. Enter username: tomsmith
            dynamicLoadingPage.username.sendKeys("tomsmith");


//6. Enter password: incorrectpassword
            dynamicLoadingPage.password.sendKeys("incorrectpassword");


//7. Click to Submit button
            dynamicLoadingPage.loginBtn.click();


//8. Assert “Your password is invalid!” text is displayed.

            //Assert.assertTrue(dynamicallyLoadedPage1.errorMsg.isDisplayed());

        }
    }

