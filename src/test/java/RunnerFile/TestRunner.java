package RunnerFile;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Listeners;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"stepDefinitions", "RunTime"},
        plugin = {"pretty", "html:target/cucumber-reports.html"
                , "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        tags = "@abhitest"
)

//@Listeners({ExtentITestListenerClassAdapter.class})
public class TestRunner extends AbstractTestNGCucumberTests {
    // Typically empty; inherits execution logic from parent class
}