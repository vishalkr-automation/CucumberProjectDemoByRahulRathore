package com.api.cucumber;

public class BaseClass {
	
	private String featureName;
	public String getFeatureName() {
		return featureName;
	}

//	public void setFeatureName(String featureName) {
//		this.featureName = featureName;
//	}

	public String getScenarioName() {
		return scenarioName;
	}

//	public void setScenarioName(String scenarioName) {
//		this.scenarioName = scenarioName;
//	}

	private String scenarioName;
	
	public BaseClass() {
		featureName="BDD";
		scenarioName="DI";
		
	}
	


}
