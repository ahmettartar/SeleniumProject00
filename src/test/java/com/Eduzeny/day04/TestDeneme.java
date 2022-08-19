package com.Eduzeny.day04;

import com.Eduzeny.base.TestBase;
import com.Eduzeny.utilities.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDeneme extends TestBase {

    @Test
    public void Test1() {
        driver.get(ConfigurationReader.getProperty("google.url"));
        Assert.assertEquals(driver.getTitle(), "Google");
    }
}
