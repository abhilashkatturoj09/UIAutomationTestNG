package RunTime;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SharedDriver {
    private WebDriver driver;


    @Before
    public void setup() {
        System.out.println("in initialization");
        System.setProperty("webdriver.chrome.driver", "/Users/abhilashkatturoj/Abhilash/UIAutomationTestNG/Drivers/chromedriver");
        driver = new ChromeDriver();
        setDriver(driver);
        driver.get("https://www.google.com");
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver getDriver() {
        return driver;
    }

    @After
    public void close() {
        System.out.println("in after in Quit");
        driver.quit();
    }

}

