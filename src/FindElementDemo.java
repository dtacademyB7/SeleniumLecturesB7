import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementDemo {


    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\browserDrivers\\chromedriver.exe");

        // Open a browser
        WebDriver driver = new ChromeDriver(); // initializes a browser





        // Navigate to http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx

        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");



        // Enter Tester as a username

//        WebElement  usernameField = driver.findElement(By.id("ctl00_MainContent_username"));
//        usernameField.sendKeys("Tester");

        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
//        driver.findElement(By.id("ctl00_MainContent_usernam")).sendKeys("Tester");
       // if an element is not found, NoSuchElementException: no such element: Unable to locate element  is thrown

        // Enter test as a password

        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        // Click login

        driver.findElement(By.name("ctl00$MainContent$login_button")).click();

        // Verify that login was successful

        if(driver.getPageSource().contains("Logout")){
            System.out.println("PASSED");
        }else{
            System.out.println("FAIL");
        }


        Thread.sleep(1000);

        driver.quit();
    }
}
