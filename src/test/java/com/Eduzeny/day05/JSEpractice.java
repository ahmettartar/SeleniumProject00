package com.Eduzeny.day05;

import com.Eduzeny.utilities.ConfigurationReader;
import com.Eduzeny.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JSEpractice {

        @Test
        public void etsy_scroll_test() throws InterruptedException {

//         Goto Etsy homepage
            Driver.getDriver().get(ConfigurationReader.getProperty("etsy.url"));

            //WebElement emailBox = Driver.getDriver().findElement(By.xpath("//input[@id='email-list-signup-email-input']"));
            //System.out.println("emailBox.isDisplayed() = " + emailBox.isDisplayed());
//
//         Scroll down
           JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
            // window.scrollBy(x, y)  ; x(right or left) stands for horizontal line and y stands for vertical line(up or down)
           // js.executeScript("window.scrollBy(0, 5000)");
           // Thread.sleep(3000);

            WebElement emailBox = Driver.getDriver().findElement(By.id("email-list-signup-email-input"));
            js.executeScript("arguments[0].scrollIntoView(true)",emailBox);

//         Generate random email and enter into subscribe box
            //         Click on Subscribe
            Faker faker = new Faker();
            emailBox.sendKeys(faker.internet().emailAddress());
            //emailBox.sendKeys(faker.internet().emailAddress() + Keys.ENTER);
            Driver.getDriver().findElement(By.xpath("(//button[@type='submit'])[2]")).click();


//         Verify "Great! We've sent you an email to confirm your subscription." is displayed
            //Thread.sleep(10000);
            WebElement resultMsg = Driver.getDriver().findElement(By.xpath("//div[@class='wt-alert wt-alert--inline wt-alert--success-01 wt-text-body-01']"));
            // xpath //div[@class='wt-alert wt-alert--inline wt-alert--success-01 wt-text-body-01']
            String expectedMsg = "Great! We've sent you an email to confirm your subscription.";

            String actualMsg = resultMsg.getText();

           Assert.assertEquals(actualMsg,expectedMsg, "Dogrulama islemi hatalidir!");

            Driver.closeDriver();
        }
    }
