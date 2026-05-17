package RunTime;

import io.cucumber.java.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SharedDriver {
    //    private static WebDriver driver;
    private static final ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static WebDriver getDriver() {
        return driver.get();
    }

    public static void setDriver(WebDriver driverInstance) {
        driver.set(driverInstance);
    }


    public static void quitDriver() {

        if (driver.get() != null) {
            driver.get().quit();
            driver.remove();
        }
    }


    //    @Before
//    public static WebDriver init() {
//        System.out.println("in initialization");
//        System.setProperty("webdriver.chrome.driver", "/Users/abhilashkatturoj/Abhilash/UIAutomationTestNG/Drivers/chromedriver");
//         driver = new ChromeDriver();
//        return driver;
//    }

//    public static WebDriver getDriver() {
//        return driver;
//    }

    //    @After
//    public static void close() {
//        if (driver != null) {
//            driver.quit();
//        }
//    }

}

