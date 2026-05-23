package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.HashMap;
import java.util.Map;

public class WikiPage {
    WebDriver driver;
    public WikiPage(WebDriver driver){
        this.driver=driver;
    }

    public Map<String, String> getShareHolderAndShareHoldingValues(){
      int count =  driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/child::tbody/child::tr/td[1]")).size();

        Map<String,String> values = new HashMap<String,String>();
        for (int i = 0; i < count; i++) {

            String shareHolderValue = driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/child::tbody/child::tr/td[1]")).get(i).getText();
            String shareHoldingValue = driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/child::tbody/child::tr/td[1]")).get(i).getText();
            values.put(shareHolderValue,shareHoldingValue);
        }

        return values;
    }



}
