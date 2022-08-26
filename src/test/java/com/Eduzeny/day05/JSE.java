package com.Eduzeny.day05;

import com.Eduzeny.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class JSE {

    public static void main(String[] args) {
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
                                    //WebDriver
                //int<Double
        WebDriver driver = Driver.getDriver();
       // jse.executeScript("")

        // int<double
        int a =5;
        double c =a;
        byte d = (byte) a;  // buyuk kucuk degere atanamiyor.
    }
}
