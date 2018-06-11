package com.qa.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.LoginPage;
import com.qa.pages.RegistrationPage;
import com.qa.util.TestUtil;


public class RegistrationPageTest extends TestBase{
	
	RegistrationPage registrationPage;
	LoginPage loginPage;
	String regPageSheet = "RegistrationPage";
	
	public RegistrationPageTest(){
		super();
	}
	
	
	@BeforeMethod
	public void setUp(){
		initialize();
		loginPage =  new LoginPage();
	}
	
	
	@DataProvider
	public Object[][] getNewToursRegTestData(){
		Object data[][] = TestUtil.getTestData(regPageSheet);
		return data;
	}
	
	
	@Test(priority=1, dataProvider="getNewToursRegTestData")
	public void validateLogincredentialsTest(String firstname, String lastname, String Phone, String Email, String Address1, 
			String Address2,String City, String State, String PostalCode, String Country, 
			 String uname, String Password, String ConfirmPassword){
		
		loginPage.RegistrationPageLink();
		registrationPage.RegisterUsers(firstname, lastname, Phone, Email, Address1, Address2, City, State, PostalCode, Country,
				uname, Password, ConfirmPassword);
		
		
	}
	
	

	
	@AfterMethod
	public void tearDown(){
		//driver.close();
	}
	

}
