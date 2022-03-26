package MArch26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HandlingIframes {


    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "/Users/duotech/Documents/browserDrivers/chromedriver");


        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        // Implicit wait is applied globally to all instances of findElement method
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/iframe");



      //  driver.switchTo().frame(0);  // by zero based index
     // driver.switchTo().frame("mce_0_ifr");  // by id or name attribute value

        WebElement iframeWebElement = driver.findElement(By.xpath("//iframe[@class='tox-edit-area__iframe']"));

        driver.switchTo().frame(iframeWebElement);


        System.out.println(driver.findElement(By.xpath("//p[contains( text(), 'content goes')]")).getText());

    }
}
