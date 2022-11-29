package com.api.cucmber.stepdefination;

import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDfn {
	
	@Given("^User is at Login Page of the application$")
	public void user_is_at_Login_Page_of_the_application() throws Throwable {
	   System.out.println("Given User verify the login page");
	}

	@When("^User login with following userName and password$")
	public void user_login_with_following_userName_and_password(DataTable table) throws Throwable {
//	   List<List<String>> data=table.raw();
//	   String userName=data.get(1).get(0);
//	   String password=data.get(1).get(1);
//	   System.out.println("UserName: "+userName +" "+ "Password: "+ password);
	   
//	   for(List<String> str:data) {
//		   for(String str1:str) {
//			   System.out.println("Data: "+str1);
//		   }
//		   
//	   }
	   
	   //Data table to List Data Structure
//	   List<String> dataList=table.asList(String.class);
//	   for(String key:dataList) {
//		   System.out.println(key);
//	   }
	   Map<String, String> data=table.asMap(String.class, String.class);
	   for(String key:data.keySet()) {
		   System.out.println(data.get(key));
		   
	   }
	   
	}

	@Then("^User should be login with correct username and password$")
	public void user_should_be_login_with_correct_username_and_password() throws Throwable {
		 System.out.println("User User verify the Home page");
	}
	
	 @Given("^User enter value1 \"([^\"]*)\"$")
	    public void user_enter_value1_something(String value1) {
	        System.out.println(value1);
	    }

	    @When("^User enter value2 \"([^\"]*)\"$")
	    public void user_enter_value2_something(String value2){
	    	 System.out.println(value2);
	    }

	    @Then("^User enter value3 \"([^\"]*)\"$")
	    public void user_enter_value3_something(String value3) {
	    	 System.out.println(value3);
	    }


}
