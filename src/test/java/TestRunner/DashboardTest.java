package TestRunner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(features="Features", glue={"StepDefination"},  format = {"pretty", "html:target/Destination"} ) 


public class DashboardTest {

}
