import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethods {


    public static void main(String[] args) throws InterruptedException {



        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\browserDrivers\\chromedriver.exe");


        WebDriver driver = new ChromeDriver(); // initializes a browser


        driver.get("https://www.duotech.io/"); // navigates to url

        Thread.sleep(1000);

        driver.navigate().to("https://www.amazon.com/");

        Thread.sleep(1000);

        driver.navigate().to("https://www.selenium.dev/");
        Thread.sleep(1000);

        driver.navigate().back();

        Thread.sleep(1000);

        driver.navigate().back();

        Thread.sleep(1000);

        driver.navigate().forward();

        Thread.sleep(1000);

        driver.navigate().refresh();

        Thread.sleep(1000);


        driver.quit();

    }
}
