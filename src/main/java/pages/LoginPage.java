package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private WebDriver driver;
	
	
	private By usernametextbox = By.id("username");
	private By passwordtextbox = By.id("password");
	private By submitbutton = By.id("submit");            // xpath = //button[text()='Submit']
	

	public LoginPage(WebDriver driver) {
		//whenever an object is created for the class always by default constructor is called
		this.driver= driver;
	}
	
	public void enterUsername(String UserName) {
		driver.findElement(usernametextbox).sendKeys(UserName);
	}
	
	public void enterPassword(String Password) {
		driver.findElement(passwordtextbox).sendKeys(Password);
	}
	
	public void clickSubmit() {
		driver.findElement(submitbutton).click();
	}
}
