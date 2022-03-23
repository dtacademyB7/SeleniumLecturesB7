package March19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class LinkText {


    public static void main(String[] args) {




        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\browserDrivers\\chromedriver.exe");


        WebDriver driver = new ChromeDriver(); // initializes a browser


         // Navigate to duotech.io




        driver.get("https://www.duotech.io/");

        driver.findElement(By.linkText("Blog")).click();

        String expectedTitle = "Welcome to our Blog. Learn more about the latest IT news";

        Assert.assertEquals(driver.getTitle(), expectedTitle);  // TestNG's assertion method
        // TestNG assertion methods compare ACTUAL with EXPECTED
        Assert.assertTrue(driver.getTitle().contains("Welcome to our Blog"));





    }
}
