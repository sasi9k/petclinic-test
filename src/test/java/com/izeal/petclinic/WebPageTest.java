package seleniumproject.com.testwebpage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebPageTest {
	
	public static void main(String[]args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\KARTHIKEYA\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver;
		String baseurl,nodeurl;
		baseurl="http://springpetclinic-env.kfqhm5ccsp.us-east-1.elasticbeanstalk.com/";
		nodeurl="http://192.168.1.221:4444/wd/hub";
	        driver.get(baseurl);
	        DesiredCapabilities capabilty= DesiredCapabilities.firefox();
		capability.setBrowserName("firefox");
		capability.setPlateform(Platform.XP);
		driver = new RemoteWebDriver(new URL(nodeurl),capability);
		
		
		   
		 
		   
		  // driver.manage().window().maximize();
		   
		driver.findElement(By.xpath("//*[@id=\"main-navbar\"]/ul/li[2]/a")).click(); //Home page
		System.out.println("click");
		driver.findElement(By.xpath("//*[@id=\"main-navbar\"]/ul/li[3]/a/span[2]")).click(); //main bar
		Thread.sleep(2000);
		//driver.findElement(By.id("lastName")).sendKeys("anusha"); //lastname
		//driver.findElement(By.xpath("//*[@id=\"search-owner-form\"]/div[2]/div/button")).click(); // find owner
		driver.findElement(By.xpath("/html/body/div/div/a")).click();  //add owner
		driver.findElement(By.id("firstName")).sendKeys("anoosha");
		driver.findElement(By.id("lastName")).sendKeys("Jagarlamudi");
		driver.findElement(By.id("address")).sendKeys("20816");
		driver.findElement(By.id("city")).sendKeys("sterling");
		driver.findElement(By.id("telephone")).sendKeys("56780988");
		driver.findElement(By.xpath("//*[@id=\"add-owner-form\"]/div[2]/div/button")).submit();
		driver.findElement(By.xpath("/html/body/div/div/a[1]")).click();
		 driver.findElement(By.id("telephone")).sendKeys("5678098812");
		  
		 
		 
		driver.findElement(By.xpath("//*[@id=\"add-owner-form\"]/div[2]/div/button")).click();
		
		driver.findElement(By.xpath("//*[@id=\"main-navbar\"]/ul/li[4]/a/span[2]")).click();
		//*[@id="main-navbar"]/ul/li[4]/a/span[2]
		
		driver.findElement(By.linkText("View as XML")).click();
		
		driver.close();
		
	
		
	}

}
