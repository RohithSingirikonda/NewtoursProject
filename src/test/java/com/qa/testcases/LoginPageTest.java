package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.CarRentalsPage;
import com.qa.pages.ContactPage;
import com.qa.pages.CruisesPage;
import com.qa.pages.DestinationsPage;
import com.qa.pages.FlightsPage;
import com.qa.pages.HomePage;
import com.qa.pages.HotelsPage;
import com.qa.pages.LoginPage;
import com.qa.pages.RegistrationPage;
import com.qa.pages.SupportPage;
import com.qa.pages.VacationsPage;
import com.qa.util.TestUtil;


public class LoginPageTest extends TestBase {

	
	TestUtil testUtil;
	LoginPage loginPage;
	HomePage homePage;
	RegistrationPage registrationPage; 
	SupportPage supportPage;
	ContactPage contactPage;
	FlightsPage flightsPage;
	HotelsPage hotesPage;
	CarRentalsPage carRentalsPage;
	CruisesPage cruisesPage;
	DestinationsPage destinationsPage;
	VacationsPage vacationsPage;
	
	String loginSheetName = "LoginDetails";
	public static String expectedTitle = "";
	
	public LoginPageTest(){
		super();
	}
	
	
	@BeforeMethod
	public void Setup(){
		initialize();
		loginPage = new LoginPage();
		testUtil = new TestUtil();
	}
	
	
	
	@Test(priority=1, enabled=true)
	public void validateLoginPageTitleTest(){
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "Welcome: Mercury Tours");
	}
	
	
	@Test(priority=2, enabled=false)
	public void validateNewToursLogoTest(){
		boolean flag = loginPage.validateNewToursLogo();
		Assert.assertTrue(flag);
	}
	
	
	@DataProvider(name = "LoginTestDetails")
	public Object[][] getNewToursTestData(){
		Object data[][] = TestUtil.getTestData(loginSheetName);
		return data;
	}
	
	
	@Test(priority=3, dataProvider="LoginTestDetails")
	public void validateLogincredentials(String username, String password){
		loginPage.Login(username, password);
		String actualTitle = driver.getTitle();
		expectedTitle = "Find a Flight: Mercury Tours:";
		Assert.assertEquals(actualTitle,expectedTitle, "Test Fail");
		
	}
	
	
	@Test(priority=4)
	public void validateRegistrationPageLink(){
		registrationPage = loginPage.RegistrationPageLink();	
	}
	
	
	@Test(priority=5)
	public void validateSupportPageLink(){
		supportPage = loginPage.SupportPageLink();	
	}
	
	@Test(priority=6)
	public void validateLoginPageLink(){
		loginPage = loginPage.LoginPageLink();
	}
	
	
	@Test(priority=7)
	public void validateFlightsPageLink(){
		flightsPage = loginPage.FlightsPageLink();
	}
	
	@Test(priority=8)
	public void validateHotelsPageLink(){
		hotesPage = loginPage.HotelsPageLink();
	}
	
	@Test(priority=9)
	public void validateCarRentalsPageLink(){
		carRentalsPage = loginPage.carRentalsPageLink();
	}
	
	
	@Test(priority=10)
	public void validateCruisesPageLink(){
		cruisesPage = loginPage.CruisesPageLink();
	}
	
	@Test(priority=11)
	public void validateDestinationPageLink(){
		destinationsPage = loginPage.DestinationsPageLink();
	}
	
	@Test(priority=12)
	public void validateVacationsPageLink(){
		vacationsPage = loginPage.VacationsPageLink();
	}
	
	
	
	@AfterMethod
	public void TearDown(){
		driver.close();
	}
	
}
