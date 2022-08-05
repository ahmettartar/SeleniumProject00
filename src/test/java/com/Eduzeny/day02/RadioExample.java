package com.Eduzeny.day02;

import com.Eduzeny.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class RadioExample {

        public static void main(String[] args) throws InterruptedException {

            // 1. Open Chrome browser
            WebDriver driver = WebDriverFactory.getDriver("chrome");
            driver.manage().window().maximize();
            //Providing extra time for our driver before it throws NoSuchElementException
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//        2. Go to https://practice.cydeo.com/radio_buttons
            driver.get("https://practice.cydeo.com/radio_buttons");

            // Locate all sport radio buttons
            List<WebElement> sportRadioBtns = driver.findElements(By.xpath("//input[@name='sport']"));

            for (WebElement each : sportRadioBtns) {
                Thread.sleep(3000);
                each.click();
            }

            driver.quit();

        }
    }

