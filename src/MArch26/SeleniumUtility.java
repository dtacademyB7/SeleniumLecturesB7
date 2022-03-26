package MArch26;

import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

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

}
