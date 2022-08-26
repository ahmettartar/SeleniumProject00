package com.pages;

import com.Eduzeny.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicPage {
    public DynamicPage () {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[.='Start']")
    public WebElement startBtn;

    @FindBy(xpath = "//img")
    public WebElement bar;


}
