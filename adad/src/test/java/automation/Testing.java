package automation;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import crossbrowser.base;

public class Testing extends base{

	
	WebDriver driver;
	
	
	 
	@Parameters ("browser")
	@BeforeClass
 
	public void launchbrowser(String browsername)
	{
		if (browsername.equals("chrome"))
		{
			driver=base.openChrome();
		}
		if (browsername.equals("Firefoxdriver"))
		{
			driver=base.openEdgedriver();
		}
		  
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		System.out.println(" end ");
		}
	
	@Test
	public void dataclear()
	
	{
		String url =driver.getCurrentUrl();
		System.out.println(url);
		String title=driver.getTitle();
System.out.println(title);	}
	
	@AfterClass
	public void data()
	{
		System.out.println("taskdone");
	}
	
	
	
	
	
		
	}
	

