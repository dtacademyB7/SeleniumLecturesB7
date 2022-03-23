package March19;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethodsClear {


    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\browserDrivers\\chromedriver.exe");


        WebDriver driver = new ChromeDriver();




        driver.get("https://www.dice.com/");




        driver.findElement(By.id("google-location-search")).sendKeys("Washington, DC");
        Thread.sleep(1000);
        driver.findElement(By.id("google-location-search")).clear();
        Thread.sleep(1000);

        driver.findElement(By.id("google-location-search")).sendKeys("Merrifield VA");




    }
}
