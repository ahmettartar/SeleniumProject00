package com.Eduzeny.day04;

import com.Eduzeny.utilities.ConfigurationReader;
import com.Eduzeny.utilities.Driver;
import org.testng.annotations.Test;

public class SingleDriverExample {
    @Test
    public void test1() throws InterruptedException {
        //driver.get("URL")
        //driver.get(ConfigurationReader.getProperty("key")
        //Driver.getDriver() -> driver (as a Chrome)
        //ConfigurationReader.getProperty("google.url") ->URL
        Driver.getDriver().get(ConfigurationReader.getProperty("google.url"));

        Thread.sleep(3000);

    }

    @Test
    public void test2() throws InterruptedException {

        Driver.getDriver().get(ConfigurationReader.getProperty("amazon.url"));
        Thread.sleep(3000);


    }

    @Test
    public void test3() throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperty("tesla.url"));
        Thread.sleep(3000);



        Driver.closeDriver();
    }
}
