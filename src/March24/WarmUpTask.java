package March24;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class WarmUpTask {


    public static void main(String[] args) throws InterruptedException {



        System.setProperty("webdriver.chrome.driver", "/Users/duotech/Documents/browserDrivers/chromedriver");


        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        // Implicit wait is applied globally to all instances of findElement method
        driver.manage().window().maximize();

        driver.get("https://www.dice.com/");

        String searchTerm = "sdet";

        driver.findElement(By.cssSelector("#typeaheadInput")).sendKeys(searchTerm);


        driver.findElement(By.cssSelector("input[placeholder='Location (zip, city, state)']")).
                sendKeys("Tysons Corner, VA");

        driver.findElement(By.cssSelector("button.btn.btn-block.btn-primary.btn-efc-primary.px-4")).click();


        // Static wait
//        Thread.sleep(2000);

        List<WebElement> links = driver.findElements(By.cssSelector("a[class='card-title-link bold']"));


//        System.out.println(links.size());
        for (WebElement link : links) {

            Assert.assertTrue(link.getText().toLowerCase().contains(searchTerm.toLowerCase()));
            System.out.println(link.getText());
        }





    }
}
