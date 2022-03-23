package March19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {


    public static void main(String[] args) {



        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\browserDrivers\\chromedriver.exe");


        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();


        driver.get("https://www.duotech.io/");


//        driver.findElement(By.xpath("//@id")); // all elements that have id attribute
        driver.findElement(By.xpath("//*"));  // all elements on the page

        System.out.println(driver.findElement(By.xpath("//div[@id='w-dropdown-toggle-1']")).getText());

      // You can combine multiple attributes

        System.out.println(driver.findElement(By.xpath("//div[@data-ix='fade-right'][@data-w-id='832e25ad-bfee-0ba6-c177-705adc2d6a16']")).getText());


        // Find an element based on its text

        //h3[.='Business Systems Analyst']
        System.out.println(driver.findElement(By.xpath("//h3[.='Business Systems Analyst']")).getTagName());




    }
}
