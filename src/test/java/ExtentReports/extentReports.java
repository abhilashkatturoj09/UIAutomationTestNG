package ExtentReports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class extentReports {

    public static ExtentReports extentReportsObject() {
        String path = "/Users/abhilashkatturoj/Abhilash/UIAutomationTestNG/newReporting/index.html";
        ExtentSparkReporter reporter = new ExtentSparkReporter(path);
        reporter.config().setReportName("Abhilash Automation");
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(reporter);
        return extent;

    }
}
