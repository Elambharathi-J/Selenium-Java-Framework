package stepdefinition;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utils.TestContext;

public class LearnMoreSteps {

    TestContext context;

    public LearnMoreSteps(TestContext context){
        this.context = context;
    }

    @Given("user clicks on confirmation button")
    public void clickConfirmation(){

        context.pageObjectManager.getLearnMoreAlertPage().clickConfirmationBox();
    }

    @Then("Validate the message in confirmation box")
    public void validateTheMessageInConfirmationBox() {

        String actualMessage = context.pageObjectManager.getLearnMoreAlertPage().getAlertMessage();

        Assert.assertEquals("Press a Button !", actualMessage);
    }

    @And("Validate the message in UI")
    public void validateTheMessageInUI() {

        context.pageObjectManager.getLearnMoreAlertPage().clickCancelButton();

        String actualconfirmationMessage = context.pageObjectManager.getLearnMoreAlertPage().getUiConfirmationText();

        Assert.assertEquals("You Pressed Cancel", actualconfirmationMessage);
    }

    @Given("user clicks the change text button")
    public void userClicksTheChangeTextButton() {

        context.pageObjectManager.getLearnMoreExplicitWaitPage().clickChangeTextButton();
    }

    @Then("To verify whether the change text is displayed")
    public void toVerifyWhetherTheChangeTextIsDisplayed() {
       boolean isDisplayed = context.pageObjectManager.getLearnMoreExplicitWaitPage().isDisplayedChangeText();
        Assert.assertTrue(isDisplayed);
    }


    @Given("user enters the username and password")
    public void userEntersTheUsernameAndPassword() {
//        Method chaining
        context.pageObjectManager.getLearnMoreLoginPage().enterUserName().enterPassword().clickLoginButton();

    }

    @Then("validate the title of homepage")
    public void validateTheTitleOfHomepage() {
    context.pageObjectManager.getLearnMoreLoginPage().switchToEventManagementWindow();
    }
}