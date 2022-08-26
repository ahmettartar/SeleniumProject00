package com.Eduzeny.day05;

import com.Eduzeny.utilities.ConfigurationReader;
import com.Eduzeny.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDrop {


        @Test
        public void guru99_dragAndDrop_test() throws InterruptedException {
            //TC
            //    1- Open a chrome browser
            //    2- Go to: https://demo.guru99.com/test/drag_drop.html
            Driver.getDriver().get(ConfigurationReader.getProperty("guru99.dropdown.url"));

//    3- Drag “BANK” and drop into Account area under Debit Side
            WebElement bank = Driver.getDriver().findElement(By.partialLinkText("BANK"));
            WebElement debitAccount = Driver.getDriver().findElement(By.id("bank"));
            // xpath //li[@id='credit2']
            // text //a[.=' BANK ']
            // xpath -> //ol[@id='bank']

            // driver -> Driver.getDriver()
            Actions actions = new Actions(Driver.getDriver());
            //actions.dragAndDrop(drag part webelement,drop part weblement)
            actions.dragAndDrop(bank,debitAccount).perform();
            //Thread.sleep(3000);

//    4- Drag “5000” and drop into Amount area under Debit Side
            WebElement fiveK = Driver.getDriver().findElement(By.linkText("5000"));
            WebElement debitAmount = Driver.getDriver().findElement(By.id("amt7"));
            //WebElement debitAmount = Driver.getDriver().findElement(By.xpath("//ol[@id='amt7']"));
                    // xpath   //ol[@id='amt7']

            actions.dragAndDrop(fiveK,debitAmount).perform();
            Thread.sleep(3000);

/*
comments line-1
comment line-2

 */

            /**
             java doc style (Preferred)
             */
//    5- Drag “SALES” and drop into Account area under Credit Side


//    6- Drag “5000” and drop into Amount area under Credit Side


//    7- Verify “Perfect!” text displayed.

            //TODO: Complete the code later.

        }
    }


