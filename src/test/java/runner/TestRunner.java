package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features =".//src//test//resource//Features",// features tells cucumber options where feature files are located
		glue = "stepDefinitions",
		tags = {"@AddCanonEOS5D"},
		//glue tells cucumber options where step Definition classes located
		dryRun= false, // dry run if sets to false checks if all steps in feature files has step
		monochrome = true, // if set to true, makes the console output readable.
		strict = false, // if set to false will fail if there are pending undefined steps.
		format = {"pretty",
		        "html:target/cucumber-reports/cucumber-pretty",
		        "json:target/cucumber-reports/CucumberTestReport.json",
		        "rerun:target/cucumber-reports/rerun.txt"	
		}

		)

public class TestRunner {

}