package com.test.stepdefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SampleStepDefinationFile {
	
	@Given("^I have a scenario to execute$")
	public void i_have_a_scenario_to_execute() throws Throwable {
	    System.out.println("given executed");
	}

	@When("^I write the scenario and code \"([^\"]*)\"$")
	public void i_write_the_scenario_and_code(String arg1) throws Throwable {
	    System.out.println("print when " + arg1);
	}

	@Then("^I will be able to execute it \"([^\"]*)\"$")
	public void i_will_be_able_to_execute_it(String arg1) throws Throwable {
		System.out.println("print then " + arg1);
	}
	
	@Then ("^I will be able to execute it \"([^\"]*)\" by \"([^\"]*)\" \"([^\"]*)\"$")
	public void i_will_be_able_to_execute_it_by(String arg1, String arg2, String arg3) throws Throwable {
	    System.out.println("printing then by " + arg2 + arg3  );
	}
	
	@Then ("^I will be able to execute it \"([^\"]*)\" by \"([^\"]*)\"$")
	public void i_will_be_able_to_execute_it_by(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("printing then by " + arg2  );
	}


}
