package com.qa.testcases;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.testbase.TestBase;
import com.qa.util.TestUtil;


public class LoginPageTest extends TestBase{

	
	TestUtil testUtil;
	LoginPage loginPage;
	HomePage homePage;
	String sheetName = "LoginDetails";
	public static String expectedTitle = "";
	public static Assert assertion;
	
	public LoginPageTest(){
		super();
	}
	
	
	@BeforeMethod
	public void Setup(){
		initialize();
		loginPage = new LoginPage();
		testUtil = new TestUtil();
		homePage = new HomePage();
	}
	
	@DataProvider
	public Object[][] getNewToursTestData(){
		Object data[][] = TestUtil.getTestData(sheetName);
		return data;
	}
	
	
	@Test(priority=1, dataProvider="getNewToursTestData")
	public void validateLogincredentials(String username, String password){
		loginPage.Login(username, password);
		String actualTitle = driver.getTitle();
		expectedTitle = "Find a Flight: Mercury Tours:";
		assertion.assertEquals(expectedTitle, actualTitle, "Test Fail");
	}
	
	
	@AfterMethod
	public void TearDown(){
		driver.close();
	}
	
}
