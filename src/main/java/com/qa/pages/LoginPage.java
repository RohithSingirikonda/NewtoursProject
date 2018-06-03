package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testbase.TestBase;

public class LoginPage extends TestBase{
	
	
	@FindBy(xpath="//img[conatins(text(),'Mercury Tours']")
	WebElement logo;
	
	@FindBy(name="userName")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//input[@name='login']")
	WebElement loginBtn;
	
	@FindBy(xpath="//a[conatins(text(),'SIGN-ON']")
	WebElement signinLink;
	
	@FindBy(xpath="//a[conatins(text(),'REGISTER']")
	WebElement registrationLink;

	@FindBy(xpath="//a[conatins(text(),'SUPPORT']")
	WebElement supportLink;

	@FindBy(xpath="//a[conatins(text(),'CONTACT']")
	WebElement contactLink;
	
	@FindBy(xpath="//a[conatins(text(),'Home']")
	WebElement homeLink;
	
	@FindBy(xpath="//a[conatins(text(),'Flights']")
	WebElement flightsLink;
	
	@FindBy(xpath="//a[conatins(text(),'Hotels']")
	WebElement hotelsLink;
	
	@FindBy(xpath="//a[conatins(text(),'Car Rentals']")
	WebElement carRentalsLink;
	
	@FindBy(xpath="//a[conatins(text(),'Cruises']")
	WebElement cruisesLink;
	
	@FindBy(xpath="//a[conatins(text(),'Destinations']")
	WebElement destinationsLink;
	
	@FindBy(xpath="//a[conatins(text(),'Vacations']")
	WebElement vacationsLink;
	
	
	//Initializing the Page Objects:
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	public boolean validateNewToursLogo(){
		return logo.isDisplayed();
	}
	
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	
	public HomePage Login(String name, String pass){
		username.sendKeys(name);
		password.sendKeys(pass);
		loginBtn.click();		
		
		return new HomePage();
		
	}
	
	public RegistrationPage RegistrationPageLink(){
		registrationLink.click();
		
		return new RegistrationPage();
	}
	
	public SupportPage SupportPageLink(){
		supportLink.click();
		
		return new SupportPage();
	}
	
	public ContactPage ContactPageLink(){
		contactLink.click();
		
		return new ContactPage();
	}
	
	public LoginPage LoginPageLink(){
		homeLink.click();
		
		return this;
	}
	
	public FlightsPage FlightsPageLink(){
		flightsLink.click();
		
		return new FlightsPage();
	}
	
	public HotelsPage HotelsPageLink(){
		hotelsLink.click();
		
		return new HotelsPage();
	}
	
	public CarRentalsPage carRentalsPageLink(){
		carRentalsLink.click();
		
		return new CarRentalsPage();
	}
	
	public CruisesPage CruisesPageLink(){
		cruisesLink.click();
		
		return new CruisesPage();
	}
	
	public DestinationsPage DestinationsPageLink(){
		destinationsLink.click();
		
		return new DestinationsPage();
	}
	
	public VacationsPage VacationsPageLink(){
		vacationsLink.click();
		
		return new VacationsPage();
	}
		
	
	
	
}
