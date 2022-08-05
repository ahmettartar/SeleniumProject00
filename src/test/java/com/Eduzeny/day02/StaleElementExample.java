package com.Eduzeny.day02;

import com.Eduzeny.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class StaleElementExample {

        public static void main(String[] args) {
//        TC #1: StaleElementReferenceException handling
//        1. Open Chrome browser
            WebDriver driver = WebDriverFactory.getDriver("chrome");
            driver.manage().window().maximize();
            //Providing extra time for our driver before it throws NoSuchElementException
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//        2. Go to https://practice.cydeo.com/add_remove_elements/
            driver.get("https://practice.cydeo.com/add_remove_elements/");


//        3. Click to “Add Element” button
            // xpath //button[.='Add Element']
            WebElement addElementBtn = driver.findElement(By.xpath("//button[.='Add Element']"));

//        4. Verify “Delete” button is displayed after clicking.
            addElementBtn.click();

            //xpath //button[.='Delete']
            WebElement deleteBtn = driver.findElement(By.cssSelector("button[class='added-manually']"));
            System.out.println("Before clicking delete button " + deleteBtn.isDisplayed());

//        5. Click to “Delete” button.
            deleteBtn.click();

//        6. Verify “Delete” button is NOT displayed after clicking.

           //System.out.println("After clicking delete button " + deleteBtn.isDisplayed());

           //StaleElementReferenceException: stale element reference:
            // element is not attached to the page document (DOM)

            try {

                System.out.println("After clicking delete button " + deleteBtn.isDisplayed());

            }catch (StaleElementReferenceException e){
                System.out.println("StaleElementReferenceException is thrown");
                System.out.println("This means the web element is completely deleted from the page and html");
                //System.out.println("e.getMessage() = " + e.getMessage());
            }

            //COZUM
            /**
             * IKI DURUMDA OLUSUR;
             * 1- Webelement sayfadan kaldirilirsa/silinirse meydana gelir
             * 2- sayfa refresh olunca (driver.navigate().refresh())
             *
             * COZUM: YENIDEN WEB ELEMENTI LOCATE ETMEK GEREKIR.
             */

            //xpath //button[.='Delete']
            deleteBtn = driver.findElement(By.cssSelector("button[class='added-manually']"));
            System.out.println("Before clicking delete button " + deleteBtn.isDisplayed());

            //SAYFA YAPISINDAN HATA VERDI.
            // NoSuchElementException

            driver.quit();

        }
    }


