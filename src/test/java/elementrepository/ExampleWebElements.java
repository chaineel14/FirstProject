package elementrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ExampleWebElements {
	
	@FindBy(xpath="//a[@class='js-nav EdgeButton EdgeButton--medium EdgeButton--secondary StaticLoggedOutHomePage-buttonLogin']")
    private WebElement login;
	
	@FindBy(xpath="//input[@placeholder='Phone, email or username']")
	private WebElement emailAddress;
	
	@FindBy(xpath="//input[@class='js-password-field']")
	private WebElement password;
	
	@FindBy(linkText="Forgot password?")
	private WebElement forgotpassword;
//----------------------------------------------------------------------------------
	@FindBy(xpath="//input[@placeholder='First Name']")
	private WebElement firstname;
	
	@FindBy(xpath="//input[@placeholder='Last Name']")
	private WebElement lastname;

	@FindBy(xpath="//textarea[@ng-model='Adress']")
	private WebElement address;

	@FindBy(xpath="//input[@type='email']")
	private WebElement email;

	@FindBy(xpath="//input[@type='tel']")
	private WebElement telephone ;

	@FindBy(xpath="//input[@value='FeMale']")
	private WebElement gender;

	@FindBy(xpath="//input[@value='Cricket']")
	private WebElement hobbies ;

	@FindBy(xpath="//div[@id='msdd']")
	private WebElement language ;

	@FindBy(xpath="//*[contains(text(),'English')]")
	private WebElement english;
	
	@FindBy(xpath="//select[@id='Skills']")
	private WebElement skills ;
	
	//@FindBy(xpath="//select[@id='Skills']")
	//private WebElement android;

	@FindBy(xpath="//select[@id='countries']")
	private WebElement countries  ;
	
	@FindBy(xpath="//span[@role='combobox']")
	private WebElement countries2  ;
	
	@FindBy(xpath="//ul[@class='select2-results__options']/li[contains(text(),'Australia')]")
	private WebElement countries21  ;

	@FindBy(xpath="//select[@placeholder='Year']")
	private WebElement dobYear ;

	@FindBy(xpath="//select[@placeholder='Month']")
	private WebElement dobMonth ;

	@FindBy(xpath="//select[@placeholder='Day']")
	private WebElement dobDay  ;

	@FindBy(xpath="//input[@id='firstpassword']")
	private WebElement firstpassword ;

	@FindBy(xpath="//input[@id='secondpassword']")
	private WebElement secondpassword ;

	@FindBy(xpath="//button[@type='submit']")
	private WebElement submit ;

//----------------------------------------------------------------------------------	
	public WebElement getLogin() {
		return login;
	}

	public WebElement getEmailAddress() {
		return emailAddress;
	}

	public WebElement getPassword() {
		return password;
	}
	
	public WebElement getForgotpassword() {
		return forgotpassword;
	}
//-----------------------------------------------------------------------------------	

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getTelephone() {
		return telephone;
	}

	public WebElement getGender() {
		return gender;
	}

	public WebElement getHobbies() {
		return hobbies;
	}

	public WebElement getLanguage() {
		return language;
	}

	public WebElement getEnglish() {
		return english;
	}

	public WebElement getSkills() {
		return skills;
	}

	public WebElement getCountries() {
		return countries;
	}
	
	public WebElement getCountries2() {
		return countries2;
	}

	public WebElement getCountries21() {
		return countries21;
	}


	public WebElement getDobYear() {
		return dobYear;
	}

	public WebElement getDobMonth() {
		return dobMonth;
	}

	public WebElement getDobDay() {
		return dobDay;
	}

	public WebElement getFirstpassword() {
		return firstpassword;
	}

	public WebElement getSecondpassword() {
		return secondpassword;
	}

	public WebElement getSubmit() {
		return submit;
	}
	
}

