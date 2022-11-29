package com.api.cucumber.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/main/java/com/api/cucumber/featurefile/Login.feature" },
                 glue = {"com.api.cucmber.stepdefination"},
                 dryRun = false, 
                 monochrome = true, 
                 plugin = {"pretty",
				"html:target/cucumber-reports/CucumberTestReport.html",
				"json:target/cucumber-reports/CucumberTestReport.json",
				"rerun:target/cucumber-reports/rerun.txt"
				}

)
public class Login {

}
