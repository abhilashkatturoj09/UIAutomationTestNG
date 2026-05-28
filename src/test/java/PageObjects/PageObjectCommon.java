package PageObjects;

import RunTime.LoadConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;

import java.time.Duration;

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

    public void setInput(String str1, String str2) {
        driver.findElement(By.xpath(LoadConfig.load(str2))).sendKeys(str1);
    }

    public void clickOntheButton(String str) {
        WebElement ele = driver.findElement(By.xpath(LoadConfig.load(str)));
        Actions action = new Actions(driver);
        action.moveToElement(ele).click().perform();
    }

    public void verifyAndWaitForText(String str, String str1) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(LoadConfig.load(str1))));

    }

    public void pageLoadedSuccessfullyByXpath(String str) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(LoadConfig.load(str))));

    }

    public void selectDropdownByXpath(String str1, String str2) {

        WebElement ele = driver.findElement(By.xpath(LoadConfig.load(str2)));
        Select dd = new Select(ele);
        dd.selectByValue(str1);

    }

    public void waitForPageLoadToVerifyByText(String str) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),\"" + str + "\")]")));

    }
}
