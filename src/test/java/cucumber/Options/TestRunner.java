package cucumber.Options;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "json:target/cucumber.json"  // Required for HTML report
        },
        features = "src/test/java/features",
        glue = "stepDefinitions",
        tags = "@Smoke"  // Optional: Filter tests
)
public class TestRunner {
//tags= {"@DeletePlace"}  compile test verify

}
