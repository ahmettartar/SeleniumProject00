package com.Eduzeny.day01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class SearchBox {
    public static void main(String[] args) throws InterruptedException {

        // SETUP
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(); //yeni chrome objesi
        driver.manage().window().maximize();

        //google git
        driver.get("https://google.com");

        // apple yaz
        // Once webelementi bulalim
        WebElement searchBox = driver.findElement(By.name("q"));

        Thread.sleep(3000);

        // Yazi yazmak icin: sendKey("yazi")
        searchBox.sendKeys("Apple" + Keys.ENTER);

        Thread.sleep(3000);
        //title de "Apple-Google Search"
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);
        String expectedTitle = "Apple - Google Search";

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Apple title verification is passed.");
        }else{
            System.out.println("Apple title verification is failed.");
        }

        driver.quit();
    }

}
