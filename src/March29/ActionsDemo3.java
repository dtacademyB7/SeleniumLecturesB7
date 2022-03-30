package March29;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class ActionsDemo3 {


    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "/Users/duotech/Documents/browserDrivers/chromedriver");


        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        // Implicit wait is applied globally to all instances of findElement method
        driver.manage().window().maximize();



        driver.get("https://javascript.info/mouse-drag-and-drop");

        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='code-tabs__result']")));

        WebElement source = driver.findElement(By.id("ball"));

        WebElement target = driver.findElement(By.id("gate"));


        new Actions(driver).dragAndDrop(source, target).build().perform();



        driver.get("https://unsplash.com/images");


        ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,1500);");

        new Actions(driver).
                moveToElement(driver.findElement(By.xpath("//a[@href='https://unsplash.com/photos/KzrTgVCh5WA/download?force=true']"))).click(driver.findElement(By.xpath("//a[@href='https://unsplash.com/photos/KzrTgVCh5WA/download?force=true']"))).build().perform();


    }
}
