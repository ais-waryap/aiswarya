package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class agentpage {

	WebDriver driver;
	By agentemail=By.xpath("//*[@id=\"usernameField\"]");
	By agentpassword=By.xpath("//*[@id=\"passwordField\"]");
	By agentlogin=By.xpath("//*[@id=\"loginForm\"]/div[2]/div[3]/div/button[1]");
	

	
	public agentpage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void setvalues(String email, String password)
	{
		driver.findElement(agentemail).sendKeys(email);
		driver.findElement(agentpassword).sendKeys(password);
		
		
	}
	public void login()
	{
		driver.findElement(agentlogin).click();
	}
		

}



