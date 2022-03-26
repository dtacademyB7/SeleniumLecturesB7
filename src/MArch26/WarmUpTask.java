package MArch26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WarmUpTask {


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/duotech/Documents/browserDrivers/chromedriver");


        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        // Implicit wait is applied globally to all instances of findElement method
        driver.manage().window().maximize();

        driver.get("https://www.bloomberg.com/markets/stocks");


        // Verify column names

        List<String> expected =  Arrays.asList("NAME", "VALUE", "NET CHANGE", "% CHANGE", "1 MONTH", "1 YEAR", "TIME (EDT)");



        String xpath = "//a[.='Americas']//ancestor::div[@class='table-container__header']//following-sibling::table//thead//tr//th";

        List<WebElement> ths = driver.findElements(By.xpath(xpath));

        List<String> actual = SeleniumUtility.getElementsText(ths);

        Assert.assertEquals(actual,expected);



        List<String> expectedCols =  Arrays.asList("DOW JONES INDUS. AVG", "S&P 500 INDEX", "NASDAQ COMPOSITE", "NYSE COMPOSITE INDEX", "S&P/TSX COMPOSITE INDEX");

        // Verify the first column names

        List<WebElement> firstCol = driver.findElements(By.xpath("//a[.='Americas']//ancestor::div[@class='table-container__header']//following-sibling::table//tbody//div[@data-type='full']"));

        List<String> actualCols = SeleniumUtility.getElementsText(firstCol);

        Assert.assertEquals(actualCols,expectedCols);


    }
}
