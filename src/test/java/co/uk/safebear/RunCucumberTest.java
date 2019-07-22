package co.uk.safebear;

// connecting the libraries that we imported to our code
// might need to revisit these if we use a newer version of cucumber ie io.cucumber etc
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        // using json plug in to generate reports - to use with 3rd party tools
        plugin = {"json:target/cucumber-report/cucumber.json"},
        // allow us to define which tests we want to run based on the tags we specify
        tags = "not @to-do"
        // glue = "path to Stepdefs if not in the same folder",
        // features = "pathto features if not in co.uk.safebear folder"
)
public class RunCucumberTest {
}
