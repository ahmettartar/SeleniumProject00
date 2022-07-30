package com.Eduzeny.day01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CRMVerification {

    public static void main(String[] args) throws InterruptedException {
        // SETUP
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(); //yeni chrome objesi
        driver.manage().window().maximize();

//        TC #1: NextBaseCRM, locators and getText() practice
//        1- Open a chrome browser
//        2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");


        Thread.sleep(3000);
//        3- Enter incorrect username: “incorrect”
        //username webelementi bulalim
        WebElement username = driver.findElement(By.name("USER_LOGIN"));
        username.sendKeys("incorrect");
        Thread.sleep(3000);
//        4- Enter incorrect password: “incorrect”
        driver.findElement(By.name("USER_PASSWORD")).sendKeys("incorrect");

        Thread.sleep(3000);
//        5- Click to login button.
        // login button bulmak gerekir
        WebElement loginBtn = driver.findElement(By.className("login-btn"));
        loginBtn.click();


//        6- Verify error message text is as expected:
//        Expected: Incorrect login or password
        WebElement errorMsg = driver.findElement(By.className("errortext"));
        String actualText = errorMsg.getText();
        String expectedText ="Incorrect login or password";

        if(actualText.equals(expectedText)){
            System.out.println("Error message verification is passed.");
        }else{
            System.out.println("Error message verification is failed.");
        }

        driver.quit();

//        PS: Inspect and decide which locator you should be using to locate web
//        elements.

    }
}
