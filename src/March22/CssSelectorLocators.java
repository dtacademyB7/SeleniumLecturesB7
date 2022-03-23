package March22;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorLocators {


    public static void main(String[] args) {



        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\browserDrivers\\chromedriver.exe");


        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();


        driver.get("https://www.duotech.io/");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,4500)", "");

       // Full css selector path -> "html body div div form input"   xpath -> html/body/div/div/form/input


        // In css . represents class and  # represents id

        System.out.println(driver.findElement(By.cssSelector("div#w-dropdown-toggle-4")).getText()); // div with id w-dropdown-toggle-4

       // h1.black-text -> h1 with a class black-text
        System.out.println(driver.findElement(By.cssSelector("h1.black-text")).getText()); // h1 with a class black-text

        System.out.println(driver.findElement(By.cssSelector("#w-dropdown-toggle-5")).getText()); // an element with an id w-dropdown-toggle-5

//        Locate an element with diffrenet attributes
        //              a[href='/enroll-sqae2']

        System.out.println(driver.findElement(By.cssSelector("a[href='/enroll-sqae2']")).getText());

        // Multiple attributes -> a[href='/enroll-sqae2'][class='button-2 w-button']

        //a.w-button.button -> a with class values w-button and button





    }
}
