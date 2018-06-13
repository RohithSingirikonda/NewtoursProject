package com.qa.testcases;

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
	
	String FlightBookingSheet="FlightBookingData";
	
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
	
	
	@Test(dataProvider="FlightBookingDetails")
	public void ValidateFlightSelectionTest(String Passengers, String Source, String FromMonth, String FromDay, 
			String Destination, String ToMonth, String ToDay, String Airlines){	
		
		homePage = loginPage.Login(prop.getProperty("uname"), prop.getProperty("pass"));

		homePage.ValidateFlightSelection(Passengers, Source, FromMonth, FromDay, Destination, ToMonth, ToDay, Airlines);	
	}
	
	
	
	
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	
	
	

}
