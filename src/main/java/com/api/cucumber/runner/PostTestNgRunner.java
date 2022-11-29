package com.api.cucumber.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = {"src/main/java/com/api/cucumber/featurefile/PostFeature.feature",
				"src/main/java/com/api/cucumber/featurefile/Login.feature"},
		glue= {"com.api.cucmber.stepdefination","com.api.cucumber.hooks"},
				dryRun = false, 
                monochrome = true,
                plugin = {"pretty",
				"html:target/cucumber-reports/CucumberTestReport.html",
				"json:target/cucumber-reports/CucumberTestReport.json",
				"rerun:target/cucumber-reports/rerun.txt"
				}
		
		)
public class PostTestNgRunner extends AbstractTestNGCucumberTests{

}
