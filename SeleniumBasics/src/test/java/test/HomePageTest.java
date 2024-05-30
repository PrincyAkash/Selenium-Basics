package test;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import automationcore.Base;
import utilities.ExcelUtility;

public class HomePageTest extends Base {
	
	@Test
	
	public void verifyHomePageTitle() throws IOException {

		
		driver.get("https://demowebshop.tricentis.com");
		String actualtitle = driver.getTitle();
		System.out.println("The page title is"+actualtitle);
		String expectedtitle= ExcelUtility.readStringData(0, 0,"HomePage");
		Assert.assertEquals(actualtitle, expectedtitle, "Title is invalid");
	}
	
	@Test
public  void VerifycommunitypoolSelection() throws IOException {
		
		driver.get("https://demowebshop.tricentis.com/");
		List<WebElement>communitypoolelements=driver.findElements(By.xpath("//li[@class='answer']//input[@name='pollanswers-1']//following-sibling::label"));
		String data =ExcelUtility.readStringData(0, 1, null);
		for(int i=0; i<communitypoolelements.size();i++)
		{
			//System.out.println(communitypoolelements.get(i).getText());
			String pollElementText=communitypoolelements.get(i).getText();
			System.out.println( pollElementText);
			
			
			if(pollElementText.equals(data));{ // to check if two strings are equal using equals()
				communitypoolelements.get(i).click();// to click on that
				   // if i add break here then only excellent and good will be printed.
				   }	
		     }
			 WebElement elementselected = driver.findElement(By.xpath("//label[@for='pollanswers-2']"));
			   boolean iselementenabled = elementselected.isSelected();
			   System.out.println("Poor radio button is selected" + " " + iselementenabled);
			   Assert.assertTrue(iselementenabled, "Element is not selected");
	  }
	@Test
	public void verifyComnew() {

		driver.get("https://demowebshop.tricentis.com/");
		
		List<WebElement> communitypollelements = driver.findElements(
				By.xpath("//li[@class='answer']//input[@name='pollanswers-1']//following-sibling::label"));
		//String exceldata = ExcelUtility.readStringData(0, 1, "HomePage");
		for (int i = 0; i < communitypollelements.size(); i++) {
			System.out.println(communitypollelements.get(i).getText());
			String pollelementstext = communitypollelements.get(i).getText();
			if (pollelementstext.equals("Poor")) {
				communitypollelements.get(i).click();
			}
		}
		WebElement selectedradiobutton = driver.findElement(By.xpath("//input[@id='pollanswers-3']"));
		boolean test = selectedradiobutton.isSelected();
		System.out.println("Poor radio button is selected" + " " + test);
		Assert.assertTrue(test, "Poor radio button is not selected");
	}

  }
	

