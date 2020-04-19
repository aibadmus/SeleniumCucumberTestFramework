package StepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class ReviewPreviousOrdersSteps extends BaseStepDefs{

    @Given("^I am successfully signed in with my details$")
    public void iAmSuccessfullySignedInWithMyDetails() {
        signInPage.Login();
    }

    @And("^I go to my order history and details$")
    public void iGoToMyOrderHistoryAndDetails() {
        myAccountPage.clickOrderHistoryAndDetails();
    }

    @Then("^I can confirm the date of purchase of previous order$")
    public void iCanConfirmTheDateOfPurchaseOfPreviousOrder() {
        myAccountPage.verifyPreviousOrderDate();
    }

    @And("^I add a comment$")
    public void iAddAComment() {
        myAccountPage.clickOrderDetails1();
        myAccountPage.enterMessageForPreviousOrder();
        myAccountPage.clickOnSendButtonForMessage();
    }

    @Then("^I should be able to see the comment added$")
    public void iShouldBeAbleToSeeTheCommentAdded() {
        myAccountPage.verifyPreviousOrdermessage();
        paymentPage.clickOnSignOutButton();
    }
}

