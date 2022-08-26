package com.Eduzeny.day05;

import com.Eduzeny.utilities.ConfigurationReader;
import com.Eduzeny.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UploadTest {
        //    TC #2 Upload Test
        @Test
        public void UploadFile() throws InterruptedException {
            //1. Go to https://practice.cydeo.com/upload
            Driver.getDriver().get(ConfigurationReader.getProperty("practice.cydeo.upload.url"));



//            2. Find some small file from your computer, and get the path of it.
            //WebElement choosefile = Driver.getDriver().findElement(By.cssSelector("#file-upload"));//id
            WebElement choosefile = Driver.getDriver().findElement(By.id("file-upload"));

            choosefile.sendKeys("/Users/ahmettartar/Desktop/deneme.docx");//file path

            Thread.sleep(3000);
            // 3. Upload the file.
            WebElement uploadBtn = Driver.getDriver().findElement(By.cssSelector("#file-submit"));//id
            uploadBtn.click();
            //4. Assert:
//-File uploaded text is displayed on the page
// In order test to pass "uploaded" should start from uppercase letter, message should have ! at the end
            WebElement text = Driver.getDriver().findElement(By.xpath("//h3[.='File Uploaded!']"));
            String actualText = text.getText();
            String expectedText = "File Uploaded!";
            Assert.assertEquals(actualText, expectedText, "Text verification is failed!");
            Assert.assertTrue(text.isDisplayed(), "Text verification if displayed is failed!");
            Driver.closeDriver();
        }

}
