package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver=driver;

    }

    public  void selectDropdownValue(){
        WebElement categoryElement = driver.findElement(By.id("searchDropdownBox"));
        Select categoryDropdown = new Select(categoryElement);
        categoryDropdown.selectByIndex(4);
    }

    public  void enterProductName(String productName){
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(productName);

    }

    public  void clickSearchIcon(){
        driver.findElement(By.id("nav-search-submit-button")).click();
    }
}
