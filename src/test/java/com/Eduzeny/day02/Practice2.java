package com.Eduzeny.day02;

import com.Eduzeny.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Practice2 {

        public static void main(String[] args) {

//        TC #1: XPATH and cssSelector Practices
//        1. Open Chrome browser
            WebDriver driver = WebDriverFactory.getDriver("chrome");
            driver.manage().window().maximize();


//        2. Go to https://practice.cydeo.com/forgot_password
            driver.get("https://practice.cydeo.com/forgot_password");


//        3. Locate all the WebElements on the page using XPATH and/or CSS locator only (total of 6)
//        a. “Home” link
            //Locate homeLink using cssSelector, class value

            // xpath => //a[@class='nav-link']
            // CSS   => a[class='nav-link']
            // Text  => //a[.='Home']   OR  //a[text()='Home'] (@isareti almaz)

            WebElement homeLink1 = driver.findElement(By.xpath("//a[@class='nav-link']"));
            WebElement homeLink2 = driver.findElement(By.cssSelector("a[class='nav-link']"));


            // isDisplayed()

            System.out.println("homeLink1.isDisplayed() = " + homeLink1.isDisplayed());
            //true: Selenium, web elementi buldu.

            System.out.println("=====");

            //Locate homeLink using cssSelector, href value
            //WebElement homeLink2 = driver.findElement(By.cssSelector("a[href='/']"));

            //Locate homeLink using cssSelector, syntax2 for class "."
           // WebElement homeLink3 = driver.findElement(By.cssSelector("a.nav-link"));

            //Locate homeLink using xpath with text of element
           // WebElement homeLink4 = driver.findElement(By.xpath("//a[.='Home']")); // xpath(text()='Home')

            //Locate homeLink using xpath
           // WebElement homeLink5 = driver.findElement(By.xpath("//a[@class='nav-link']"));

//        b. “Forgot password” header

            //       //div[@class='example']/h2
            //      //div[@class='example']//*[.='Forgot Password']
            //      //*[@id="content"]/div/h2

            WebElement forgotPassword1 = driver.findElement(By.xpath("//div[@class='example']//*[.='Forgot Password']"));
            System.out.println("forgotPassword1.isDisplayed() = " + forgotPassword1.isDisplayed());


            //Locate forgotPassword using cssSelector form parent to child with ">"
            //WebElement forgotPassword1 = driver.findElement(By.cssSelector("div[class='example']>h2"));

            //Locate forgotPassword using cssSelector syntax2 form parent to child with ">"
            //WebElement forgotPassword2 = driver.findElement(By.cssSelector("div.example>h2"));

            //Locate forgotPassword using xpath
            //WebElement forgotPassword3 = driver.findElement(By.xpath("//h2[text()='Forgot Password']"));


//        c. “E-mail” text
            //              //label[.='E-mail']
            //          //label[@for='email']
            //      label[for='email']   CSS


            WebElement emailText = driver.findElement(By.cssSelector("label[for='email']"));

            //Locate Email text using xpath
            WebElement emailText1 = driver.findElement(By.xpath("//label[@for='email']"));

            System.out.println("emailText.isDisplayed() = " + emailText.isDisplayed());



//        d. E-mail input box

            //CSS input[type='text']
            //xpath //input[@type='text']
            // xpath //input[@name='email']
            // css input[name='email']

            // name=email, dkfkfkg
            // name=email, type='text'

            // And logic //input[@name='email' and @type='text']

            WebElement emailInputBox = driver.findElement(By.cssSelector("input[name='email']"));

            //Locate Email input box using xpath
            WebElement emailInputBox1 = driver.findElement(By.xpath("//input[@name='email']"));


//        e. “Retrieve password” button

            // xpath    //i[.='Retrieve password']
            // xpath //i[@class='icon-2x icon-signin']
            //css i[class='icon-2x icon-signin']
            // css i.icon-2x.icon-signin     (class .   id #)


            WebElement retrievePassword1 = driver.findElement(By.cssSelector("button#form_submit"));
            WebElement retrievePassword2 = driver.findElement(By.cssSelector("button.radius"));

//        f. “Powered by Cydeo text

            //xpath //div[@style='text-align: center;']
            //css div[style='text-align: center;']


            WebElement poweredByCydeo = driver.findElement(By.cssSelector("div[style='text-align: center;']"));


//        4. Verify all web elements are displayed.
            System.out.println("homeLink1.isDisplayed() = " + homeLink1.isDisplayed());
            System.out.println("forgotPassword1.isDisplayed() = " + forgotPassword1.isDisplayed());
            System.out.println("emailText.isDisplayed() = " + emailText.isDisplayed());
            System.out.println("emailInputBox.isDisplayed() = " + emailInputBox.isDisplayed());
            System.out.println("retrievePassword1.isDisplayed() = " + retrievePassword1.isDisplayed());
            System.out.println("poweredByCydeo.isDisplayed() = " + poweredByCydeo.isDisplayed());

            driver.quit();
        }
    }

