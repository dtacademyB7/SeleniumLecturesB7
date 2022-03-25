package March24;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DropdownsWithNoSelect {


    public static void main(String[] args) throws InterruptedException {




        System.setProperty("webdriver.chrome.driver", "/Users/duotech/Documents/browserDrivers/chromedriver");


        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        // Implicit wait is applied globally to all instances of findElement method
        driver.manage().window().maximize();

        driver.get("https://www.hoteltonight.com/");


        driver.findElement(By.name("searchfield")).click();


        driver.findElement(By.name("searchfield")).sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER);

        // If the dropdown box is not created with <select> tag you can't use Select class and handle it with its methods
        // You need to handle that element ust like any other Webelement


        driver.findElement(By.xpath("//button[@data-aid='find-hotels-btn']")).click();







    }

}
