package apps.bjs;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.bjs.CustomerServicePage;
import pages.bjs.HomePage;

public class CustomerServiceTest extends CommonAPI {

    @Test
    public void membership() {
        HomePage homePage = new HomePage(getDriver());
        CustomerServicePage customerService = new CustomerServicePage(getDriver());
        homePage.clickHelpCenterAndContactUsBtn();
        customerService.clickCustomerServiceMembershipBtn();
        Assert.assertTrue(getDriver().findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[1]/h2")).isDisplayed());
    }

    @Test
    public void orders() {
        HomePage homePage = new HomePage(getDriver());
        CustomerServicePage customerService = new CustomerServicePage(getDriver());
        homePage.clickHelpCenterAndContactUsBtn();
        customerService.clickCustomerServiceOrdersBtn();
        Assert.assertTrue(getDriver().findElement(By.xpath("/html/body/div[6]/div[2]/ul/li[1]/h2")).isDisplayed());

    }

    @Test
    public void services() {
        HomePage homePage = new HomePage(getDriver());
        CustomerServicePage customerService = new CustomerServicePage(getDriver());
        homePage.clickHelpCenterAndContactUsBtn();
        customerService.clickCustomerServiceServicesBtn();
        Assert.assertTrue(getDriver().findElement(By.xpath("/html/body/div[1]/h1")).isDisplayed());

    }

    @Test
    public void quickLinks() {
        HomePage homePage = new HomePage(getDriver());
        CustomerServicePage customerService = new CustomerServicePage(getDriver());
        homePage.clickHelpCenterAndContactUsBtn();
        customerService.clickCustomerServiceQuickLinksBtn();
        Assert.assertTrue(getDriver().findElement(By.xpath("/html/body/div[1]/h1")).isDisplayed());

    }

    @Test
    public void perksRewards() {
        HomePage homePage = new HomePage(getDriver());
        CustomerServicePage customerService = new CustomerServicePage(getDriver());
        homePage.clickHelpCenterAndContactUsBtn();
        customerService.clickCustomerServicePerksRewardsBtn();
        Assert.assertTrue(getDriver().findElement(By.xpath("/html/body/div[1]/h1")).isDisplayed());
    }

    @Test
    public void tireCenter() {
        HomePage homePage = new HomePage(getDriver());
        CustomerServicePage customerService = new CustomerServicePage(getDriver());
        homePage.clickHelpCenterAndContactUsBtn();
        customerService.clickCustomerServiceTireCenterBtn();
        Assert.assertTrue(getDriver().findElement(By.xpath("/html/body/div[1]/h1")).isDisplayed());
    }

    @Test
    public void payments() {
        HomePage homePage = new HomePage(getDriver());
        CustomerServicePage customerService = new CustomerServicePage(getDriver());
        homePage.clickHelpCenterAndContactUsBtn();
        customerService.clickCustomerServicePaymentsBtn();
        Assert.assertTrue(getDriver().findElement(By.xpath("/html/body/div[6]/h1")).isDisplayed());

    }

    @Test
    public void inClub() {
        HomePage homePage = new HomePage(getDriver());
        CustomerServicePage customerService = new CustomerServicePage(getDriver());
        homePage.clickHelpCenterAndContactUsBtn();
        customerService.clickCustomerServiceInClubBtn();
        Assert.assertTrue(getDriver().findElement(By.xpath("/html/body/div[6]/h1")).isDisplayed());

    }

    @Test
    public void email() {
        HomePage homePage = new HomePage(getDriver());
        CustomerServicePage customerService = new CustomerServicePage(getDriver());
        homePage.clickHelpCenterAndContactUsBtn();
        customerService.clickCustomerServiceEmailBtn();
        Assert.assertTrue(getDriver().findElement(By.cssSelector("Title-sc-10f4djx-0 lEoZF")).isDisplayed());

    }

    @Test
    public void chat() {
        HomePage homePage = new HomePage(getDriver());
        CustomerServicePage customerService = new CustomerServicePage(getDriver());
        homePage.clickHelpCenterAndContactUsBtn();
        customerService.clickCustomerServiceChatBtn();
        Assert.assertTrue(getDriver().findElement(By.xpath("//*[@id='rich-content-cec79980-9e81-11ec-9527-eb302958eddc']/div")).isDisplayed());
    }
    @Test
    public void contactUs() {
        HomePage homePage = new HomePage(getDriver());
        CustomerServicePage customerService = new CustomerServicePage(getDriver());
        homePage.clickHelpCenterAndContactUsBtn();
        customerService.clickCustomerServiceContactUsBtn();
        Assert.assertTrue(getDriver().findElement(By.xpath("/html/body/div[7]/div/div[1]/h1")).isDisplayed());
    }

}