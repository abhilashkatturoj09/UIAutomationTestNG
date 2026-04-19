package Utilities;

import RunTime.SharedDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class takeScreenshot extends SharedDriver {

    //    public  static sspath=take
    public String getScreenShot(String testcasename) throws IOException {
        System.out.println("in before screenshot");
        SharedDriver sd = new SharedDriver();
        WebDriver driver1 = sd.getDriver();
        TakesScreenshot ts = (TakesScreenshot) driver1;
        File source = ts.getScreenshotAs(OutputType.FILE);
        File file = new File("/Users/abhilashkatturoj/Abhilash/UIAutomationTestNG/imagereports/" + testcasename + ".png");
        FileUtils.copyFile(source, file);
        System.out.println("in after screenshot");
        return "/Users/abhilashkatturoj/Abhilash/UIAutomationTestNG/imagereports/" + testcasename + ".png";

    }
}
