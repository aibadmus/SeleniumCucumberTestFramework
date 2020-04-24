package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class WomenPage {

    WebDriver driver;

    @FindBy(css = "#block_top_menu > ul > li:nth-child(1) > a")
    private WebElement WomenTab;

    @FindBy(css = "#center_column > ul > li:nth-child(2) > div > div.right-block > div.button-container > a.button.ajax_add_to_cart_button.btn.btn-default")
    private WebElement AddtoCart1;

    @FindBy(css = "#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > span > span")
    private WebElement ContinueShopping;

    @FindBy(css = "#center_column > ul > li:nth-child(3) > div > div.right-block > div.button-container > a.button.ajax_add_to_cart_button.btn.btn-default")
    private WebElement AddtoCart2;

    @FindBy(css = "#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > a > span")
    private WebElement ProceedtoCheckout;


    public WomenPage(WebDriver dr) {
        this.driver =dr;
        PageFactory.initElements(driver, this);
    }

    public void clickWomenTab() {
        WomenTab.click();
    }

    public void addItemToCart1() {
        AddtoCart1.click();
    }

    public void clickContinueShopping() {
        ContinueShopping.click();
    }

    public void addItemToCart2() {
        AddtoCart2.click();
    }

    public void clickProceedToCheckOut() {
        ProceedtoCheckout.click();

    }

}


