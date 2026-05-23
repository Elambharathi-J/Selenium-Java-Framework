package stepdefinition;

import io.cucumber.java.en.Then;
import utils.TestContext;

public class WikiSteps {
    TestContext context;

    public WikiSteps(TestContext context){

        this.context=context;
    }

    @Then("verify the mapping of shareholder with shareholding")
    public void shareHolder(){
context.pageObjectManager.getWikiPage().getShareHolderAndShareHoldingValues().get("Public");

    }
}
