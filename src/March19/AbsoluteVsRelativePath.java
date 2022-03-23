package March19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteVsRelativePath {


    public static void main(String[] args) {



        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\browserDrivers\\chromedriver.exe");


        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();


        driver.get("https://www.duotech.io/");


        // Full(Absolute) path uses / and requires all the elements along the html hirarchy to be mentioned
        System.out.println(driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/h1")).getText());

        // Relative path  uses // and does not require full path to the element in html

        // Relative xpath is preferred since absolute path can eventually break due to the changes on the UI made by devs


        System.out.println(driver.findElement(By.xpath("//h1")).getText());


    }
}
