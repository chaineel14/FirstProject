package commonutilities;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverConfig {
	
	/*public static DriverConfig getInstance()
	{
		if(driverConfig == null)
		{
			driverConfig = new DriverConfig();
		}
		return driverConfig;
	}
	*/
	public static WebDriver driver;
	
	
		
    public static void OpenBrowser(String browserName){
	
    if(driver == null)
	switch(browserName)
	{
	case "chrome" : 
	
		
	    ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-infobars");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Megha\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver(options);
		String parentWindow = driver.getWindowHandle();
		Set<String> windows = driver.getWindowHandles();
		windows.remove(parentWindow);
		driver.manage().window().maximize();
		for(String s: windows)
		{
			driver.switchTo().window(s);
			driver.close();
		} 
		driver.switchTo().window(parentWindow);
		
		
		break;
		
	case "ie" : 
		        System.setProperty("webdriver.ie.driver", "C:\\Users\\Megha\\Downloads\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");
	            driver = new InternetExplorerDriver();
	            driver.manage().window().maximize();
	            String parentWindow2 = driver.getWindowHandle();
	            Set<String> windows2 = driver.getWindowHandles();
	            windows2.remove(parentWindow2);
	            for(String s: windows2)
	            {
		           driver.switchTo().window(s);
		           driver.close();
	            }
	       break;
	 
	case "default": System.out.println("Unable to find your browser");
		
	}
    ReportConfiguration.initialiseconfig();
	}

	
	

}
