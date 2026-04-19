package RunTime;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SharedDriver {
    WebDriver driver;

    @Before
    public void setup() {
        System.out.println("in initialization");
        System.setProperty("webdriver.chrome.driver", "/Users/abhilashkatturoj/Abhilash/UIAutomationTestNG/Drivers/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
    }

    @After
    public void close() {
        System.out.println("in after in Quit");
        driver.quit();
    }

}

