package March24;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.time.Duration;
import java.util.List;

public class WebTables3 {


    public static void main(String[] args) throws AWTException {

        System.setProperty("webdriver.chrome.driver", "/Users/duotech/Documents/browserDrivers/chromedriver");


        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        // Implicit wait is applied globally to all instances of findElement method
        driver.manage().window().maximize();

        driver.get("https://www.livecoinwatch.com/");


        List<WebElement> currencies = driver.findElements(By.xpath("//table[@class='lcw-table layout-fixed']//tbody//tr//td[2]"));


        Robot robot = new Robot();




        for (WebElement currency : currencies) {
            System.out.println(currency.getText());
        }

        int rowOfDoge = 0;
        for (int i = 0; i < currencies.size(); i++) {

            System.out.println(currencies.get(i).getText());
            if(currencies.get(i).getText().contains("DOGE")){
                rowOfDoge = i;
            }
        }

//        System.out.println(rowOfDoge);



        System.out.println(driver.findElement(By.xpath("//table[@class='lcw-table layout-fixed']//tbody//tr["+(++rowOfDoge)+"]")).getText());




    }
}
