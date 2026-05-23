package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LearnMoreAlertPage {
    WebDriver driver;
    public LearnMoreAlertPage(WebDriver driver){
        this.driver=driver;
    }

    public void clickConfirmationBox(){
         driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
    }

    public void clickCancelButton(){
        driver.switchTo().alert().dismiss();
    }

    public String getAlertMessage(){
        return driver.switchTo().alert().getText();
    }

    public void clickOkButton(){
        driver.switchTo().alert().accept();
    }

    public String getUiConfirmationText(){
        return driver.findElement(By.xpath("//p[@id='demo']")).getText();
    }

}
