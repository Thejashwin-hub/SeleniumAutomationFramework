package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicScript {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login");
		WebElement Name= driver.findElement(By.id("Email"));
		Name.clear();
		Name.sendKeys("admin@yourstore.com");
		
		//driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
		WebElement Password= driver.findElement(By.id("Password"));
		Password.clear();
		Password.sendKeys("admin");
		
		WebElement Login= driver.findElement(By.xpath("//button[text()='Log in']"));
		System.out.println(Login.getText());
		Login.click();
		
		driver.close();
	}

}
