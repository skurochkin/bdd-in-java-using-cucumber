package unit_tests.stores;

/**
 * Created by slavkurochkin on 3/22/17.
 */

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/api_tests/stores"},
        tags = {"@apitest"},
        format = {"pretty", "html:target/Destination"} )
public class RunApiCukesTest {
}
