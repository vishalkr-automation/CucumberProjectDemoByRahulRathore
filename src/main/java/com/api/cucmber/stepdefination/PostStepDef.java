package com.api.cucmber.stepdefination;

import com.api.cucumber.BaseClass;
import com.api.cucumber.transform.TransformData;

import cucumber.api.Transform;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PostStepDef {
	
	private BaseClass baseClass;
	
	public PostStepDef(BaseClass baseClass) {
		this.baseClass=baseClass;
	}

	@Given("user should be logged in")
	public void user_should_be_logged_in() {
	   System.out.println("Given User should be logged in");
	   
	   System.out.println("Feature File Name is: "+ baseClass.getFeatureName());
	   System.out.println("Scenario Name is: "+ baseClass.getScenarioName());
	}

	@And("should be present at its wall")
	public void should_be_present_at_its_wall() {
		 System.out.println("And should be present at its wall");
	}

	@When("I type text in th text box")
	public void i_type_text_in_th_text_box() {
		 System.out.println("When I type text in th text box");
	}

	@And("click on Post Button")
	public void click_on_post_button() {
		 System.out.println("And click on Post Button");
	}

	@Then("The message should I Posted")
	public void the_message_should_i_posted() {
		 System.out.println("Then The message should I Posted");
	}

	@When("User supply the youtube link in the text box")
	public void user_supply_the_youtube_link_in_the_text_box() {
		 System.out.println("When User supply the youtube link in the text box");
	}

	@Then("The video should get posted on the user wall")
	public void the_video_should_get_posted_on_the_user_wall() {
		 System.out.println("Then The video should get posted on the user wall");
	}

	@And("Video should have proper Thumbnail")
	public void video_should_have_proper_thumbnail() {
		 System.out.println("And Video should have proper Thumbnail");
	}
	
	 @When("^I type text text as \"([^\"]*)\" in the textbox$")
	    public void i_type_text_text_as_something_in_the_textbox(@Transform(TransformData.class)String args) throws Throwable {
	        System.err.println("When Type text in text box: "+ args);
	   }
	  @When("^User supply the youtube link as \"([^\"]*)\" in the text box$")
	    public void user_supply_the_youtube_link_as_something_in_the_text_box(String strArg1) throws Throwable {
		  System.err.println("When supply video link in text box");
	    }
}
