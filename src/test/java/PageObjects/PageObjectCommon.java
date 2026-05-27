package PageObjects;

import RunTime.LoadConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

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
}
