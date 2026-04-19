package RunTime;

import io.cucumber.java.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SharedDriver {
    private static WebDriver driver;


    //    @Before
    public static WebDriver init() {
        System.out.println("in initialization");
        System.setProperty("webdriver.chrome.driver", "/Users/abhilashkatturoj/Abhilash/UIAutomationTestNG/Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        return driver;
    }

    public static WebDriver getDriver() {
        return driver;
    }

    //    @After
    public static void close() {
        if (driver != null) {
            driver.quit();
        }
    }

}

