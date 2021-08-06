package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//Tum feature filelari test etmek icin
@CucumberOptions(

        features = {"src/test/java"},
        glue = {"stepdefination"},
        dryRun = false

)



public class RunnerGeneral extends AbstractTestNGCucumberTests {
}
