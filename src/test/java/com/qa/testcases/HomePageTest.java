package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.util.TestUtil;

public class HomePageTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	
	String FlightBookingSheet="FlightBooking";
	
	public HomePageTest(){
		super();
	}
	
	
	@BeforeMethod
	public void setUp(){
		initialize();
		loginPage =  new LoginPage();
	}
	
	
	@DataProvider(name = "FlightBookingDetails")
	public Object[][] getNewToursTestData(){
		Object data[][] = TestUtil.getTestData(FlightBookingSheet);
		return data;
	}
	
	
	@Test(priority=3, dataProvider="FlightBookingDetails")
	public void ValidateFlightSelectionTest(String username, String password){
		homePage = loginPage.Login(prop.getProperty("username"), prop.getProperty("password"));
		
		
		
	}
	
	
	
	
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	
	
	

}
