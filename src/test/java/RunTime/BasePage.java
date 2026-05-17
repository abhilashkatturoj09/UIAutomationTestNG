package RunTime;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {

    @Before
    public void setUp() {

        WebDriver driver = new ChromeDriver();

        SharedDriver.setDriver(driver);

        driver.manage().window().maximize();
    }

//    @After
    public void tearDown() {
        SharedDriver.quitDriver();
    }
}