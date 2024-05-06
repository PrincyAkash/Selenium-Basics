package org.selenium.commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShopeRegi {
	
	public static void Registration() {
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/register");
		driver.manage().window().maximize();	
		
		WebElement firstname = driver.findElement(By.id("FirstName"));
		firstname.sendKeys("Princy");
		
		WebElement lastname =driver.findElement(By.id("LastName"));
		lastname.sendKeys("M");
		
		WebElement email = driver.findElement(By.id("Email"));
		email.sendKeys("tester4manual140@gmail.com");
		
		WebElement password = driver.findElement(By.id("Password"));
		password.sendKeys("Tester@140");
		
		WebElement confirmpassword = driver.findElement(By.id("ConfirmPassword"));
		confirmpassword.sendKeys("Tester@140");
		
		WebElement registerButton = driver.findElement(By.id("register-button"));
		registerButton.click();
		}
	

public static void main(String[] args) {
	
	
	 Registration();
	
}
}
	
		
	
	
		
		
		
	
	


