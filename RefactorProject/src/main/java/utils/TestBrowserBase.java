package utils;

import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class TestBrowserBase {
    public  WebDriver driver;
    public WebDriver getWebDriver() throws IOException {

        if (driver== null){


            switch (ReadPropertyValue.getPropertyValue("browser").toLowerCase()) {
                case "chrome" -> driver = new ChromeDriver();
                case "edge" -> driver = new EdgeDriver();
                case "safari" -> driver = new SafariDriver();
                default -> throw new InvalidArgumentException("enter the valid browser name");
            }
        driver.get(ReadPropertyValue.getPropertyValue("url"));
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            driver.manage().window().maximize();
        }
        return driver;
    }
}
