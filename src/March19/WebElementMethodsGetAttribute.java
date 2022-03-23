package March19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebElementMethodsGetAttribute {


    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\browserDrivers\\chromedriver.exe");


        WebDriver driver = new ChromeDriver();


        driver.get("https://www.duotech.io/");

        WebElement learn_more_link = driver.findElement(By.linkText("Learn More"));

        String classAttr = learn_more_link.getAttribute("class");

        System.out.println(classAttr);


        List<WebElement> links = driver.findElements(By.tagName("a"));


        for (WebElement link : links) {
            System.out.println( link.getAttribute("href"));
        }


        driver.get("http://automationpractice.com/index.php?id_product=1&controller=product");

        //To grab the text from an input box

        // You cannot do this with getText() method
        System.out.println(driver.findElement(By.id("quantity_wanted")).getAttribute("value"));
        // 1


        String attribute = driver.findElement(By.id("search_query_top")).getAttribute("value");

        System.out.println(attribute.isEmpty());

        driver.findElement(By.id("search_query_top")).sendKeys("Blablav dsbjvcdvsd");

        attribute = driver.findElement(By.id("search_query_top")).getAttribute("value");

        System.out.println(attribute);



    }
}
