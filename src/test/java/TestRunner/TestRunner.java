package TestRunner;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
    features = "src/main/resources/features_File", // Path to your feature files
    glue = {"stepDefinitions"}, // Path to your step definition Package Name
    plugin = {"pretty", "html:target/cucumber-reports.html", "json:target/cucumber-reports.json"}
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
