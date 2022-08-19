package com.Eduzeny.day04;

import com.Eduzeny.base.TestBase;
import com.Eduzeny.utilities.WebTableUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TableExample extends TestBase {

    @Test
    public void tableTest() {
        driver.get("https://practice.cydeo.com/tables");

        String name = "John";
        String request = "//table[@id='table1']//tbody//td[2][.='" + name +"']";

        //xpath //table[@id='table1']//tbody//tr[2]//td[.='Frank']
        //xpath //table[@id='table1']//tbody//td[2][.='Frank']
        WebElement frankName = driver.findElement(By.xpath(request));
        System.out.println(frankName.getText());


        //51$
        WebElement dolar51= driver.findElement(By.xpath("//table[@id='table1']//tbody//td[2][.='Frank']/following-sibling::td[2]"));
        System.out.println("dolar51.getText() = " + dolar51.getText());

        //metod kullanarak yazalim
        WebTableUtils.cellName(driver, "Jason", "Jason");
    }




}
