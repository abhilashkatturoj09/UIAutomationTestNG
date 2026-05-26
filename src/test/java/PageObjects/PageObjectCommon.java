package PageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectCommon {
    public WebDriver driver;

    PageObjectCommon() {
        driver = null;
    }

    public PageObjectCommon(WebDriver driver) {
        this.driver = driver;
    }

    public void open_URL(String str) {

        driver.get(str);
    }
}
