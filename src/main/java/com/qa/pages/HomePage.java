package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.base.TestBase;

public class HomePage extends TestBase{
	
	
	public static Select select;

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
	
	@FindBy(name="findFlights")
	WebElement continueButton;
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void ValidateFlightSelection(String Passengers, String Source, String FromMonth, String FromDay, String Destination, 
			String ToMonth, String ToDay, String Airlines) {
		
		
		select=new Select(passengers);  select.selectByVisibleText(Passengers);
		select=new Select(source);	select.selectByVisibleText(Source);
		select=new Select(fromMonth);  select.selectByVisibleText(FromMonth);
		select=new Select(fromDay);	select.selectByVisibleText(FromDay);
		select=new Select(destination);  select.selectByVisibleText(Destination);
		select=new Select(toMonth);	select.selectByVisibleText(ToMonth);
		select=new Select(toDay);  select.selectByVisibleText(ToDay);
		select=new Select(airlines);	select.selectByVisibleText(Airlines);
		//continueButton.click();
		
	}
	
	
	
}
