package PageObjects;

import RunTime.LoadConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PageObjectUser {

    public WebDriver driver;

    PageObjectUser() {
        driver = null;
    }

    public PageObjectUser(WebDriver driver) {
        this.driver = driver;
    }

    public void pageLoadedSuccessfully() {
        String LandingPage = "LandingPage";
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(LoadConfig.load(LandingPage))));
    }

}
