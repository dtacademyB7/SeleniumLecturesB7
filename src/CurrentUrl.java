import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CurrentUrl {


    public static void main(String[] args) {




        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\browserDrivers\\chromedriver.exe");

        // Open a browser
        WebDriver driver = new ChromeDriver(); // initializes a browser

        // Navigate to diotech home page
        driver.get("https://www.duotech.io/"); // navigates to url

        // Verify that the url is
        String currentUrl = driver.getCurrentUrl();

        String expectedUrl = "http://www.duotech.io/";


        if(currentUrl.equals(expectedUrl)){
            System.out.println("Test passed: " + currentUrl);
        }else{
            System.out.println("Test failed. The current url was " + currentUrl);
        }






//







    }
}
