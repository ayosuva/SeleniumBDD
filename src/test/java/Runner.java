
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/**
 * Created by Yosuva on 03-05-2021.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/index.html", "json:target/cucumber.json"},
        features = "src/test/resources/features")

public class Runner {
}
