package stepDefinitions;

import PageObjects.PageObjectUser;
import RunTime.SharedDriver;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class stepDefsUser {

    WebDriver driver = SharedDriver.getDriver();
    PageObjectUser user;

    public stepDefsUser() {
        user = new PageObjectUser(driver);
    }

    @When("Home Page Loaded Successfully")
    public void home_page_loaded_successfully() {
        user.pageLoadedSuccessfully();

    }

}
