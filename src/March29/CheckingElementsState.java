package March29;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class CheckingElementsState {


    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/duotech/Documents/browserDrivers/chromedriver");


        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        // Implicit wait is applied globally to all instances of findElement method
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/dynamic_controls");


        System.out.println(driver.findElement(By.xpath("//input[@type='text']")).isEnabled());
        if( driver.findElement(By.xpath("//input[@type='text']")).isEnabled()){
            driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Duotech");

        }
        //org.openqa.selenium.ElementNotInteractableException: element not interactable

        driver.findElement(By.xpath("//button[.='Enable']")).click();

       WebElement inputBox =  driver.findElement(By.xpath("//input[@type='text']"));

       while (!inputBox.isEnabled()){ // to programmatically wait till the element is enabled

       }
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Duotech");

       // isDisplayed() ->

        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");


        WebElement helloWorld = driver.findElement(By.xpath("//h4[.='Hello World!']"));

        System.out.println(helloWorld.isDisplayed());

        driver.findElement(By.xpath("//button[.='Start']")).click();


        while(!helloWorld.isDisplayed()){  // usage while loop is not recommended, since it might result in infinite loop

        }

        System.out.println(helloWorld.getText());








    }
}
