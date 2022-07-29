package day01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

    public static void main(String[] args) throws InterruptedException {

        // SETUP
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(); //yeni chrome objesi
        driver.manage().window().maximize();

//      2- Go to: https://google.com
        // driver.get("url")
        driver.get("https://google.com");

        Thread.sleep(3000);
        driver.get("https://www.amazon.com");

        Thread.sleep(3000);
        driver.navigate().to("https://www.tesla.com");

        Thread.sleep(3000);
        driver.navigate().back();

        Thread.sleep(3000);
        driver.navigate().refresh();

        // TITLE

        String title = driver.getTitle();
        System.out.println(title);


        driver.quit();
        //driver.close(); //sadece window kapatir
    }
}
