package StepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ReviewPreviousOrdersSteps extends BaseStepDefs{
    WebDriver driver;

    @Given("^I am successfully signed in with my details$")
    public void iAmSuccessfullySignedInWithMyDetails() {
//        System.setProperty("webdriver.chrome.driver",
//                System.getProperty("user.dir") + "//src//main//resources//drivers/chromedriver");
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//        driver.get("http://automationpractice.com/");
//        signInPage = new SignInPage(driver);
//        signInPage.Login();
        Assert.assertFalse(homePage.verifyIfSignedIn());

    }

    @And("^I go to my order history and details$")
    public void iGoToMyOrderHistoryAndDetails() {
        myAccountPage.clickOrderHistoryAndDetails();
    }

    @Then("^I can see my previous orders$")
    public void iCanSeeMyPreviousOrders() {
    }

    @Then("^I can confirm the date of purchase of previous order$")
    public void iCanConfirmTheDateOfPurchaseOfPreviousOrder() {
        myAccountPage.verifyPreviousOrderDate();
    }

    @And("^I add a comment$")
    public void iAddAComment()throws Throwable {
        myAccountPage.clickOrderDetails1();
        myAccountPage.enterMessageForPreviousOrder();
        Thread.sleep(2000);
        myAccountPage.clickOnSendButtonForMessage();
        Thread.sleep(2000);
    }

    @Then("^I should be able to see the comment added$")
    public void iShouldBeAbleToSeeTheCommentAdded() throws Throwable {
        myAccountPage.verifyPreviousOrdermessage();
        paymentPage.clickOnSignOutButton();
    }
}

