package March29;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class ActionsDemo2 {


    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "/Users/duotech/Documents/browserDrivers/chromedriver");


        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        // Implicit wait is applied globally to all instances of findElement method
        driver.manage().window().maximize();

        driver.get("https://www.plus2net.com/javascript_tutorial/ondblclick-demo.php");



        Actions actions = new Actions(driver);

        actions.doubleClick(driver.findElement(By.id("box"))).build().perform();


        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html#example-html-simple-context-menu");

        WebElement button = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));

        actions.contextClick(button).
                sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER ).build().perform();



        driver.get("https://javascript.info/mouse-drag-and-drop");

        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='code-tabs__result']")));

        WebElement source = driver.findElement(By.id("ball"));

        WebElement target = driver.findElement(By.id("gate"));


        actions.dragAndDrop(source, target).build().perform();


    }
}
