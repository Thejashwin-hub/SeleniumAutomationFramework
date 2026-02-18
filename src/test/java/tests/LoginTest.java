package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class LoginTest extends BaseTest{

	@Test
	public void testValiLogin() {
		LoginPage loginpage =new LoginPage(driver);
		
		loginpage.enterUsername("student");
		loginpage.enterPassword("Password123");
		loginpage.clickSubmit();
		
		System.out.println("Title " + driver.getTitle());
	}
}
