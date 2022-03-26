package MArch26;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class SeleniumUtility {



     public static List<String> getElementsText(List<WebElement> coll){


         List<String> list = new ArrayList<>();

         for (WebElement th : coll) {
             if(!th.getText().isEmpty()){
                 list.add(th.getText());
             }

         }

         return list;
     }

    public static void switchToWindow(String title, WebDriver driver){
        Set<String> windowHandles = driver.getWindowHandles();

        for (String windowHandle : windowHandles) {
            driver.switchTo().window(windowHandle);
            if(driver.getTitle().equals(title)){
                break;
            }
        }
    }

}
