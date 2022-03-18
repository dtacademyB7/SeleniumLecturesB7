import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSource {


    public static void main(String[] args) {


//
      // Go to diotech homepage
        // And verify that page contains "Start New IT Career"

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\browserDrivers\\chromedriver.exe");


        WebDriver driver = new ChromeDriver(); // initializes a browser


        driver.get("https://www.duotech.io/"); // navigates to url


        String pageSource = driver.getPageSource().replace("&nbsp;", " ");


        if(pageSource.contains("Start New IT Career")){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }


        driver.quit(); //Quits this driver(entire seesion), closing every associated window.
//        driver.close(); //Close the current window, quitting the browser if it's the last window currently open.






//







    }
}
