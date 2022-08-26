package com.pages;

import com.Eduzeny.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LibraryLoginPage {

    public LibraryLoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "inputEmail")
    public WebElement emailArea;

    @FindBy(id = "inputPassword")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInBtn;

    @FindBy(id = "inputEmail-error")
    public WebElement errorMsg;
}
