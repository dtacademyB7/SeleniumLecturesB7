package MArch26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class HandleWindowa {


    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/duotech/Documents/browserDrivers/chromedriver");


        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        // Implicit wait is applied globally to all instances of findElement method
        driver.manage().window().maximize();

        driver.get("https://www.toyota.com/");

        String MainWindowHandle = driver.getWindowHandle(); //CDwindow-45238B37E62867338373E86B0EAC5A77

        System.out.println(MainWindowHandle);

        driver.findElement(By.xpath("//a[@aria-label='DO NOT SELL MY PERSONAL INFORMATION']")).click();


        Set<String> windowHandles = driver.getWindowHandles();

        for (String windowHandle : windowHandles) {

            if(!windowHandle.equals(MainWindowHandle)){
                driver.switchTo().window(windowHandle);
            }
        }


        System.out.println(driver.getTitle());


    }
}
