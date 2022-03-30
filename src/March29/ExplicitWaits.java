package March29;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWaits {


    public static void main(String[] args) throws InterruptedException {




        System.setProperty("webdriver.chrome.driver", "/Users/duotech/Documents/browserDrivers/chromedriver");


        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // In general, it is NOT recommended to mix implicit vs explicit because
        // it can bring unexpected wait times.


//

        driver.get("https://the-internet.herokuapp.com/dynamic_controls");


        driver.findElement(By.xpath("//button[.='Enable']")).click();

        WebElement inputBox = driver.findElement(By.xpath("//input[@type='text']"));

        // Explicit wait with Expected condition for element being enabled

        WebDriverWait wait =  new WebDriverWait(driver, Duration.ofSeconds(10)); // create wait object
        wait.until(ExpectedConditions.elementToBeClickable(inputBox)); // specify the condition when the wait should be over

        inputBox.sendKeys("Explicit wait example");

        // Explicit wait  for  visibility

        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");

        driver.findElement(By.xpath("//button[.='Start']")).click();

//        new WebDriverWait(driver, Duration.ofSeconds(2)).
//                until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//h4[.='Hello World!']"))));


        //TimeoutException: Expected condition failed: waiting for visibility of
        // If the explicit wait is over and the condition is not satisfied, TimeoutException is thrown

        new WebDriverWait(driver, Duration.ofSeconds(5)).
                until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//h4[.='Hello World!']"))));


        System.out.println(driver.findElement(By.xpath("//h4[.='Hello World!']")).getText());


        // Wait for an element to appear on the page

        driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");

        driver.findElement(By.xpath("//button[.='Start']")).click();

        new WebDriverWait(driver, Duration.ofSeconds(5)).
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[.='Hello World!']")));


        System.out.println(driver.findElement(By.xpath("//h4[.='Hello World!']")).getText());


        // Fluent wait is more specialized version of Explicit wait where you can control polling frequency and exceptions while waiting

        // Polling frequency -> frequency of webdriver going to the browser and trying to locate the webelement
        // default polling frequency -> 500 ms (0.5 second)

        Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class)
                .ignoring(ElementNotInteractableException.class);






    }
}
