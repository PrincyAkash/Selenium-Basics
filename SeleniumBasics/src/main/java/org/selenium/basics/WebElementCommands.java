package org.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommands {

	public void Commands() {
		
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("standard_user");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		
		WebElement loginButton = driver.findElement(By.id("login-button"));
		loginButton.click();
		
	}
	
	
	public void MethodNameValidateDemoWebshopLogin()
	
	{
		
		
	WebDriver driver =new ChromeDriver();
    driver.get("https://demowebshop.tricentis.com/");
    driver.manage().window().maximize();
	
	
	WebElement userName = driver.findElement(By.id("Email"));
	userName.sendKeys("tester4manual140@gmail.com");
	
	WebElement password = driver.findElement(By.id("Password"));
	password.sendKeys("Tester@140");
	
	WebElement loginButton = driver.findElement(By.id("button-1 login-button"));
	loginButton .click();
	}
	
	public static void main(String[] args) {
		
		WebElementCommands web1 = new WebElementCommands();
		web1.Commands();
		
		WebElementCommands  web2 = new WebElementCommands();
		web2.MethodNameValidateDemoWebshopLogin();
	}

}
