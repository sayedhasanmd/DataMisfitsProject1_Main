package pages.bjs;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerServicePage extends CommonAPI {

    @FindBy(xpath = "/html/body/div[7]/div/div[2]/div[1]/div")
    private WebElement customerServiceMembershipBtn;

    @FindBy(xpath = "/html/body/div[7]/div/div[2]/div[2]/div")
    private WebElement customerServiceOrdersBtn;

    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div[3]/div")
    private WebElement customerServiceServicesBtn;

    @FindBy(xpath = "/html/body/div[7]/div/div[2]/div[4]/div")
    private WebElement customerServiceQuickLinksBtn;

    @FindBy(xpath = "/html/body/div[7]/div/div[2]/div[5]/div")
    private WebElement customerServicePerksRewardsBtn;

    @FindBy(xpath = "/html/body/div[7]/div/div[2]/div[6]/div")
    private WebElement customerServiceTireCenterBtn;

    @FindBy(xpath = "/html/body/div[7]/div/div[2]/div[7]/div")
    private WebElement customerServicePaymentsBtn;

    @FindBy(xpath = "/html/body/div[7]/div/div[2]/div[8]/div")
    private WebElement customerServiceInClubBtn;

    @FindBy(xpath = "//*[@id=\"trigger\"]/div")
    private WebElement customerServiceEmailBtn;

    @FindBy(css = ".contact-list-description")
    private WebElement customerServiceChatBtn;

    @FindBy(xpath = "/html/body/div[2]/div/div[3]/div[1]/div[3]")
    private WebElement customerServiceContactUsBtn;

    public CustomerServicePage(WebDriver driver) { PageFactory.initElements(driver, this); }

    public void clickCustomerServiceOrdersBtn() {
        click(customerServiceOrdersBtn);
    }

    public void clickCustomerServiceMembershipBtn() {
        click(customerServiceMembershipBtn);
    }

    public void clickCustomerServiceServicesBtn() {
        click(customerServiceServicesBtn);
    }

    public void clickCustomerServiceQuickLinksBtn() {
        click(customerServiceQuickLinksBtn);
    }

    public void clickCustomerServicePerksRewardsBtn() {
        click(customerServicePerksRewardsBtn);
    }

    public void clickCustomerServiceTireCenterBtn() {
        click(customerServiceTireCenterBtn);
    }

    public void clickCustomerServicePaymentsBtn() {
        click(customerServicePaymentsBtn);
    }

    public void clickCustomerServiceEmailBtn() {
        click(customerServiceEmailBtn);
    }

    public void clickCustomerServiceInClubBtn() {
        click(customerServiceInClubBtn);
    }

    public void clickCustomerServiceChatBtn() {
        click(customerServiceChatBtn);
    }

    public void clickCustomerServiceContactUsBtn() {
        click(customerServiceContactUsBtn);
    }

}
