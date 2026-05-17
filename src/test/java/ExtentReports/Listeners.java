package ExtentReports;

import RunTime.SharedDriver;
import Utilities.takeScreenshot;
import com.aventstack.extentreports.*;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

public class Listeners implements ITestListener {

    ExtentTest test;

    ExtentReports extent = extentReports.extentReportsObject();

    @Override
    public void onTestStart(ITestResult result) {

        test = extent.createTest(result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {

        test.pass("Test Passed");

        try {

            String path = takeScreenshot.getScreenShot(result.getName());

            test.addScreenCaptureFromPath(path);

        } catch (IOException e) {

            e.printStackTrace();
        }

        SharedDriver.quitDriver();
    }

    @Override
    public void onTestFailure(ITestResult result) {

        test.fail(result.getThrowable());

        try {

            String path = takeScreenshot.getScreenShot(result.getName());

            test.addScreenCaptureFromPath(path);

        } catch (IOException e) {

            e.printStackTrace();
        }
        SharedDriver.quitDriver();
    }

    @Override
    public void onFinish(ITestContext context) {

        extent.flush();
        SharedDriver.quitDriver();
    }
}