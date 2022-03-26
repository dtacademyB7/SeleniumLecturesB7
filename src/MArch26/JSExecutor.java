package MArch26;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class JSExecutor {

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "/Users/duotech/Documents/browserDrivers/chromedriver");


        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        // Implicit wait is applied globally to all instances of findElement method
        driver.manage().window().maximize();

//        driver.get("https://www.volvo.com/en/");
//
//        driver.findElement(By.id("onetrust-accept-btn-handler")).click();
//
//        Thread.sleep(1000);
//
//        WebElement carsLink = driver.findElement(By.xpath("//a[contains(text(), 'Cars')][@class='with-background']"));

       JavascriptExecutor js =  (JavascriptExecutor) driver;

//       js.executeScript("arguments[0].click();", carsLink);


       driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2ftestcomplete12%2fweborders%2fDefault.aspx");

       js.executeScript("document.getElementById('ctl00_MainContent_username').value='Tester';");



        driver.get("https://www.duotech.io/");


        js.executeScript("window.scrollBy(0,1800)");

        Thread.sleep(1000);

        System.out.println(driver.findElement(By.xpath("//h3[contains(text(), 'Business Systems Analyst')]")).getText());






    }
}
