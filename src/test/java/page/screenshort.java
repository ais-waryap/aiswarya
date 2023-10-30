package page;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class screenshort {

		EdgeDriver driver;
		@BeforeTest
		public void setup()
		{
			driver=new EdgeDriver();
		}
		@BeforeMethod
		public void url()
		{
			driver.get("https://www.naukri.com");
		}
		@Test
		public void test1() throws IOException 
		{
			File sre=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(sre, new File("./screenshot//Elements.png"));
		}

	}


