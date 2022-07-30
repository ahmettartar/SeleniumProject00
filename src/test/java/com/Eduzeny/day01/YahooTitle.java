package com.Eduzeny.day01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooTitle {
    public static void main(String[] args) {
        // SETUP
        WebDriverManager.chromedriver().setup();


//        TC #1: Yahoo Title Verification
//        1. Open Chrome browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

//        2. Go to https://www.yahoo.com
        driver.get("https://www.yahoo.com");
        // get, sayfanin tumunun yuklenmesini bekler.


        //driver.navigate().to("https://www.yahoo.com");
        // Sayfanin yuklenmesini beklemez.
        // Web elementlerinin bulunmasinda sorun olur.

//        3. Verify title:
//        Expected: Yahoo
        String actualTitle = driver.getTitle();
        String expectedTitle = "Yahoo";

        if(actualTitle.contains(expectedTitle)){
            System.out.println("Yahoo title verification is passed.");
        }else{
            System.out.println("Yahoo title verification is failed.");
        }

        driver.quit();


    }
}
