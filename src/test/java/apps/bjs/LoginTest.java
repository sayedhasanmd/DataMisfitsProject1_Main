package apps.bjs;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.bjs.HomePage;
import pages.bjs.LogInPage;

public class LoginTest extends CommonAPI {

//    @Test
//    public void validLoginCred() {
//        HomePage homePage = new HomePage(getDriver());
//        LogInPage loginPage = new LogInPage(getDriver());
//        homePage.clickSignInBtn();
//        loginPage.typeEmailForLogin("98989@aol.com");
//        loginPage.typePasswordForLogin("888888");
//        loginPage.clickLoginSignInBtn();
//        Assert.assertTrue(getDriver().findElement(By.cssSelector("login-state ml-1")).isDisplayed());
//
//    }

    @Test
    public void invalidLoginCred() {
        HomePage homePage = new HomePage(getDriver());
        LogInPage loginPage = new LogInPage(getDriver());
        homePage.clickSignInBtn();
        loginPage.typeEmailForLogin("123@gmail.com");
        loginPage.typePasswordForLogin("12345");
        loginPage.clickLoginSignInBtn();
        Assert.assertTrue(getDriver().findElement(By.cssSelector("errMsgsignIn")).isDisplayed());


    }

}


