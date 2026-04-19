package RunnerFile;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"stepDefinitions", "RunTime"},
        plugin = {"pretty", "html:target/cucumber-reports.html"},
        tags = "@abhitest"
)
public class TestRunner extends AbstractTestNGCucumberTests {
    // Typically empty; inherits execution logic from parent class
}