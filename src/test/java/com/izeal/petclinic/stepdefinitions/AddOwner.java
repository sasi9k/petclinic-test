package com.izeal.petclinic.stepdefinitions;

import java.io.File;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class AddOwner {
	WebDriver w;
	String Node;

	@Given("^Open Home Page forElasticbeanstalk$")
	public void open_Home_Page_forElasticbeanstalk() throws Throwable {
		Node = "http://192.168.1.221:4444/wd/hub";
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setBrowserName("chrome");
		// cap.setPlatform(Platform.WIN10);
		cap.setPlatform(Platform.LINUX);

		w = new RemoteWebDriver(new URL(Node), cap);
		w.manage().window().maximize();

		w.get("http://springpetclinic-env.kfqhm5ccsp.us-east-1.elasticbeanstalk.com/");
	}

	@Given("^click on Find owners and click on Add owner$")
	public void click_on_Find_owners_and_click_on_Add_owner() throws Throwable {
		w.findElement(By.partialLinkText("OWNERS")).click();
		w.findElement(By.xpath("/html/body/div/div/a")).click(); // add owner

	}

	@Given("^Enter  these values \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void enter_these_values(String firstname, String lastname, String address, String city, String telephone)
			throws Throwable {

		w.findElement(By.id("firstName")).sendKeys(firstname);
		w.findElement(By.id("lastName")).sendKeys(lastname);
		w.findElement(By.id("address")).sendKeys(address);
		w.findElement(By.id("city")).sendKeys(city);
		w.findElement(By.id("telephone")).sendKeys(telephone);

	}

	@Then("^Click On add owner$")
	public void click_On_add_owner() throws Throwable {
		w.findElement(By.xpath("//*[@id=\"add-owner-form\"]/div[2]/div/button")).submit();
		w.findElement(By.xpath("/html/body/div/div/a[1]")).click();
		File src = ((TakesScreenshot) w).getScreenshotAs(OutputType.FILE);
		Files.copy(src, new File("C:\\Users\\LAKSHMI NARAYANA\\git\\petclinic-test\\target\\1.png"));
		w.quit();

	}

	

}
