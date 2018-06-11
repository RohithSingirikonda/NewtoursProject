package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	
	@FindBy(xpath="//img[src='http://newtours.demoaut.com/images/nav/logo.gif']")
	WebElement logo;
	
	@FindBy(name="userName")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//input[@name='login']")
	WebElement loginBtn;
	
	@FindBy(xpath="//a[contains(text(),'SIGN-ON')]")
	WebElement signinLink;
	
	@FindBy(xpath="//a[contains(text(),'REGISTER')]")
	WebElement registrationLink;

	@FindBy(xpath="//a[contains(text(),'SUPPORT')]")
	WebElement supportLink;

	@FindBy(xpath="//a[contains(text(),'CONTACT')]")
	WebElement contactLink;
	
	@FindBy(xpath="//a[contains(text(),'Home')]")
	WebElement homeLink;
	
	@FindBy(xpath="//a[contains(text(),'Flights')]")
	WebElement flightsLink;
	
	@FindBy(xpath="//a[contains(text(),'Hotels')]")
	WebElement hotelsLink;
	
	@FindBy(xpath="//a[contains(text(),'Car Rentals')]")
	WebElement carRentalsLink;
	
	@FindBy(xpath="//a[contains(text(),'Cruises')]")
	WebElement cruisesLink;
	
	@FindBy(xpath="//a[contains(text(),'Destinations')]")
	WebElement destinationsLink;
	
	@FindBy(xpath="//a[contains(text(),'Vacations')]")
	WebElement vacationsLink;
	
	
	//Initializing the Page Objects:
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	
	public boolean validateNewToursLogo(){
		return logo.isDisplayed();
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
