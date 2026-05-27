package stepDefinitions;

import PageObjects.PageObjectCommon;
import RunTime.LoadConfig;
import RunTime.SharedDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class stepDefsCommon {
    WebDriver driver = SharedDriver.getDriver();
    PageObjectCommon common;

    public stepDefsCommon() {
        common = new PageObjectCommon(driver);
    }

    @Given("open {string}")
    public void open(String string) {

        common.open_URL(string);
    }

    @When("Set input {string} by xpath {string}")
    public void set_input_by_xpath(String string, String string2) {

        common.setInput(string, string2);

    }

    @When("Click on the button by xpath {string}")
    public void clickOnTheButtonByXpath(String arg0) {
        common.clickOntheButton(arg0);
    }

    @When("Verify and Wait for a Text {string} by xpath {string}")
    public void verifyAndWaitForATextByXpath(String arg0, String arg1) {
        common.verifyAndWaitForText(arg0, arg1);
    }
}
