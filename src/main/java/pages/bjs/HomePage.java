package pages.bjs;
import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends CommonAPI {

    @FindBy(css = "span[class = 'login-state ml-1']")
    private WebElement signInBtn;

    @FindBy(css = "#searchTerm")
    private WebElement searchBar;

    @FindBy(css = "i[class = 'fa fa-search']")
    private WebElement searchBtn;

    @FindBy(css = "img[class = 'cart-style']")
    private WebElement addToCartBtn;

    @FindBy(css = "a[class = 'club-name-b2c club-name-space']")
    private WebElement storeLocationBtn;

    @FindBy(css = "a[class = 'col-xl-6 col-md-7 col-7 pr-0']")
    private WebElement helpCenterAndContactUsBtn;



    public HomePage(WebDriver driver) { PageFactory.initElements(driver, this); }

    public void clickSignInBtn() {
        click(signInBtn);
    }

    public void typeSearchTerm(String text) {
        type(searchBar, text);
    }

    public void clickSearchBar() { click(searchBar); }

    public void clickSearchBtn() {
        click(searchBtn);
    }

    public void clickAddToCartBtn() {
        click(addToCartBtn);
    }

    public void clickStoreLocationBtn() {
        click(storeLocationBtn);
    }

    public void clickHelpCenterAndContactUsBtn() {
        click(helpCenterAndContactUsBtn);
    }





}

