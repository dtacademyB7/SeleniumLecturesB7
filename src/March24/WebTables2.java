package March24;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WebTables2 {


    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/duotech/Documents/browserDrivers/chromedriver");


        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        // Implicit wait is applied globally to all instances of findElement method
        driver.manage().window().maximize();

        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");


        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester", Keys.TAB, "test", Keys.ENTER);


        driver.findElement(By.linkText("View all orders")).click();


        // Find the number of columns

        int columnCount = driver.findElements(By.xpath("//table[@class='SampleTable']//tr[1]//th")).size();


        int rowCount = driver.findElements(By.xpath("//table[@class='SampleTable']//tr")).size();


        for (int i = 2; i <=rowCount ; i++) {


            for (int j = 1; j <=columnCount ; j++) {

                String xpath = "//table[@class='SampleTable']//tr[" + i + "]//td[" + j +"]";
//                System.out.println(xpath);
                System.out.print(driver.findElement(By.xpath(xpath)).getText() + "");

            }
            System.out.println();
        }


    }
}
