package com.Eduzeny.day01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        //    TC #1: Facebook title verification
//1. Open Chrome browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

//2. Go to https://www.facebook.com

        driver.get("https://www.facebook.com");

//3. Verify title:
//Expected: “Facebook - log in or sign up”

        String actualTitle = driver.getTitle();
        String expectedTitle = "Facebook - log in or sign up";

        if(actualTitle.equals(expectedTitle)){
            System.out.println("FB title verification is passed.");
        }else{
            System.out.println("FB title verification is failed.");
        }

        driver.quit();


    }





}
