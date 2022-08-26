package com.pages;

import com.Eduzeny.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VyTrackLoginPage {

    public VyTrackLoginPage (){ //Constructor
        PageFactory.initElements(Driver.getDriver(), this);
    }


    //WebElement tus1 = Driver.getDriver().findElement(By.xpath("xpath")
    @FindBy(id="prependedInput")					//xpath, css, ...(locators)
    public WebElement username;

    @FindBy(xpath = "//input[@id='prependedInput2']")    // @FindBy(id = "prependedInput2")
    public WebElement sifre;

    @FindBy(id = "_submit")
    public WebElement loginbtn;

}
