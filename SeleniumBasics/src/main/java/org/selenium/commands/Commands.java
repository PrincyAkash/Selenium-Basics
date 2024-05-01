package org.selenium.commands;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Commands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Verifycommunitypool();
		verifyValuesFromDropdown();
	}
	
public static void Verifycommunitypool() {
WebDriver driver =new ChromeDriver();
driver.get("https://demowebshop.tricentis.com/");
driver.manage().window().maximize();

   List<WebElement> communitypoolelements = driver.findElements(By.xpath("//label[starts-with(@for,'poll')]//parent::)"));
   for(int i =0; i<communitypoolelements.size();i++) {
   //System.out.println(communitypoolelements.get(i).getText());
   String pollElementText = (communitypoolelements.get(i).getText());
   if (pollElementText.equals("Good")) {
   communitypoolelements.get(i).click();
   driver.close();
    }
  
   }

  }
public static void verifyValuesFromDropdown() {
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.guru99.com/test/newtours/register.php");
	driver.manage().window().maximize();	
	WebElement CountyDropdown = driver.findElement(By.xpath("//select[@name='country']"));
	Select select =new Select(CountyDropdown);
	//select.selectByVisibleText("INDIA");
	//select.selectByIndex(7);
	//select.selectByValue("AGOLA");
	WebElement getCountyName = select.getFirstSelectedOption();
	
}
}

	


	
	
	
	
	
	
	
	
	
	
	


