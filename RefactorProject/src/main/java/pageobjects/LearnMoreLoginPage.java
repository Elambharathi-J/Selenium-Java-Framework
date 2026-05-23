package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Base64Encoder;
import utils.ReadPropertyValue;

import java.util.Iterator;
import java.util.Set;

public class LearnMoreLoginPage {

    WebDriver driver;

    public LearnMoreLoginPage(WebDriver driver){

        this.driver=driver;

    }

    public LearnMoreLoginPage enterUserName(){
      String username =  driver.findElement(By.cssSelector(".label")).getText().split(" ")[1].substring(1);
        driver.findElement(By.cssSelector("#username")).sendKeys(username);
//        method chanining acheive by using this keyword it will return the current class
        return this;

    }
    public LearnMoreLoginPage enterPassword(){
        driver.findElement(By.cssSelector("#password")).sendKeys(Base64Encoder.decode64(ReadPropertyValue.getPropertyValue("password")));
        return this;

    }

    public LearnMoreLoginPage clickLoginButton(){

        driver.findElement(By.xpath("//button[text()='Login']")).click();
        return this;
    }

    public  void switchToEventManagementWindow(){

        Set<String> winProperty = driver.getWindowHandles();
//        String parentWindow = driver.getWindowHandle();
        Iterator<String> iterator = winProperty.iterator();
        String parent = iterator.next();
        String child = iterator.next();
        driver.switchTo().window(child);
        System.out.println(driver.getTitle());
    }
}
