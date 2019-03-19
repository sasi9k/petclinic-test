package com.izeal.testrunner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions
			(features="Features", 
			glue={"com.izeal.petclinic.stepdefinitions"}, 
			format = {"pretty", "html:target/Destination"},
			tags = {"@addowner"}
			) 


public class DashboardTest {

}
