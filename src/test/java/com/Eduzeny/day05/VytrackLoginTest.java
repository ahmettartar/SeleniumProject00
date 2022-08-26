package com.Eduzeny.day05;

import com.Eduzeny.utilities.ConfigurationReader;
import com.Eduzeny.utilities.Driver;
import com.pages.VyTrackLoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VytrackLoginTest {

    @Test
    public void loginFunctionalityVytrack() {
        //go to vytrack app
        Driver.getDriver().get(ConfigurationReader.getProperty("vytrack.qa.url"));

        //POM Object
        VyTrackLoginPage page1 = new VyTrackLoginPage();



        //Driver.getDriver().findElement(By.xpath("hhhhh"));
        //valid user name
        page1.username.sendKeys("User162");

        //valid password

        page1.sifre.sendKeys("UserUser123");

        //enter the login button

        page1.loginbtn.click();

        //You should be able to see the home page.

        Assert.assertEquals(Driver.getDriver().getTitle(), "Dashboard");

        Driver.closeDriver();

    }
}
