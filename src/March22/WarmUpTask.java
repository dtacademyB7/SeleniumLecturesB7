package March22;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class WarmUpTask {


    public static void main(String[] args) {



        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\browserDrivers\\chromedriver.exe");


        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();


        driver.get("https://www.amazon.com/");

        // Enter  a search term to the search input box

        String searchTerm = "Sony";

        driver.findElement(By.xpath("//input[@class='nav-input nav-progressive-attribute'][@aria-label='Search']")).
                sendKeys(searchTerm + Keys.ENTER);

        // Verify that we have the search results

        Assert.assertTrue(driver.getTitle().contains(searchTerm));


        List<WebElement> links = driver.findElements(By.xpath("//div[not(@data-component-props)]//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal']"));

        ////div[@class='a-section a-spacing-none s-padding-right-small s-title-instructions-style']//span[not(contains(text(), 'Sponsored'))]
        for (WebElement link : links) {
            System.out.println(link.getText());
           Assert.assertTrue(link.getText().contains(searchTerm));
        }

        driver.quit();
    }
}
