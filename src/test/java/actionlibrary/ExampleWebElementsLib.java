package actionlibrary;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import commonutilities.DriverConfig;
import commonutilities.ReportConfiguration;
import elementrepository.ExampleWebElements;

public class ExampleWebElementsLib {

	//ExampleWebElements exampleWebElements = new ExampleWebElements(); -- this way of object creation
	           // will throw null point exception since there is no link between webelements and driver object
	ExampleWebElements exampleWebElements = PageFactory.initElements(DriverConfig.driver, ExampleWebElements.class);
	
	public void clickLgoinButton()
	{
		try{
			 exampleWebElements.getLogin().click();
			 ReportConfiguration.PassCase("Able to click login button", "Login button");
		}	
		catch(Exception e)
		{
			ReportConfiguration.FailCase("Unable to click login button", "Login button");
		}
	}
	
	public void enterEmailAddress(String emailID)
	{
		try{
			exampleWebElements.getEmailAddress().sendKeys(emailID);
			 ReportConfiguration.PassCase("Able to enter email address", "Email address");
		}	
		catch(Exception e)
		{
			ReportConfiguration.FailCase("Unable to enter email address", "Email address");
		}

	}
	
	public void enterPassword(String password)
	{
		try{
			 exampleWebElements.getPassword().sendKeys(password);
			 ReportConfiguration.PassCase("Able to enter password", "Password");
		}	
		catch(Exception e)
		{
			ReportConfiguration.FailCase("Unable to enter password", "Password");
		}
		
	}
	
	public void clickForgotPassword()
	{
		try{
			 exampleWebElements.getForgotpassword();
			 ReportConfiguration.PassCase("Able click on forgot password", "Forgot password");
		}	
		catch(Exception e)
		{
			ReportConfiguration.FailCase("Unable to click on forgot password", "Forgot password");
		}
	}
//----------------------------------------------------------------------------
	public void enterFirstName(String firstname)
	{
	exampleWebElements.getFirstname().sendKeys(firstname);	
	}
	
	public void enterLastName(String lastname)
	{
		exampleWebElements.getLastname().sendKeys(lastname);
	}
	public void enterAddress(String address)
	{
		exampleWebElements.getAddress().sendKeys(address);
	}
	
	public void enterEmail(String email)
	{
		exampleWebElements.getEmail().sendKeys(email);
	}
	
	public void enterTelephone(String telephone)
	{
		exampleWebElements.getTelephone().sendKeys(telephone);
	}
	
	public void selectGender()
	{
		exampleWebElements.getGender().click();
	}
	public void selectHobbies()
	{
		exampleWebElements.getHobbies().click();
	}
	
	//public void selectLanguage(String lang)
	public void selectLanguage()
	{
		//exampleWebElements.getLanguage().findElements(lang);
		exampleWebElements.getLanguage().click();
	}
	
	/*public void selectEnglishLanguage()
	{
		Select sel = new Select(exampleWebElements.getEnglish());
		//exampleWebElements.getEnglish().click();	
		sel.deselectByValue("English");
	}*/
	
	public void selectSkills()
	{
		Select sel = new Select(exampleWebElements.getSkills());
		sel.selectByValue("Android");
		//exampleWebElements.getSkills().click();	
	}
	
	public void selectCountries()
	{
		exampleWebElements.getCountries().isSelected();
	}
	
	public void selectCountry2()
	{
		exampleWebElements.getCountries2().click();
	}
	
	public void selectCountry21()
	{
		exampleWebElements.getCountries21().click();
	}
	
	public void selectDdobYear()
	{
		exampleWebElements.getDobYear().isSelected();
	}
	
	public void selectDobMonth()
	{
		exampleWebElements.getDobMonth().isSelected();
	}
	
	public void selectDobDay()
	{
		exampleWebElements.getDobDay().isSelected();
	}
	
	public void enterFirstPassword(String firstpassword)
	{
		exampleWebElements.getFirstpassword().sendKeys(firstpassword);
	}
	
	public void  enterSecondPassword(String secondpassword)
	{
		exampleWebElements.getSecondpassword().sendKeys(secondpassword);
	}
	
	public void clickSubmit()
	{
		exampleWebElements.getSubmit().click();
	}
	
	
}
