package com.izeal.testrunner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions
			(features="Features", 
			glue={"com.izeal.petclinic.stepdefinitions"}, 
			format = {"pretty","json:target/cucumber.json"},
			tags = {"@addowner"}
			) 


public class DashboardTest {

}
