package RunTime;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class SharedDriver {
    public WebDriver driver;

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver getDriver() {
        return driver;
    }

    @Before
    public void setup() {
        System.out.println("in initialization");
        System.setProperty("webdriver.chrome.driver", "/Users/abhilashkatturoj/Abhilash/UIAutomationTestNG/Drivers/chromedriver");
        WebDriver driver1 = new ChromeDriver();
        setDriver(driver1);
//        driver1.get("https://www.google.com");
    }


    @After
    public void close() {
        System.out.println("in after in Quit");
        driver.quit();
    }

}

