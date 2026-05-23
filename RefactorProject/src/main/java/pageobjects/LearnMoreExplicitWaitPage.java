package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LearnMoreExplicitWaitPage {


    public WebDriver driver;
    public LearnMoreExplicitWaitPage(WebDriver driver){
        this.driver=driver;
    }

    public  void clickChangeTextButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

         wait.until(ExpectedConditions.elementToBeClickable(By.id("change_text"))).click();
    }

    public boolean isDisplayedChangeText() {

        boolean condi;
        try {
            condi = driver.findElement(By.xpath("//h3[text()='Hello, Learn More Aspirants']")).isDisplayed();
        } catch (NoSuchElementException e) {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(12));
            wait.pollingEvery(Duration.ofSeconds(5));
            wait.ignoring(NoSuchElementException.class);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h3[contains(text(),'Learn More')])")));
            condi = driver.findElement(By.xpath("//h3[text()='Hello, Learn More Aspirants']")).isDisplayed();
        }
return condi;
    }}