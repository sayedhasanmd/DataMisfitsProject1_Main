package pages.bjs;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultPage extends CommonAPI {


    @FindBy(xpath = "//*[@id=\"item-3000000000000446102\"]/img")
    private WebElement searchResultWellsleyFarmsEggs;

    @FindBy(xpath = "//*[@id=\"contentOverlay\"]/div/app-search-main/app-search-result-page-gb/div[3]/div[2]/div/app-products-container/div/div/div[2]/app-product-card/div/div/div[3]/div[1]/div/button")
    private WebElement wellsleyFarmsEggsAddToCartBtn;

    @FindBy(css = ".title-cart")
    private WebElement cartBtn;


    public SearchResultPage(WebDriver driver) { PageFactory.initElements(driver, this); }

    public void clickWellsleyFarmsEggsAddToCartBtn() {click(wellsleyFarmsEggsAddToCartBtn); }

    public void hoverOverSearchResultWellsleyFarmsEggs(WebDriver driver){ hoverOver(driver, searchResultWellsleyFarmsEggs); }

    public void clickCartBtn() {click(cartBtn); }


}
