package com.Eduzeny.day04;

import com.Eduzeny.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

public class WindowExample extends TestBase {
    @Test
    public void windowPractice() {
        driver.get("https://www.google.com");
        String windowID = driver.getWindowHandle();
        System.out.println(windowID);

        //driver.getWindowHandle() -> String
        //driver.getWindowHandles() -> Set<String>

        //driver.switchTo().window("SessionID")

    }

        @Test
        public void windowHandleTest(){

//        2. Go to : https://practice.cydeo.com/windows
            driver.get("https://practice.cydeo.com/windows");

            String mainWindow = driver.getWindowHandle();
            System.out.println("mainWindow = " + mainWindow);

//   mainWindow = CDwindow-C536E9E39AF57A504F13D7D931E2CC62
//   mainWindow = CDwindow-7F7475D366ACC60228B028F59F7793D6


//        3. Assert: Title is “Windows”
            String actualTitle = driver.getTitle();
            String expectedTitle = "Windows";
            Assert.assertEquals(actualTitle,expectedTitle,"Main window title verification failed!");

//        4. Click to: “Click Here” link
            WebElement clickHereLink = driver.findElement(By.linkText("Click Here"));
            clickHereLink.click();

//        5. Switch to new Window.
            Set<String> allWindowHandles = driver.getWindowHandles();
//
            //iter
            for (String each : allWindowHandles) {
                driver.switchTo().window(each);
                // window handle 1 - main window
                // window handle 2 - 2nd window
                System.out.println("driver.getTitle() = " + driver.getTitle());
            }

//        6. Assert: Title is “New Window” : driver en sondaki windowta kalmistir.
           String expectTitleAfterClicking = "New Window";
           actualTitle = driver.getTitle();
           Assert.assertEquals(actualTitle,expectTitleAfterClicking,"New window title verification failed!");

        }


        @Test
        public void windowsHandleTest() throws InterruptedException {

//        2. Goto:https://www.amazon.com
            driver.get("https://www.amazon.com");

//        3. Copy paste the lines from below into your class
            // "_blank" will open url in new tab/window
            ((JavascriptExecutor) driver).executeScript("window.open('https://google.com','_blank');");
            ((JavascriptExecutor) driver).executeScript("window.open('https://etsy.com','_blank');");
            ((JavascriptExecutor) driver).executeScript("window.open('https://facebook.com','_blank');");
            ((JavascriptExecutor) driver).executeScript("window.open('https://ebay.com','_blank');");
            ((JavascriptExecutor) driver).executeScript("window.open('https://selenium.dev/','_blank');");
            ((JavascriptExecutor) driver).executeScript("window.open('https://youtube.com','_blank');");
            ((JavascriptExecutor) driver).executeScript("window.open('https://alibaba.com','_blank');");

//        4. Create a logic to switch to the tab where Etsy.com is open
            // We store all windows in Set of String with using getWindowHandles() method
            Set<String> allWindowHandles = driver.getWindowHandles();

            for (String eachWindow : allWindowHandles) {
                // driver.switchTo().window(eachWindow); syntax will switch each windows and driver will be able to see each window
                Thread.sleep(3000);
                driver.switchTo().window(eachWindow);
                System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

                //pencereleri random (set feature) olarak handle ediyor.
                //burada google alinamadi, cunku etsy sarti asagida saglandi.
            /* ILK 3 out of 4
            driver.getCurrentUrl() = https://www.amazon.com/
            driver.getCurrentUrl() = https://www.facebook.com/
            driver.getCurrentUrl() = https://www.etsy.com/
             */

                // YENI EKLEMELERDEN SONRA.. Bu kez (random) hepsi geldi. Etsy sona geldiginden hepsi gorunur.
            /* ALL 7 out 7
            driver.getCurrentUrl() = https://www.amazon.com/
driver.getCurrentUrl() = https://www.alibaba.com/
driver.getCurrentUrl() = https://www.youtube.com/
driver.getCurrentUrl() = https://www.selenium.dev/
driver.getCurrentUrl() = https://www.ebay.com/
driver.getCurrentUrl() = https://www.facebook.com/
driver.getCurrentUrl() = https://www.etsy.com/

             */

                if(driver.getCurrentUrl().contains("etsy")){
                    break;
                }
//                if(driver.getTitle().contains("Amazon")){
//                    break;
                }



//        5. Assert:Title contains “Etsy”
            //En son etsy sayfasinda kalmis olduk.
            String actualTitle = driver.getTitle();
            String expectedTitle = "Etsy";
            Assert.assertTrue(actualTitle.contains(expectedTitle),"Title verification failed!");

            // IMPORTANT
            //!!! 27-42 codelari yarine: asagidaki yeterli olacaktir.
            // BrowserUtils.switchWindowAndVerify(driver,"etsy","Etsy");

            // VERIFICATION icin ayrica metod ekllenebilir.
            // BrowserUtils.verifyTitle(driver,"Etsy");


        }
    }
