package StepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class WomenPagestepdefs extends BaseStepDefs {

    @Given("^I have clicked on women  page$")
    public void iHaveClickedOnWomenPage()  {
        WomenPage.clickWomenTab();
    }

    @And("^Added first item$")
    public void addedFirstItem() {
        WomenPage.addItemToCart1();
    }

    @Then("^continue to the next item$")
    public void continueToTheNextItem() {
        WomenPage.clickContinueShopping();
    }

    @And("^Added second item$")
    public void addedSecondItem() {
        WomenPage.addItemToCart2();
    }

    @Then("^It should both be in the cart$")
    public void itShouldBothBeInTheCart() {
        WomenPage.clickProceedToCheckOut();
    }
}
