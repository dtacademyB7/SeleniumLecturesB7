package March19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebElementMethodsGetText {


    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\browserDrivers\\chromedriver.exe");


        WebDriver driver = new ChromeDriver();




        driver.get("http://automationpractice.com/index.php?id_product=1&controller=product");

        String h1text = driver.findElement(By.tagName("h1")).getText();

        System.out.println(h1text);


        System.out.println(driver.findElement(By.tagName("table")).getText());


    }
}
