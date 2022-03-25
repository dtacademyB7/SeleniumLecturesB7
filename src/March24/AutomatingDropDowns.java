package March24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AutomatingDropDowns {


    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "/Users/duotech/Documents/browserDrivers/chromedriver");


        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        // Implicit wait is applied globally to all instances of findElement method
        driver.manage().window().maximize();

        driver.get("https://www.cars.com/");



//        WebElement yearDropDown = driver.findElement(By.xpath("//select[@placeholder='Year']"));
//
//        Select select = new Select(yearDropDown);
//
//        Select select = new Select(driver.findElement(By.xpath("//select[@id='makes']")));
//
//        select.selectByVisibleText("Lamborghini");
//
//
//        new Select(driver.findElement(By.xpath("//select[@id='models']"))).selectByVisibleText("Urus");


        new Select(driver.findElement(By.xpath("//select[@id='makes']"))).selectByValue("lexus");

        new Select(driver.findElement(By.xpath("//select[@id='models']"))).selectByValue("lexus-gs_350");

        new Select(driver.findElement(By.xpath("//select[@id='make-model-maximum-distance']"))).selectByIndex(0);
        // indexes in here start from zero


      //  new Select(driver.findElement(By.xpath("//select[@id='make-model-max-price']"))).deselectByIndex(2);

      // deselect methods only work with multi-select drop down boxes. If dexselect methods are called on regular droipdowns
        // You may only deselect options of a multi-select exception will be thrown



     String actual =    new Select(driver.findElement(By.xpath("//select[@id='make-model-max-price']"))).getFirstSelectedOption().getText();


        Assert.assertEquals(actual, "No max price");


        // Verify the dropdown box values

        List<String> expectedValues = Arrays.asList("New & used cars", "New & certified cars", "New cars", "Used cars", "Certified cars");


        List<WebElement> options = new Select(driver.findElement(By.xpath("//select[@id='make-model-search-stocktype']"))).getOptions();

        List<String> actualValues = new ArrayList<>();

        for (WebElement option : options) {
           actualValues.add(option.getText());
        }

        Assert.assertEquals(actualValues, expectedValues);










    }
}
