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

public class WebTables {


    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/duotech/Documents/browserDrivers/chromedriver");


        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        // Implicit wait is applied globally to all instances of findElement method
        driver.manage().window().maximize();

        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");


        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester", Keys.TAB, "test", Keys.ENTER);


        driver.findElement(By.linkText("View all products")).click();

// Verify data in a header row
        List<String> expectedColumnNames = Arrays.asList("Product name", 	"Price",    "Discount");

        List<WebElement> ths = driver.findElements(By.xpath("//table[@class='ProductsTable']//tr[1]//th"));

        List<String> actualColumnNames = new ArrayList<>();

        for (WebElement th : ths) {
            actualColumnNames.add(th.getText());
        }

        Assert.assertEquals(actualColumnNames,expectedColumnNames);


        // To get 3rd rows 3rd cell -> //table[@class='ProductsTable']//tr[3]//td[3]

        // Verify Data in the first column
        List<WebElement> firstColumnValues = driver.findElements(By.xpath("//table[@class='ProductsTable']//tr//td[1]"));


        for (WebElement firstColumnValue : firstColumnValues) {
            System.out.println(firstColumnValue.getText());
        }


    }
}
