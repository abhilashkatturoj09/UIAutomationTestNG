package ExtentReports;

import Utilities.takeScreenshot;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

public class Listeners extends takeScreenshot implements ITestListener {
    static ExtentTest test;
    ExtentReports extent = extentReports.extentReportsObject();

    @Override
    public void onTestStart(ITestResult result) {
//        ITestListener.super.onTestStart(result);

    }

    @Override
    public void onTestSuccess(ITestResult result) {
//        ITestListener.super.onTestSuccess(result);
        test.log(Status.PASS, "Got pass");
        String path = null;
        try {
            path = getScreenShot(result.getName());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        test.addScreenCaptureFromPath(path, result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
//        ITestListener.super.onTestFailure(result);
        test.fail(result.getThrowable());
        String path = null;
        try {
            path = getScreenShot(result.getName());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        test.addScreenCaptureFromPath(path, result.getName());
    }
}
