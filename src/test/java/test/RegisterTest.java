package test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import actionlibrary.ExampleWebElementsLib;
import commonutilities.DriverConfig;

public class RegisterTest {
	
	ExampleWebElementsLib exampleWebElementsLib ;
	
	// = new exampleWebElements(); -- this has to be done after calling the openbrowser
	
	
	@BeforeClass
	public void callBrowser()
	{
		DriverConfig.OpenBrowser("chrome");
	 exampleWebElementsLib = new ExampleWebElementsLib();
	}

	@BeforeMethod
	public void navigateToApplication()
	{
		DriverConfig.driver.get("http://demo.automationtesting.in/Register.html");
	}

	@Test
	public void callingTestcases()
		{
		      exampleWebElementsLib.enterFirstName("Chai");
		      exampleWebElementsLib.enterLastName("Neel");
		      exampleWebElementsLib.enterAddress("JP Nagar");
		      exampleWebElementsLib.enterEmail("chaitra1482@gmail.com");
		      exampleWebElementsLib.enterTelephone("766992110");
		      exampleWebElementsLib.selectGender();
		      exampleWebElementsLib.selectHobbies();
		      exampleWebElementsLib.selectLanguage();
		     // exampleWebElementsLib.selectEnglishLanguage();
		      exampleWebElementsLib.selectSkills();
		      exampleWebElementsLib.selectCountries();
		      exampleWebElementsLib.selectCountry2();
		      exampleWebElementsLib.selectCountry21();
		      exampleWebElementsLib.selectDdobYear();
		      exampleWebElementsLib.selectDobMonth();
		      exampleWebElementsLib.selectDobDay();
		      exampleWebElementsLib.enterFirstPassword("Demo@123");
		      exampleWebElementsLib.enterSecondPassword("Demo@123");
		      exampleWebElementsLib.clickSubmit();
		         
		     
		}
		/*@AfterSuite
		public void killTask() throws IOException
		{
			Runtime.getRuntime().exec("taskkill /IM chromedriver.exe /f");
		}
*/
	
	
}
