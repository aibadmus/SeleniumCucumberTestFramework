package StepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class ScreenShotOfNegativeTestSteps  extends BaseStepDefs{

    @And("^I reorder an item without ticking the check box$")
    public void iReorderAnItemWithoutTickingTheCheckBox() {
        myAccountPage.clickOnReorderButton();
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,1000)");
        signInPage.clickOnProceedToCheckOUt();
        addressPage.clickProceedToCheckOutButton();
        shippingPage.clickOnProceedToCheckOut();
    }
    @Then("^I can take a screen shot of the error message$")
    public void iCanTakeAScreenShotOfTheErrorMessage() throws Throwable {
        myAccountPage.takeScreenshotOfPage();
        shippingPage.closeOnErrorPopup();
        paymentPage.clickOnSignOutButton();
    }
}
