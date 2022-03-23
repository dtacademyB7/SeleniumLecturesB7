package March22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateDynamicElementsXpath {


    public static void main(String[] args) {


        // Dynamic element -> element whose attribute values change with each load of the page


        // How do you handle dynamic elements?

        // Find a part of the attribute value that is static and use starts-with, end-with or contains methods

        //input[starts-with(@name, 'name')]

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\browserDrivers\\chromedriver.exe");


        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();


        driver.get("https://register.rediff.com/register/register.php");


        //input[starts-with(@name, 'name')] - starts with
        //input[ends-with(@name, 'name')] - starts with
        //input[contains(@name, 'name')] - starts with


        driver.findElement(By.xpath("//input[starts-with(@name, 'name')]")).sendKeys("Duotech Academy");



    }
}
