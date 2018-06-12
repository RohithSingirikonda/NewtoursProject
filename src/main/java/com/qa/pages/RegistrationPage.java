package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.base.TestBase;

public class RegistrationPage extends TestBase{

	
	@FindBy(xpath="//input[@name='firstName']")
	WebElement firstname;
	
	@FindBy(xpath="//input[@name='lastName']")
	WebElement lastname;

	@FindBy(xpath="//input[@name='phone']")
	WebElement phone;
	
	@FindBy(xpath="//input[@id='userName']")
	WebElement username;
	
	@FindBy(xpath="//input[@name='address1']")
	WebElement address1;

	@FindBy(xpath="//input[@name='address2']")
	WebElement address2;

	@FindBy(xpath="//input[@name='city']")
	WebElement city;

	@FindBy(xpath="//input[@name='state']")
	WebElement state;

	@FindBy(xpath="//input[@name='postalCode']")
	WebElement postalcode;

	@FindBy(name="country")
	WebElement country;
	
	@FindBy(xpath="//input[@id='email']")
	WebElement email;

	@FindBy(xpath="//input[@name='password']")
	WebElement password;

	@FindBy(xpath="//input[@name='confirmPassword']")
	WebElement confirmpassword;

	@FindBy(xpath="//input[@name='register']")
	WebElement register;
	
	
	public RegistrationPage(){
		PageFactory.initElements(driver, this);
	}
	
	
	public LoginPage RegisterUsers(String firstName, String lastName, String Phone, String userName, String Address1, String Address2,
			 String City, String State, String PostalCode, String uname, String Password, String confirmPassword){
		
		
		firstname.sendKeys(firstName);
		lastname.sendKeys(lastName);
		phone.sendKeys(Phone);
		username.sendKeys(userName);
		address1.sendKeys(Address1);
		address2.sendKeys(Address2);
		city.sendKeys(City);
		state.sendKeys(State);
		postalcode.sendKeys(PostalCode);
		
		//Select select = new Select(country);
		//select.selectByVisibleText(Country);
		
		email.sendKeys(uname);
		password.sendKeys(Password);
		confirmpassword.sendKeys(confirmPassword);
		//register.click();
		
		return new LoginPage();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
