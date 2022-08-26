package com.pages;

import com.Eduzeny.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicLoadingPage {
    public DynamicLoadingPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "username")
    public WebElement username;

    @FindBy(id = "pwd")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginBtn;



}
