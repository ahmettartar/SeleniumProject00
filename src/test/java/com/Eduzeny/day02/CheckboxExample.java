package com.Eduzeny.day02;

import com.Eduzeny.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class CheckboxExample {

        public static void main(String[] args) throws InterruptedException {

            WebDriver driver = WebDriverFactory.getDriver("chrome");
            driver.manage().window().maximize();
            //Providing extra time for our driver before it throws NoSuchElementException
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//        1. Go to http://practice.cydeo.com/checkboxes


            driver.get("http://practice.cydeo.com/checkboxes");

//        2. Confirm checkbox #1 is NOT selected by default
            WebElement checkBox1= driver.findElement(By.xpath("//input[@id='box1']"));
            System.out.println("checkBox1.isSelected() = " + checkBox1.isSelected());// unchecked false

//        if(!checkBox1.isSelected()){
//            System.out.println("checkBox 1 verification is " + checkBox1.isSelected());
//        }else{
//            System.out.println("checkBox 1 verification is " + checkBox1.isSelected());
//        }


//        3. Confirm checkbox #2 is SELECTED by default.
            WebElement checkbox2 = driver.findElement(By.xpath("//input[@name='checkbox2']"));
            System.out.println("checkbox2.isSelected() = " + checkbox2.isSelected()); //checked TRUE

            Thread.sleep(3000);

//        4. Click checkbox #1 to select it.
            checkBox1.click();

            Thread.sleep(3000);
//        5. Click checkbox #2 to deselect it.
            checkbox2.click();

//        6. Confirm checkbox #1 is SELECTED.
            System.out.println("checkBox1.isSelected() = " + checkBox1.isSelected()); //true

//        7. Confirm checkbox #2 is NOT selected.
            System.out.println("checkbox2.isSelected() = " + checkbox2.isSelected());//false

            driver.quit();

        }
    }
/*
checkBox1.isSelected() = false
checkbox2.isSelected() = true
checkBox1.isSelected() = true
checkbox2.isSelected() = false
 */
