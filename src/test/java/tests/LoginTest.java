package tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import utils.ExcelUtils;
import utils.ExtentReportManager;
import utils.Log;
public class LoginTest extends BaseTest{

	//using excel
	@DataProvider(name ="LoginData")
	public Object[][] getLoginData() throws IOException {
		
		String filepath = System.getProperty("user.dir")+"/testdata/TestData.xlsx";
		ExcelUtils.loadExcel(filepath, "Sheet1");
		int rowCount = ExcelUtils.getRowCount();
		Object[][] data = new Object[rowCount-1][2];
		for(int i=1; i<rowCount; i++) {
			data[i-1][0] = ExcelUtils.getCellData(i, 0);       //username
			data[i-1][1] = ExcelUtils.getCellData(i, 1);       //password
		}
		ExcelUtils.closeExcel();
		return data;
	}
	
	//using method
	@DataProvider(name = "LoginData1")
	public Object[][] getTestData(){
		return new Object[][] {
			{"user1", "pass1"},
			{"student", "Password123"}
		};
	}
	
	
	@Test(dataProvider = "LoginData1")
	public void testLoginWithValidCredentials(String username, String password) {
		LoginPage loginpage =new LoginPage(driver);
		Log.info("Adding credentials");
		test = ExtentReportManager.createTest("Login Test " + username);
		//loginpage.enterUsername("student");
		//loginpage.enterPassword("Password123");
		loginpage.enterUsername(username);
		loginpage.enterPassword(password);
		loginpage.clickSubmit();
		Log.info("Verifying title.....");
		test.info("Verified");
		System.out.println("Title " + driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "Logged In Successfully | Practice Test Automation");
		test.pass("Login Successeful");
	}
	
}