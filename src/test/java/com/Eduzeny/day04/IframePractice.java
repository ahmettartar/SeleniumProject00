package com.Eduzeny.day04;

import com.Eduzeny.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class IframePractice extends TestBase {

    @Test
    public void iframeTest() throws InterruptedException {
//          2- Go to: https://practice.cydeo.com/iframe
        driver.get("https://practice.cydeo.com/iframe");

        // NOSuchElement exception comes with reasons: 1- Not locationg correctly element
        //                                              2- There is a iframe and you have switch to frame to reach this element

        //System.out.println("driver.findElement(By.xpath(\"//p[.='Your content goes here.']\")).isDisplayed() = " + driver.findElement(By.xpath("//p[.='Your content goes here.']")).isDisplayed());


//          3- Clear text from comment body

        // we can use frame(id) method with id arg.
        driver.switchTo().frame("mce_0_ifr"); //id name ile gecis yaptik.

        // ARTIK DRIVER FRAME UZERINDE.
        System.out.println("driver.findElement(By.xpath(\"//p[.='Your content goes here.']\")).isDisplayed() = " + driver.findElement(By.xpath("//p[.='Your content goes here.']")).isDisplayed());


        // we can use frame(locator)
        //driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']")));

        // we can use frame(index) : index starts from 0
        // we can find iframe tags from html with using xpath "//iframe"
        //driver.switchTo().frame(0);


        WebElement commentBody = driver.findElement(By.id("tinymce"));
        // clear() method delete text form comment body.
        commentBody.clear(); //yazi alanini temizler.
        Thread.sleep(3000);

//          4- Type "Hello World" in comment body
        commentBody.sendKeys("Hello World");

//          5- Verify "Hello World" text is written in comment body
        assertEquals(commentBody.getText(),"Hello World");
        //Statik import yaptiktan sonra class name belirtmeye gerek yok.


        driver.switchTo().defaultContent();

        WebElement yaziBaslik = driver.findElement(By.xpath("//h3[.='An iFrame containing the TinyMCE WYSIWYG Editor']"));
        System.out.println("yaziBaslik.isDisplayed() = " + yaziBaslik.isDisplayed());

        //1.YONTEM
        //driver.switchTo().parentFrame();  //TEKRAR ana web sayfasina donuyoruz.
        //Varsa bir onceki frame'e gider.

        //2.YONTEM
        //driver.switchTo().defaultContent(); //Dogrudan anasayfaya gider.
        //Daha guvenli bir islem sunar.

//          6- Verify header "An iFrame containing the TinyMCE WYSIWYG Editor" is displayed
        WebElement headerText = driver.findElement(By.tagName("h3"));
        //assertTrue(headerText.isDisplayed(),"Header text did not appear!");

        String actualHeader = headerText.getText();
        String expectedHeader = "An iFrame containing the TinyMCE WYSIWYG Editor";

       assertEquals(actualHeader,expectedHeader,"Header text did not appear correctly!");

    }
}

