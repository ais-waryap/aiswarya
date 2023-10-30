package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.agentpage;

public class agenttest {
	
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new EdgeDriver();
	}
	@BeforeMethod
	public void url()
	{
		driver.get("https://www.naukri.com/nlogin/login");
	}
	@Test
	public void testlogin()
	{
		agentpage ob=new agentpage(driver);
		ob.setvalues("aiswarya4267@gmail.com","aiswaryaammu123");
		ob.login();
		
	}
	

}
