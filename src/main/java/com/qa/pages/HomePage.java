package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class HomePage extends TestBase{

	@FindBy(name="tripType")
	WebElement tripType;
	
	@FindBy(name="passCount")
	WebElement passengers;
	
	@FindBy(name="fromPort")
	WebElement source;
	
	@FindBy(name="fromMonth")
	WebElement fromMonth;
	
	@FindBy(name="fromDay")
	WebElement fromDay;
	
	@FindBy(name="toPort")
	WebElement destination;
	
	@FindBy(name="toMonth")
	WebElement toMonth;
	
	@FindBy(name="toDay")
	WebElement toDay;
	
	@FindBy(name="servClass")
	WebElement classType;
	
	@FindBy(name="airline")
	WebElement airlines; 
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void ValidateFlightSelection(boolean TripType, String Passengers, String Source, String FromMonth, String FromDay, String Destination, 
			String ToMonth, String ToDay, String ClassType, String Airlines) {
		
		
		tripType.isSelected();
		passengers.sendKeys(Passengers);
		source.sendKeys(Source);
		fromMonth.sendKeys(FromMonth);
		fromDay.sendKeys(FromDay);
		destination.sendKeys(Destination);
		toMonth.sendKeys(ToMonth);
		toDay.sendKeys(ToDay);
		classType.isSelected();
		airlines.sendKeys(Airlines);
		
	}
	
	
	
}
