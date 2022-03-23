package March19;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethodsSendKeys {


    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\browserDrivers\\chromedriver.exe");


        WebDriver driver = new ChromeDriver();




        driver.get("https://www.google.com/");

//        driver.findElement(By.name("q")).sendKeys("Selenium Jobs" +  Keys.ENTER);
//        driver.findElement(By.name("q")).sendKeys("Selenium Jobs" , Keys.ENTER);

        driver.findElement(By.name("q")).sendKeys("Selenium Jobs");

        for (int i = 0; i < 5; i++) {
            driver.findElement(By.name("q")).sendKeys(Keys.DOWN);
            Thread.sleep(500);
        }

        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);


    }
}
