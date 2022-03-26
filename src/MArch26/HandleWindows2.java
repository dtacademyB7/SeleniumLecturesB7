package MArch26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class HandleWindows2 {


    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/duotech/Documents/browserDrivers/chromedriver");


        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        // Implicit wait is applied globally to all instances of findElement method
        driver.manage().window().maximize();

        driver.get("https://www.toyota.com/");



        driver.findElement(By.xpath("//a[@aria-label='DO NOT SELL MY PERSONAL INFORMATION']")).click();
        driver.findElement(By.xpath("//a[@aria-label=' SIGN UP FOR TOYOTA UPDATES']")).click();


        SeleniumUtility.switchToWindow("@TOYOTA ACCESS", driver);

        System.out.println(driver.getTitle());

        SeleniumUtility.switchToWindow("Toyota - Lexus Privacy Hub", driver);

        System.out.println(driver.getTitle());

        // In order to interact with the newly opened window we need to switch the WebDriver context to that window with switchTo().window()
        // You can use window's title to switch to each window using loop and window handles and check its title and stay there if title matches

      //  driver.close(); // closes the currently active window
       // once you close the active window, you need to switch to another window explicitly, it doesn't switch to other window automatically

      //  System.out.println(driver.getTitle()); //org.openqa.selenium.NoSuchWindowException: no such window: target window already closed


        driver.quit();  //Quits this driver, closing every associated window.

//        driver = new ChromeDriver();

//        driver.get("https://www.toyota.com/"); //NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?

    }



}
