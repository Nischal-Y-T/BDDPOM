package testScripts;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;
import pages.HomePage;
import pages.LoginPage;

public class ContactTest extends TestBase{
	
	LoginPage loginpage;
	HomePage homePage;
	
	@BeforeTest
	public void setup() {
		initialize();
	}
	@Test(priority=1)
	public void validateuser() {
		loginpage = new LoginPage();
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		homePage = new HomePage();
		boolean isValidUser = homePage.isUserLoggedIn();
		Assert.assertTrue(isValidUser);
	}
	@Test(priority=2)
	public void createNewcontact() {
		homePage.contactPageTest();
	}
	@AfterTest
	public void tearDown() {
		
	}

}
