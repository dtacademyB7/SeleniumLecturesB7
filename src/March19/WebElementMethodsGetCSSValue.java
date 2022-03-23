package March19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WebElementMethodsGetCSSValue {


    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\browserDrivers\\chromedriver.exe");


        WebDriver driver = new ChromeDriver();




        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");


         driver.findElement(By.name("ctl00$MainContent$login_button")).click();

        System.out.println(driver.findElement(By.id("ctl00_MainContent_status")).getCssValue("color"));
        System.out.println(driver.findElement(By.id("ctl00_MainContent_status")).getCssValue("font-family"));
        System.out.println(driver.findElement(By.id("ctl00_MainContent_status")).getCssValue("font-size"));

        String expectedColor = "rgba(255, 0, 0, 1)";


        Assert.assertEquals(driver.findElement(By.id("ctl00_MainContent_status")).getCssValue("color"),
                         expectedColor);


    }
}
