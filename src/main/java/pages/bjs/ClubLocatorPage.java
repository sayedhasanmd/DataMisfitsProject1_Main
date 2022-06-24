package pages.bjs;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClubLocatorPage extends CommonAPI {

    @FindBy(css = "#zip")
    private WebElement zipCodeField;

    @FindBy(xpath = "//*[@id=\"main-flex-div\"]/div[2]/div/p/i")
    private WebElement mileRangeArrowBtn;

    @FindBy(xpath = "//*[@id=\"main-flex-div\"]/div[2]/div/div/ul/li[1]/span")
    private WebElement tenMilesRangeBtn;

    @FindBy(xpath = "//*[@id=\"main-flex-div\"]/div[4]/div/p/i")
    private WebElement stateSelectArrowBtn;

    @FindBy(xpath = "//*[@id=\"main-flex-div\"]/div[4]/div/div/ul/li[12]")
    private WebElement stateSelectNYBtn;

    @FindBy(xpath = "//*[@id=\"main-flex-div\"]/div[5]/div/p/i")
    private WebElement townAndCityArrowBtn;

    @FindBy(xpath = "//*[@id=\"main-flex-div\"]/div[5]/div/div/ul/li[46]")
    private WebElement yorktownHeightsBtn;

    @FindBy(css = "button[class = 'btn red-btn text-center continue']")
    private WebElement findClubBtn;

    public ClubLocatorPage(WebDriver driver) { PageFactory.initElements(driver, this); }

    public void clickZipCodeField() {click(zipCodeField); }

    public void clickMileRangeArrowBtn() {click(mileRangeArrowBtn); }

    public void clickTenMilesRangeBtn () {click(tenMilesRangeBtn); }

    public void clickStateSelectArrowBtn () {click(stateSelectArrowBtn); }

    public void clickStateSelectNYBtn () {click(stateSelectNYBtn); }

    public void clickTownAndCityArrowBtn () {click(townAndCityArrowBtn); }

    public void clickYorktownHeightsBtn () {click(yorktownHeightsBtn); }

    public void clickFindClubBtn () {click(findClubBtn); }

}
