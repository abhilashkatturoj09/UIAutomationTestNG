package PageObjects;

import RunTime.BasePage;
import RunTime.SharedDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class PageObjectLogin {
    public WebDriver driver;

    PageObjectLogin() {
        driver = null;
    }

    public PageObjectLogin(WebDriver driver) {
        this.driver = driver;

    }

    public void openURL() {
        driver.get("https://google.com");
    }


}
