package com.api.cucumber.hooks;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class GeneralHooks {
	
	@Before()
	public void setUp(Scenario scenario) {
		System.out.println("=========== Before Hook ===================");
		System.out.println("Name: "+ scenario.getName());
		System.out.println("Status: "+ scenario.getStatus());
		
		
		//System.out.println("Feature File Name: "+getFeatureFileNameFromScenarioId(scenario));
//		String featureFileName=getFeatureFileNameFromScenarioId(scenario);
//		String scenarioName=scenario.getName();
//		
//		setFeatureName(featureFileName);
//		setScenarioName(scenarioName);
		
	}
	
	@After
	public void tearDown(Scenario name) {
		System.out.println("=========== After Hook ===================");
		System.out.println("Name: "+ name.getName());
		System.out.println("Status: "+ name.getStatus());
	}
	
	public String getFeatureFileNameFromScenarioId(Scenario scenario) {
	    String featureName = "null ";
	    String rawFeatureName = scenario.getId().split(";")[0].replace("-"," ");
	    featureName =rawFeatureName.substring(0, 1).toUpperCase() + rawFeatureName.substring(1);
	    return featureName;
	}

}
