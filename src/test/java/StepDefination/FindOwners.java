package StepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FindOwners {
	WebDriver w ;
	String s = "C:\\dev\\Tools\\geckodriver.exe";
	
	@Given("^Open Petclinic application$")
	public void open_Petclinic_application()  {
		System.setProperty("webdriver.gecko.driver", s);
		w = new FirefoxDriver();
		w.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		  w.get("http://localhost:5050/");
	}

	@When("^I click on findowners$")
	public void i_click_on_findowners() throws Throwable {
		 w.findElement(By.linkText("Find owners")).click();
	}

	@Then("^It should go to findowners page$")
	public void it_should_go_to_findowners_page()  {
	   
	}

	

}
