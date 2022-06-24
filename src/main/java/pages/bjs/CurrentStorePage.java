package pages.bjs;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CurrentStorePage extends CommonAPI {



    @FindBy(css = "button[class = 'btn btn-default']")
    private WebElement getDirectionsBtn;

    public CurrentStorePage(WebDriver driver) { PageFactory.initElements(driver, this); }


}
