package MArch26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HandlingIframes2 {


    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "/Users/duotech/Documents/browserDrivers/chromedriver");


        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        // Implicit wait is applied globally to all instances of findElement method
        driver.manage().window().maximize();

        driver.get("https://www.duotech.io/enroll-sqae2");

        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[starts-with(@id, '1648')]")));

     driver.findElement(By.xpath("//input[@placeholder='First']")).sendKeys("John");

       driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='reCAPTCHA']")));

        System.out.println(driver.findElement(By.xpath("//label[@id='recaptcha-anchor-label']")).getText());

       //When interacting with nested iframe, we need to switch to the parent iframe first then from there to child iframe

    //    driver.switchTo().defaultContent(); // switches the context to the main html
        driver.switchTo().parentFrame(); // switches the context to the parent iframe

        driver.findElement(By.xpath("//input[@placeholder='Last']")).sendKeys("Doe");

        // While you are in nested child iframe and would like to switch to its parent iframe, you need to use parentFrame()


        

    }
}
