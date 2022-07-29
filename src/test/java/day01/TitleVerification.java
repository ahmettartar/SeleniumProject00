package day01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleVerification {

    public static void main(String[] args) {

        // SETUP
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(); //yeni chrome objesi
        driver.manage().window().maximize();


        driver.get("https://google.com");
        String title = driver.getTitle();
        System.out.println(title);

        // URL Checking
        String url = driver.getCurrentUrl();
        System.out.println(url);

        driver.quit();



    }


}
