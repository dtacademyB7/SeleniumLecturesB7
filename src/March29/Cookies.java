package March29;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.Set;

public class Cookies {


    public static void main(String[] args) throws IOException {

        System.setProperty("webdriver.chrome.driver", "/Users/duotech/Documents/browserDrivers/chromedriver");


        WebDriver driver = new ChromeDriver();


//


        driver.get("https://www.amazon.com/");

        Set<Cookie> cookies = driver.manage().getCookies();

        for (Cookie cookie : cookies) {
            System.out.println(cookie.toString());
        }

        driver.manage().deleteAllCookies();

    }
}
