package cucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.spring.CucumberContextConfiguration;
import org.junit.runner.RunWith;

//Used to run tests
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "pretty", features = "src/test/resources/features"
)
public class CucumberRunnerTest {
}
