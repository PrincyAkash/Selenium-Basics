package seleniumbasiccommands;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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

@Test
public void verifyRadioButtonIsSelected() {
	
	boolean isfemaleselected;
	driver.get("https://demowebshop.tricentis.com/register");
	
	WebElement femaleradiobutton =driver.findElement(By.xpath("//input[@id='gender-female']"));
	isfemaleselected = femaleradiobutton.isSelected();
	Assert.assertFalse(isfemaleselected,"Radio button is selected");
	System.out.println("Female element is selected"+"  "+isfemaleselected);
	femaleradiobutton.click();
	isfemaleselected = femaleradiobutton.isSelected();
	Assert.assertTrue(isfemaleselected,"Radio button is not selected");
	System.out.println("Female element after selected"+" "+isfemaleselected); 
	
   }
@Test
public void verifyButtonIsEnable() {
	boolean issubscribebuttonenable;
	driver.get("https://demowebshop.tricentis.com/");
	
	WebElement subscribebutton = driver.findElement(By.xpath("//input[@value ='Subscribe']"));
	issubscribebuttonenable = subscribebutton.isEnabled();
	Assert.assertTrue(issubscribebuttonenable,"Subscribe button is not enable");
	System.out.println("Subscribe button is not enable"+" "+issubscribebuttonenable); 
	
   }

@Test
public void verifyButtonIsDisplay() {
	
	boolean isvotebuttondisplayed;
	driver.get("https://demowebshop.tricentis.com/");
	
	WebElement votebutton = driver.findElement(By.xpath("//input[@value ='Vote']"));
	isvotebuttondisplayed = votebutton.isDisplayed();
	Assert.assertTrue(isvotebuttondisplayed,"Vote button is not enable");
	System.out.println("Vote button is not enable"+" "+isvotebuttondisplayed); 
	
   }

	@Test
	public void verifyRightClick() {
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement rightclickbutton =driver.findElement(By.xpath(null));
		Actions action =new Actions(driver);
		action.contextClick(rightclickbutton).build().perform();
	}

@Test
	public void verifyDoubleClick() {
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");	
		WebElement doubleclick =driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		Actions action =new Actions(driver);
		action.doubleClick(doubleclick).build().perform();
	
	}

@Test
   public void verifyDragAndDrop() { 
	
	   driver.get("https://demoqa.com/droppable");
	   WebElement dragelement = driver.findElement(By.xpath("//div[@id ='draggable']"));
	   WebElement dropelement = driver.findElement(By.xpath("//div[@id ='droppable']"));
	   Actions action =new Actions(driver);
	   action.dragAndDrop(dragelement, dropelement).build().perform();
	   }
@Test
  public void verifyDragAndDropOffset() {
	  
	  driver.get("https://demoqa.com/dragabble");
	  WebElement dragelement = driver.findElement(By.xpath("//div[@id ='dragBox']"));
	  Actions action =new Actions(driver);
	  action.dragAndDropBy(dragelement, 150, 150).build().perform();
	 
  }
@Test
  public void verifyMouseHover() {
	  driver.get("https://demoqa.com/menu/");
	  WebElement mainelement = driver.findElement(By.xpath("//a[text()='Main Item 2']"));
	  Actions action =new Actions(driver);
	  action.moveToElement(mainelement).build().perform();
	  WebElement subelement =driver.findElement(By.xpath("//a[text()='SUB SUB LIST »']"));
	  action.moveToElement(subelement).build().perform();
	  }
	}
	































