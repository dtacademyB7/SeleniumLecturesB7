package March29;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.time.Duration;
import java.util.Set;

public class FileUploadAndDownload {


    public static void main(String[] args) throws IOException {

        System.setProperty("webdriver.chrome.driver", "/Users/duotech/Documents/browserDrivers/chromedriver");


        WebDriver driver = new ChromeDriver();

       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();


//        driver.get("https://duonotary.com/online");
//
//        // Locate the input element with type='file'
//
//        driver.findElement(By.xpath("//div[.='Schedule']")).click();
//
//        // Locate the input element with type='file' and sendkeys() with path of the file you want to upload
//        driver.findElement(By.id("documentOnline")).sendKeys("/Users/duotech/Downloads/Example Outputs.pdf");


        // Download a photo

        driver.get("https://unsplash.com/images");
//        ElementClickInterceptedException: element click intercepted:

        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", driver.findElement(By.xpath("//a[@href='https://unsplash.com/photos/KzrTgVCh5WA/download?force=true']")));

    }
}
