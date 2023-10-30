package page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class copy {
	EdgeDriver driver;
	@BeforeTest
	public void test()
	{
		driver=new EdgeDriver();
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://www.naukri.com/registration/createAccount?");
	}
	@Test
	public void test1()
	{
	 WebElement Fullname=driver.findElement(By.xpath("//*[@id=\"name\"]"));
	 Fullname.sendKeys("abc");
	 WebElement email =driver.findElement(By.xpath("//*[@id=\"email\"]"));
	 Actions ac=new Actions(driver);
	 ac.keyDown(Fullname,Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);
	 ac.keyDown(Fullname,Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL);
	 ac.keyDown(email,Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL);
	 ac.perform();
	 
	 
	}

}
