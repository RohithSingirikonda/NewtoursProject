package com.qa.testcases;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.LoginPage;
import com.qa.pages.RegistrationPage;
import com.qa.util.TestUtil;


public class RegistrationPageTest extends TestBase{
	
	TestUtil testUtil;
	RegistrationPage registrationPage;
	LoginPage loginPage;
	String regPageSheet = "RegistrationData";
	
	public RegistrationPageTest(){
		super();
	}
	
	
	@BeforeMethod
	public void setUp(){
		initialize();
		loginPage =  new LoginPage();
		registrationPage = new RegistrationPage();
		testUtil = new TestUtil();
	}
	
	
	@DataProvider(name = "RegTestDetails")
	public Object[][] getNewToursTestData(){
		Object data[][] = TestUtil.getTestData(regPageSheet);
		return data;
	}
	
	
	
	
	@Test(priority=1, dataProvider="RegTestDetails")
	public void validateLogincredentialsTest(String firstname, String lastname, String phone, String username, String address1, String address2, String city, String state, String postalcode, String country, String usname, String password, String confirmpassword){
		
		loginPage.RegistrationPageLink();
		
		registrationPage.RegisterUsers(firstname, lastname, phone, username, address1, address2, city, state, postalcode, country, usname, password, confirmpassword);		
	}
	


	
	@AfterMethod
	public void tearDown(){
		driver.close();
	}
	

}
