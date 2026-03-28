package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	private WebDriver driver;
	
	
	
	@FindBy(id="username")
	WebElement usernametextbox;
	
	@FindBy(id="password")
	WebElement passwordtextbox;
	
	@FindBy(xpath = "//button[text()='Submit']")
	WebElement submitbutton;
	//private By usernametextbox = By.id("username");
	//private By passwordtextbox = By.id("password");
	//private By submitbutton = By.id("submit");            // xpath = //button[text()='Submit']
	

	public LoginPage(WebDriver driver) {
		//whenever an object is created for the class always by default constructor is called
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterUsername(String UserName) {
	//	driver.findElement(usernametextbox).sendKeys(UserName);
		usernametextbox.sendKeys(UserName);
	}
	
	public void enterPassword(String Password) {
		passwordtextbox.sendKeys(Password);
		//driver.findElement(passwordtextbox).sendKeys(Password);
	}
	
	public void clickSubmit() {
		submitbutton.click();
		
		//driver.findElement(submitbutton).click();
	}
}
