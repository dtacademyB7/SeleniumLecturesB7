package March19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElements {


    public static void main(String[] args) {




        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\browserDrivers\\chromedriver.exe");


        WebDriver driver = new ChromeDriver(); // initializes a browser


         // Navigate to duotech.io

        // Verify their text


        driver.get("https://www.duotech.io/");
//        driver.findElement(By.tagName("a")).click();  // finds the first link in the html document hierarchy
      WebElement firstLink =  driver.findElement(By.tagName("iframe"));
//      firstLink.click();
      List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("The links on the page are " + links.size());
        for (WebElement link : links) {
            System.out.println(link.getText());
        }

        System.out.println(links.getClass());


        System.out.println(driver.findElements(By.tagName("h2")).size());


        // What happens when findelement method cannot find an element? -> NoSuchElementException
        // What happens when findelements method cannot find any element? -> Empty list


        System.out.println(driver.findElements(By.tagName("iframe")).size());


    }
}
