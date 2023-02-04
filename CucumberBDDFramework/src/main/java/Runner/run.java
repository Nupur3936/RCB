package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/Features/RCB.feature"}, //the path of the feature files
        glue={"stepDefinitions"} //the path of the step definition files
)



public class run {
}
