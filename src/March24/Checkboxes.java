package March24;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class Checkboxes {


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/duotech/Documents/browserDrivers/chromedriver");


        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        // Implicit wait is applied globally to all instances of findElement method
        driver.manage().window().maximize();

        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");


        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester", Keys.TAB, "test", Keys.ENTER);


        driver.findElement(By.linkText("View all orders")).click();

        driver.findElement(By.name("ctl00$MainContent$orderGrid$ctl02$OrderSelector")).click();
        Thread.sleep(1000);


        // CHECK ALL CHECKBOXES

        List<WebElement> chx = driver.findElements(By.xpath("//input[@type='checkbox']"));

        for (WebElement checkbox : chx) {
            if(!checkbox.isSelected()){
                checkbox.click();
            }

        }

        driver.findElement(By.id("ctl00_MainContent_btnDelete")).click();

        Assert.assertTrue(driver.getPageSource().contains("List of orders is empty. In order to add new order use"));


    }
}
