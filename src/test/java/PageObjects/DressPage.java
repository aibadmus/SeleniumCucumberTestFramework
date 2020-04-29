package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DressPage {
    WebDriver driver;

    @FindBy (css = "#block_top_menu > ul > li:nth-child(2) > a")
    private WebElement Dressbutton;

    @FindBy (css= "#subcategories > ul > li:nth-child(3) > h5")
    private WebElement SummerdressesButton;

    @FindBy (css = "#center_column > ul > li:nth-child(2) > div > div.left-block > div")
    private WebElement QuickViewSummerdress;

    @FindBy (css= "#group_1")
    private WebElement DressSizeButtonDropDown;

    @FindBy (css= "#add_to_cart > button")
    private WebElement DressAddToCartButton;

    @FindBy(className = "fancybox-iframe")
    private WebElement popUp;

    public DressPage (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void SelectDressButton(){Dressbutton.click(); }
    public void SummerDressButton(){SummerdressesButton.click(); }
    public void QuickViewSummerDress(){QuickViewSummerdress.click();}
    public void DressAddToCart(){ DressAddToCartButton.click();}

    public void DressSizeButton(){
        Select Large = new Select(DressSizeButtonDropDown);
        Large.selectByVisibleText("L");
    }
    public void DressPopup () {
        driver.switchTo().frame(popUp);}

}
