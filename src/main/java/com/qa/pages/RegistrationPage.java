package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.base.TestBase;

public class RegistrationPage extends TestBase{

	
	@FindBy(xpath="//input[@name='firstName']")
	WebElement firstName;
	
	@FindBy(xpath="//input[@name='lastName']")
	WebElement lastName;

	@FindBy(xpath="//input[@id='userName']")
	WebElement userName;

	@FindBy(xpath="//input[@name='phone']")
	WebElement phone;
	
	@FindBy(xpath="//input[@name='address1']")
	WebElement address1;

	@FindBy(xpath="//input[@name='address2']")
	WebElement address2;

	@FindBy(xpath="//input[@name='city']")
	WebElement city;

	@FindBy(xpath="//input[@name='state']")
	WebElement state;

	@FindBy(xpath="//input[@name='postalCode']")
	WebElement postalCode;

	@FindBy(name="country")
	WebElement country;
	
	@FindBy(xpath="//input[@id='email']")
	WebElement email;

	@FindBy(xpath="//input[@name='password']")
	WebElement password;

	@FindBy(xpath="//input[@name='confirmPassword']")
	WebElement confirmPassword;

	@FindBy(xpath="//input[@name='register']")
	WebElement register;
	
	
	public RegistrationPage(){
		PageFactory.initElements(driver, this);
	}
	
	
	public LoginPage RegisterUsers(String firstname, String lastname, String Phone, String Email, String Address1, String Address2,
			 String City, String State, String PostalCode, String uname, String Password, String ConfirmPassword){
		
		
		firstName.sendKeys(firstname);
		lastName.sendKeys(lastname);
		phone.sendKeys(Phone);
		userName.sendKeys(Email);
		address1.sendKeys(Address1);
		address2.sendKeys(Address2);
		city.sendKeys(City);
		state.sendKeys(State);
		postalCode.sendKeys(PostalCode);		
		email.sendKeys(uname);
		password.sendKeys(Password);
		confirmPassword.sendKeys(ConfirmPassword);
		register.click();
		
		return new LoginPage();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
