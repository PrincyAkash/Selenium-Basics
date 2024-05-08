package seleniumbasiccommands;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumCommands extends BrowserLaunch {
	
	@Test//second
	public void verifymultipledropdowns()
	{
		driver.get("https://selenium.qabible.in/select-input.php");
		
		WebElement multipleelements =driver.findElement(By.xpath("//select[@class ='form-control'and 'multi -selected -filed']"));
		Select select =new Select(multipleelements);
		select.selectByVisibleText("Red");
		select.deselectByVisibleText("Yellow");
		Boolean selectedvalue = select .isMultiple();
        System.out.println(selectedvalue);
        List<WebElement> selectedvalues =select.getAllSelectedOptions();
        for(WebElement e : selectedvalues)
        {
        System.out.println(e.getText());
        }
		select.deselectByValue("Red");
	}
@Test	
public void ValiddateDemoWebshopLogin()
	
	{
		
	driver.get("https://demowebshop.tricentis.com/");
    
    
    WebElement login = driver.findElement(By.className("ico-login"));
    login.click();
	
	
	WebElement userName = driver.findElement(By.id("Email"));
	userName.sendKeys("tester4manual140@gmail.com");
	
	WebElement password = driver.findElement(By.id("Password"));
	password.sendKeys("Tester@140");
	
	WebElement loginButton = driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
	loginButton .click();
	WebElement actualemailfiled =driver.findElement(By.xpath("//a[@class='account' and text()='tester4manual140@gmail.com']"));
   String actualresult =actualemailfiled.getText();
   String expectedresult ="tester4manual140@gmail.com";
   Assert.assertEquals(actualresult, expectedresult,"Login not sucess");
	} 


@Test
public void GuruCommands() {
	

	driver.get("https://demo.guru99.com/test/newtours/register.php");
	
	
	WebElement firstname = driver.findElement(By.xpath("//input[@name ='firstName']"));
	firstname.sendKeys("Princy");
	
	WebElement lastname =driver.findElement(By.xpath("//input[@name ='lastName']"));
	lastname.sendKeys("M");
	
	WebElement phone =driver.findElement(By.xpath("//input[@name ='phone']"));
	phone.sendKeys("9633437118");
	
	WebElement email =driver.findElement(By.xpath("//input[@name ='userName']"));
	email.sendKeys("Prinym140@gmail.com  ");
	
	WebElement address =driver.findElement(By.xpath("//input[@name='address1']"));
	address.sendKeys("Aswathy Bhavan  ");
	
	WebElement city =driver.findElement(By.xpath("//input[@name ='city']"));
	city.sendKeys("Venjarumoodu ");
	
	WebElement state =driver.findElement(By.xpath("//input[@name ='state']"));
	state.sendKeys("Kerala");
	
	WebElement CountryDropdown =driver.findElement(By.xpath("//select[@name='country']"));
	Select select =new Select(CountryDropdown);
	select.selectByVisibleText("INDIA");
	
	WebElement username =driver.findElement(By.xpath("//input[@name='email']"));
	username.sendKeys("Kerala");
	
	WebElement password =driver.findElement(By.xpath("//input[@name='password']"));
	password.sendKeys("Baby@140");
	
	WebElement confirmpassword =driver.findElement(By.xpath("//input[@name ='confirmPassword']"));
	confirmpassword.sendKeys("Baby@140");
	
	WebElement submit =driver.findElement(By.xpath("//input[@name ='submit']"));
	submit.click();
	
	WebElement actualusernamefiled =driver.findElement(By.xpath("//input[@name='email']"));
	   String actualresult =actualusernamefiled.getText();
	   String expectedresult ="Princy";
	   Assert.assertEquals(actualresult, expectedresult,"Username valid");
		

     }
@Test
public void RegisterPage()
{
	
	driver.get("https://demowebshop.tricentis.com/register");
	
	driver.manage().window().maximize();
	
	WebElement firstName=driver.findElement(By.xpath("//input[@id='FirstName']"));
	firstName.sendKeys("PRINCY");
	
	WebElement lastname=driver.findElement(By.xpath("//input[@id='LastName']"));
	lastname.sendKeys("M");
	
	WebElement email=driver.findElement(By.xpath("//input[@id='Email']"));
	email.sendKeys("tester4manual140@gmail.com");
	
	WebElement password=driver.findElement(By.xpath("//input[@id='Password']"));
	password.sendKeys("Tester@140");
	
	WebElement cpassword=driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
	cpassword.sendKeys("Tester@140");
	
	WebElement register=driver.findElement(By.xpath("//input[@id='register-button']"));
	register.click();
	
	WebElement auctualemailfield= driver.findElement(By.xpath("//div[@class='validation-summary-errors']"));
	String actualresult=auctualemailfield.getText();
	String expectedresult ="The specified email already exists";
	Assert.assertEquals(actualresult,expectedresult,"The specified email already exists");
}
}

	






























