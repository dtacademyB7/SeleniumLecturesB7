package March19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class PartialLinkText {


    public static void main(String[] args) {




        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\browserDrivers\\chromedriver.exe");


        WebDriver driver = new ChromeDriver(); // initializes a browser


         // Navigate to duotech.io


        driver.manage().window().maximize();  // maximizes the window

        driver.get("https://www.amazon.com");

        driver.findElement(By.partialLinkText("women-owned")).click();

        //ElementClickInterceptedException: -> happens when trying to click on an element and another element covers the intended element









    }
}
