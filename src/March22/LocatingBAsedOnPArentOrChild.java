package March22;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingBAsedOnPArentOrChild {


    public static void main(String[] args) throws InterruptedException {






        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\browserDrivers\\chromedriver.exe");


        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();


        driver.get("https://www.duotech.io/");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,2150)", "");

        Thread.sleep(1000);


        // When the element is not unique, you can locate its unique ancesctor(parent,grandparent, etc) and then go to the non-unique child
        //  Finding a non-unique child through its unique parent
        //div[@class='section-header-wrapper']//h2[@class='section-header']

        System.out.println(driver.findElement(By.xpath("//div[@class='section-header-wrapper']//h2[@class='section-header']")).getText());


        //  Finding a non-unique parent through its unique child
        //h6[contains( text(), 'Path to IT'  )]//parent::div

        System.out.println(driver.findElement(By.xpath("//h6[contains( text(), 'Path to IT'  )]//parent::div")).getText());

        //  Finding a non-unique sibling through its following unique sibling
        //div[@data-w-id='92c1b980-fe6d-eb89-3ea1-81623181a21b']//preceding-sibling::div

        System.out.println(driver.findElement(By.xpath("//div[@data-w-id='92c1b980-fe6d-eb89-3ea1-81623181a21b']//preceding-sibling::div")).getText());

        //  Finding a non-unique sibling through its preceding unique sibling
        //div[@data-w-id='92c1b980-fe6d-eb89-3ea1-81623181a21b']/following-sibling::div
        System.out.println(driver.findElement(By.xpath("//div[@data-w-id='92c1b980-fe6d-eb89-3ea1-81623181a21b']/following-sibling::div")).getText());


        //Predicates can be used to select from multiple matches -> //div[@class='services-simple']/div[2]
        // Predicates are not zero based


        System.out.println("------------------Second Div with predicate------------------------");
        System.out.println(driver.findElement(By.xpath("//div[@class='services-simple']/div[2]")).getText());


        // Another way to use predicate is to surround the entire xpath expression and use predicate on it

       //

        System.out.println("------------------Third h6 with Predicate------------------------");
        System.out.println(driver.findElement(By.xpath("(//h6[@class='service-simple-header'])[3]")).getText());

     // Find all h2 elements that have class attribute => //h2[@class]
        // Find all h2 elements that do not have class attribute => //h2[not(@class)]



    }
}
