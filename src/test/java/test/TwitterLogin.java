package test;

import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import actionlibrary.ExampleWebElementsLib;
import commonutilities.DriverConfig;
import commonutilities.ReportConfiguration;

public class TwitterLogin {
ExampleWebElementsLib exampleWebElementsLib ;
	
	// = new exampleWebElements(); -- this has to be done after calling the openbrowser
	
	
	
	@BeforeClass
	public void callBrowser()
	{
		DriverConfig.OpenBrowser("chrome");
		exampleWebElementsLib = new ExampleWebElementsLib();
	}
	
	@BeforeMethod
	public void navigateToApplication(Method m){
		
		DriverConfig.driver.get("http://www.twitter.com");
        ReportConfiguration.report.startTest(m.getName());		
	}
	
	@Test
	public void callingTestcases() throws Exception
	{
		exampleWebElementsLib.clickLgoinButton();
		Thread.sleep(5000);
		exampleWebElementsLib.enterEmailAddress("chaitra1482@gmail.com");
		exampleWebElementsLib.enterPassword("iamstrong@123");
		exampleWebElementsLib.clickForgotPassword();
	}
	
/*	@AfterMethod
	public void killTask() throws IOException
	{
		Runtime.getRuntime().exec("taskkill /IM chromedriver.exe /f");
	}*/

    @AfterClass
    public void reportConfiguration() throws Exception
    {
    	ReportConfiguration.logger.log(LogStatus.INFO, "Test Info");
    	ReportConfiguration.report.endTest(ReportConfiguration.logger);
    	ReportConfiguration.report.flush();  // flush() commits the reports and logger object things to the file
    	DriverConfig.driver.get(ReportConfiguration.ReportLocation);
    }
}
