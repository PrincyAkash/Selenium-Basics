package test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import automationcore.Base;
import utilities.ExcelUtility;

public class RegistrationPageTest extends Base {
	@Test
	public void verifyRegisterPageTitle() throws IOException {
		driver.get("https://demowebshop.tricentis.com/register");
		String actualtitle = driver.getTitle();
		System.out.println("title is"+actualtitle);
		String expectedtitle = ExcelUtility.readStringData(0, 0, "RegistrationPage");
		Assert.assertEquals(actualtitle, expectedtitle, "title invalid");
}
	@Test
	public void verifyUserRegistration() {
		
		driver.get("https://demowebshop.tricentis.com/register");
		driver.manage().window().maximize();
		WebElement firstName=driver.findElement(By.xpath("//input[@id='FirstName']"));
		firstName.sendKeys("Princy");
		WebElement lastname=driver.findElement(By.xpath("//input[@id='LastName']"));
		lastname.sendKeys("M");
		WebElement email=driver.findElement(By.xpath("//input[@id='Email']"));
		email.sendKeys("princym140@gmail.com");
		WebElement password=driver.findElement(By.xpath("//input[@id='Password']"));
		password.sendKeys("Princy@140");
		WebElement cpassword=driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
		cpassword.sendKeys("Princy@140");
		WebElement register=driver.findElement(By.xpath("//input[@id='register-button']"));
		register.click();
		WebElement continuebutton = driver.findElement(By.xpath("//input[@value='Continue']"));
		continuebutton.click();
		WebElement actualemailfield= driver.findElement(By.xpath("//a[@class='account'and text()='princym140@gmail.com']"));
		String actualemail = actualemailfield.getText();
		String Expectedemail = "princym140@gmail.com";
		Assert.assertEquals(actualemail, Expectedemail, "Login is not sucess");
	
	}
	
	
}
