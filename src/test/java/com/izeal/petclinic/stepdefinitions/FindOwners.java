package com.izeal.petclinic.stepdefinitions;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FindOwners {
	WebDriver w;
	String Node;
	
	@Given("^Open Petclinic application$")
	public void open_Petclinic_application() throws MalformedURLException  {
		Node = "http://192.168.1.221:4444/wd/hub";
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WIN10);
		
		w = new RemoteWebDriver(new URL(Node), cap);
		w.manage().window().maximize();
	
		  w.get("http://springpetclinic-env.kfqhm5ccsp.us-east-1.elasticbeanstalk.com/");
	}

	@When("^I click on findowners$")
	public void i_click_on_findowners() throws Throwable {
		 w.findElement(By.partialLinkText("OWNERS")).click();
	}

	@Then("^It should go to findowners page$")
	public void it_should_go_to_findowners_page()  {
	   
	}

	

}
