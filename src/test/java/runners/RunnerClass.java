package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        // features we use to provide the path of all the feature files
        features = "src/test/resources/features/",
        //glue is where are find implementation of gherkin steps
        //we provide the path of package where we defined all step def
        glue = "steps",
        //if we set the value of dry run true, it will stop the execution
        //it quickly scans all the gherkin steps in all feature files and will give
        //for actual execution, we need to set the value of it to false
        dryRun = true,
        //tags will identify the scenarios in a group and will execute all the scenarios having these tags
        tags = "@2ndempAdd"
)

public class RunnerClass {
}
