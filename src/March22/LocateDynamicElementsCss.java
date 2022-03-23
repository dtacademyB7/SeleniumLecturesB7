package March22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateDynamicElementsCss {


    public static void main(String[] args) {


        // Dynamic element -> element whose attribute values change with each load of the page


        // How do you handle dynamic elements?

        // Find a part of the attribute value that is static and use starts-with, end-with or contains methods

        //input[starts-with(@name, 'name')]

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\browserDrivers\\chromedriver.exe");


        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();


        driver.get("https://register.rediff.com/register/register.php");


        //     input[name^='name'] - starts with name
        //     input[name$='name'] - ends with name
        //     input[name*='name'] - contains name


        driver.findElement(By.cssSelector("input[name^='name']")).sendKeys("Duotech Academy");




        // Xpath vs CSSLocators

        // CSS is faster than Xpath

        // With CSS you cannot locate an element by its text, with Xpath you can (strict equality and partial match)

        // Xpath allows forward and backward movement in HTML document when locating an element (you can locate a child then from there go back in hierarchy and locate the parent)
        //  whereas CSS only supports forward movement/location strategy

        // XPath syntax is more complex and versatile but also more powerful

        // Xpath supports index ([2]), CSS not



//         Explain me your WebElement location strategy

        // id/name - First Choice
        // if Link -> linkText, partialLinkText
        // class and tagname should be used if you want group of elements

        // Xpath or CssSelector









    }
}
