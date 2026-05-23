package utils;

import org.openqa.selenium.WebDriver;

import java.io.FileNotFoundException;
import java.io.IOException;

public class TestContext {
    public WebDriver driver;
    public  PageObjectManager pageObjectManager;
    public TestBrowserBase testBrowserBase;

    public TestContext() throws IOException {
         testBrowserBase = new TestBrowserBase();
         pageObjectManager = new PageObjectManager(testBrowserBase.getWebDriver());
    }
}
