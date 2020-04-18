package StepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ScreenShotOfNegativeTestSteps  extends BaseStepDefs{
    WebDriver driver;

    @And("^I reorder an item without ticking the check box$")
    public void iReorderAnItemWithoutTickingTheCheckBox() {
        myAccountPage.clickOnReorderButton();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        signInPage.clickOnProceedToCheckOUt();
        addressPage.clickProceedToCheckOutButton();
        shippingPage.clickOnProceedToCheckOut();
    }
    @Then("^I can take a screen shot of the error message$")
    public void iCanTakeAScreenShotOfTheErrorMessage() throws Throwable {
        myAccountPage.takeScreenshotOfPage();
        shippingPage.closeOnErrorPopup();
        Thread.sleep(4000);
        paymentPage.clickOnSignOutButton();
    }
}
