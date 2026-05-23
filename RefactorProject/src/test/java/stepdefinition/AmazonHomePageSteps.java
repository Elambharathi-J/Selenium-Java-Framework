package stepdefinition;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import pageobjects.HomePage;
import pageobjects.SearchResultPage;
import utils.TestContext;

public class AmazonHomePageSteps {

    TestContext context;
    HomePage homePage;
    public AmazonHomePageSteps(TestContext context){
        this.context= context;

    }
    @Given("user navigates to Amazon HomePage")
    
    public void homePage(){

    }

    @When("user select the amazon fresh from the category dropdown")
    public void userSelectTheAmazonFreshFromTheCategoryDropdown() {


        context.pageObjectManager.getHomePage().selectDropdownValue();
    }

    @And("user enter the product name {string} and search the product")
    public void userEnterTheProductNameAndSearchTheProduct(String productName) {

   context.pageObjectManager.getHomePage().enterProductName(productName);
   context.pageObjectManager.getHomePage().clickSearchIcon();


    }

    @Then("verify whether it navigate to search page")
    public void verifyWhetherItNavigateToSearchPage() {
       String actualTitle = context.pageObjectManager.searchResultPage.getPageTitle();
        System.out.println(actualTitle);
    }
}
