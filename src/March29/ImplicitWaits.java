package March29;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ImplicitWaits {


    public static void main(String[] args) throws InterruptedException {

        // Static wait -> Thread.sleep();

        // It is discouraged from using in the selenium automation
        // because it increase overall test execution time


        // Dynamic waits -> Implicit and Explicit waits


        System.setProperty("webdriver.chrome.driver", "/Users/duotech/Documents/browserDrivers/chromedriver");


        WebDriver driver = new ChromeDriver();


//        Thread.sleep(10000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // Every time findElement() method is called, driver will wait at most 5 seconds before throwing NoSuchElementException
//        Once set, the implicit wait is set for the life of the WebDriver object's instance
        // It is global to the entire script

        driver.get("https://the-internet.herokuapp.com/dynamic_controls");


        driver.findElement(By.xpath("//button[.='Remove']")).click();

        System.out.println(driver.findElement(By.xpath("//p[@id='message']")).getText());

        //NoSuchElementException is thrown when findElement() method cannot locate the element on the page










    }
}
