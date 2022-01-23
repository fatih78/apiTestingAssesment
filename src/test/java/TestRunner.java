import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
//import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty",
                "html:target/cucumber-reports/cucumber.html",
                "json:target/cucumber-reports/cucumber.json"
        },
        features = "src/test/resources/features",
        glue = {"stepDefinitions"},
        dryRun = true,
        monochrome = true
)

public class TestRunner {
}
