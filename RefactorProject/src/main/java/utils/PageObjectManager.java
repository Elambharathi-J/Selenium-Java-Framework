package utils;

import org.openqa.selenium.WebDriver;
import pageobjects.*;

public class PageObjectManager {

    public WebDriver driver;
    public  HomePage homePage;
    public SearchResultPage searchResultPage;
    public LearnMoreAlertPage learnMoreAlertPage;
    public LearnMoreExplicitWaitPage learnMoreExplicitWaitPage;
    public WikiPage wikiPage;
    public LearnMoreLoginPage learnMoreLoginPage;

    public PageObjectManager(WebDriver driver){
        this.driver=driver;
    }

    public HomePage getHomePage(){
         homePage = new HomePage(driver);

        return homePage;

    }

    public SearchResultPage getSearchResultPage(){
         searchResultPage = new SearchResultPage(driver);
        return searchResultPage;
    }

    public LearnMoreAlertPage getLearnMoreAlertPage(){
         learnMoreAlertPage = new LearnMoreAlertPage(driver);
    return learnMoreAlertPage;
    }

    public LearnMoreExplicitWaitPage getLearnMoreExplicitWaitPage(){
         learnMoreExplicitWaitPage = new LearnMoreExplicitWaitPage(driver);
         return learnMoreExplicitWaitPage;
    }

    public WikiPage getWikiPage(){
         wikiPage = new WikiPage(driver);
         return wikiPage;
    }

    public LearnMoreLoginPage getLearnMoreLoginPage(){
         learnMoreLoginPage = new LearnMoreLoginPage(driver);
        return learnMoreLoginPage;
    }
}
