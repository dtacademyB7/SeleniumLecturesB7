package MArch26;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HandlingAlerts {


    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "/Users/duotech/Documents/browserDrivers/chromedriver");


        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        // Implicit wait is applied globally to all instances of findElement method
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");


//        driver.findElement(By.xpath("//button[.='Click for JS Alert']")).click();
//
//        Thread.sleep(1000);
//        Alert alert = driver.switchTo().alert();
//
//        alert.accept(); // click OK
//
//        System.out.println(driver.findElement(By.xpath("//a[.='Elemental Selenium']")).getText());
//
//
//        // Confirm
//
//        driver.findElement(By.xpath("//button[.='Click for JS Confirm']")).click();
//        Thread.sleep(1000);
//        // Getting text
//        System.out.println(driver.switchTo().alert().getText());
//        driver.switchTo().alert().dismiss();
//        System.out.println(driver.findElement(By.xpath("//a[.='Elemental Selenium']")).getText());

        // Prompt

        driver.findElement(By.xpath("//button[.='Click for JS Prompt']")).click();
        Thread.sleep(1000);

        driver.switchTo().alert().sendKeys("John Doe");
        driver.switchTo().alert().accept();


        System.out.println(driver.findElement(By.xpath("//a[.='Elemental Selenium']")).getText());








    }
}
