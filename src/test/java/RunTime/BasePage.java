package RunTime;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BasePage {

    protected WebDriver driver;

    @Before
    public void setUp() {
        driver = SharedDriver.init();
    }

    @After
    public void tearDown() {
        SharedDriver.close();
    }
}
