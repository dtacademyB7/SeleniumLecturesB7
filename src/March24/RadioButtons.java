package March24;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;
import java.time.Duration;
import java.util.List;
import java.util.Random;

public class RadioButtons {


    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/duotech/Documents/browserDrivers/chromedriver");


        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        // Implicit wait is applied globally to all instances of findElement method
        driver.manage().window().maximize();

        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");


        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester", Keys.TAB, "test", Keys.ENTER);


        driver.findElement(By.linkText("Order")).click();

        WebElement radioButtonAmex = driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_2"));

        System.out.println(radioButtonAmex.isSelected());

        radioButtonAmex.click();

        System.out.println(radioButtonAmex.isSelected());











//        List<WebElement> radioButtons = driver.findElements(By.xpath("//input[@type='radio']"));
//
//
//        radioButtons.get(new Random().nextInt(radioButtons.size())).click();



    }
}
