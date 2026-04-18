package RunnerFile;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepDefinitions",
        plugin = {"pretty", "html:target/cucumber-reports"},
        dryRun = true
)
public class TestRunner extends AbstractTestNGCucumberTests {
    // Typically empty; inherits execution logic from parent class
}