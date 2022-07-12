package crossbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {

	  
	public static WebDriver openChrome()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\SOFTWEAR\\eclipse-java-2021-12-R-win32-x86_64\\eclipse\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		return driver;
	}
	
	public static WebDriver openEdgedriver() {
		
		System.setProperty("webdriver.gecko.driver", "E:\\SOFTWEAR\\eclipse-java-2021-12-R-win32-x86_64\\eclipse\\geckodriver-v0.31.0-win64\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	return driver;
	
	} 
	
	
	
	
	
}
