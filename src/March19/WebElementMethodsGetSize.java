package March19;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebElementMethodsGetSize {


    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\browserDrivers\\chromedriver.exe");


        WebDriver driver = new ChromeDriver();




        driver.get("https://www.duotech.io/");

        System.out.println(driver.manage().window().getSize());

        System.out.println(driver.findElement(By.tagName("img")).getSize());

        driver.manage().window().setSize(new Dimension(1500, 1012));

        driver.manage().window().setSize(new Dimension(800, 900));


//        driver.manage().window().maximize();
//
        WebElement elem = driver.findElement(By.tagName("img"));

        System.out.println(elem.getSize());


        System.out.println(elem.getTagName());


        List<WebElement> elements = driver.findElements(By.xpath("//*"));


//        for (WebElement element : elements) {
//            System.out.println(element.getTagName());
//        }


        for (WebElement element : elements) {
            if(element.getTagName().equals("p")){
                System.out.println(element.getText());
            }
        }


    }
}
