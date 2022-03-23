package March19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WebElementMethodsGetLocation {


    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\browserDrivers\\chromedriver.exe");


        WebDriver driver = new ChromeDriver();




        driver.get("https://www.duotech.io/");


        System.out.println(driver.findElement(By.tagName("img")).getLocation());

        // 16, 23

        driver.manage().window().maximize();

        System.out.println(driver.findElement(By.tagName("img")).getLocation());



    }
}
