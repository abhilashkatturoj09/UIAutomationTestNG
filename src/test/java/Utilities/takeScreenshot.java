package Utilities;

import RunTime.SharedDriver;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class takeScreenshot {

    //    public  static sspath=take


    //    @AfterStep
    public static String getScreenShot(String testcasename) throws IOException {
        System.out.println("in before screenshot");
        WebDriver driver = SharedDriver.getDriver();

//        SharedDriver sd = new SharedDriver();
//        WebDriver driver1 = sd.getDriver();
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        File file = new File("/Users/abhilashkatturoj/Abhilash/UIAutomationTestNG/newReporting/" + testcasename + ".png");
        FileUtils.copyFile(source, file);
        System.out.println("in after screenshot");
        return "/Users/abhilashkatturoj/Abhilash/UIAutomationTestNG/newReporting/" + testcasename + ".png";

    }
}
