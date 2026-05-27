package ExtentReports;

import RunTime.SharedDriver;
import Utilities.takeScreenshot;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

public class Listeners implements ITestListener {

    ExtentReports extent = extentReports.extentReportsObject();

    // Thread-safe for parallel execution
    ThreadLocal<ExtentTest> test = new ThreadLocal<>();

    @Override
    public void onTestStart(ITestResult result) {

        ExtentTest extentTest = extent.createTest(result.getMethod().getMethodName());

        test.set(extentTest);
    }

    @Override
    public void onTestSuccess(ITestResult result) {

        test.get().pass("Test Passed");

        try {

            String path = takeScreenshot.getScreenShot(result.getMethod().getMethodName());

            test.get().addScreenCaptureFromPath(path);

        } catch (IOException e) {

            e.printStackTrace();
        }

        SharedDriver.quitDriver();
    }

    @Override
    public void onTestFailure(ITestResult result) {

        test.get().fail(result.getThrowable());

        try {

            String path = takeScreenshot.getScreenShot(result.getMethod().getMethodName());

            test.get().addScreenCaptureFromPath(path);

        } catch (IOException e) {

            e.printStackTrace();
        }

        SharedDriver.quitDriver();
    }

    @Override
    public void onTestSkipped(ITestResult result) {

        test.get().skip("Test Skipped");
    }

    @Override
    public void onFinish(ITestContext context) {

        extent.flush();

        SharedDriver.quitDriver();
    }
}