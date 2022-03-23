package March17;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {


    public static void main(String[] args) {


//


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Documents\\browserDrivers\\chromedriver.exe");

        // Open a browser
        WebDriver driver = new ChromeDriver(); // initializes a browser

        // Navigate to duotech home page
        driver.get("https://www.duotech.io/"); // navigates to url

        // Verify that the title is Software QA Automation Engineer program | SDET | QA School | Software Testing
        String actualTitle = driver.getTitle();

        String expectedTitle = "Software QA Automation Engineer program | SDET | QA School | Software Testing";


//        if(actualTitle.equals(expectedTitle)){
//            System.out.println("Test passed: " + actualTitle);
//        }else{
//            System.out.println("Test failed. The actual title was " + actualTitle);
//        }

        if(actualTitle.contains("QA Automation Engineer")){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }


        driver.quit();






//







    }
}
