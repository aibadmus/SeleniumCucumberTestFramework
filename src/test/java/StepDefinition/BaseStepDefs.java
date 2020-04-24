package StepDefinition;

import Helper.DriverFactory;
import PageObjects.*;

public class BaseStepDefs extends DriverFactory {
    HomePage homePage;
    SignInPage signInPage;
    MyAccountPage myAccountPage;
    ProductPage productPage;
    AddressPage addressPage;
    PaymentPage paymentPage;
    ShippingPage shippingPage;

    public BaseStepDefs() {
        homePage = new HomePage(driver);
        signInPage = new SignInPage(driver);
        myAccountPage = new MyAccountPage(driver);
        productPage = new ProductPage(driver);
        addressPage = new AddressPage(driver);
        paymentPage = new PaymentPage(driver);
        shippingPage = new ShippingPage(driver);
    }

}

