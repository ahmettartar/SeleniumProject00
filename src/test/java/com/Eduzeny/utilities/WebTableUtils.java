package com.Eduzeny.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class WebTableUtils {

    public static void cellName (WebDriver driver, String name, String expected) {
        String request = "//table[@id='table1']//tbody//td[2][.='" + name +"']";

        WebElement frankName = driver.findElement(By.xpath(request));
        //System.out.println(frankName.getText());
        String actual = frankName.getText();
        Assert.assertEquals(actual,expected, "Eslesme hatali!");


    }
}
