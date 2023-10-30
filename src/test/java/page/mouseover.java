package page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class mouseover {
	EdgeDriver driver;
	@BeforeTest
	public void test()
	{
		driver=new EdgeDriver();
		
	}
	
	@BeforeMethod
	public void upload()
	{
		driver.get("https://www.naukri.com/companies-hiring-in-india?src=gnbCompanies_homepage_srch");
		
	}
	@Test
	public void test1()
	{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	WebElement mouse=driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div[2]/nav/ul/li[2]/a/div"));
	Actions act=new Actions(driver);
	act.moveToElement(mouse).perform();
	driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div[2]/nav/ul/li[2]/div/ul[1]/li[2]/a/div")).click();
	}

}



