package MArch26;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HandlingAlerts2 {


    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "/Users/duotech/Documents/browserDrivers/chromedriver");


        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        // Implicit wait is applied globally to all instances of findElement method
        driver.manage().window().maximize();

        driver.get("https://www.volvo.com/en/");


        driver.findElement(By.id("onetrust-accept-btn-handler")).click();

        Thread.sleep(1000);

        WebElement element = driver.findElement(By.xpath("//div[@class='header__metanav header__metanav--desktop hidden-phone hidden-tablet']//a[contains(text(), 'Construction')]"));

        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);










    }
}
