import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingMechanisms {


    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\browserDrivers\\chromedriver.exe");

        // Open a browser
        WebDriver driver = new ChromeDriver(); // initializes a browser





        // Navigate to http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx

        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");


//        driver.findElement(By.className("txt")).sendKeys("dcgsdvvcdshg");

        driver.findElement(By.tagName("input")).sendKeys("jbcsadvghcvsdhgcvhsdgchvsg");


       Thread.sleep(1000);

        driver.quit();
    }
}
