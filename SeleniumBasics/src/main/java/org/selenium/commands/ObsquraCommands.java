package org.selenium.commands;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;


public class ObsquraCommands {

	

public static void verifyValuesFromDropdown() {
	WebDriver driver = new ChromeDriver();
	driver.get("https://selenium.qabible.in/");
	driver.manage().window().maximize();
	
	WebElement CountyDropdown =driver.findElement(By.xpath("//a[@class='nav-link'and@href='simple-form-demo.php"));
	CountyDropdown.click();
	
	WebElement CountyDropdown1 =driver.findElement(By.xpath("//a[@href='select-input.php']"));
	CountyDropdown1.click();
	
	WebElement CountyDropdown2 =driver.findElement(By.xpath("//select[@class='form-control'and@id='single-input-field']"));
	CountyDropdown2.click();
	
	    //select.selectByVisibleText("Red");
		//select.selectByIndex(1);
		//select.selectByValue("Yellow");
	
	WebElement getcolorname = select.getFirstSelectedOption();
	List<WebElement>obj =select.getOptions();
	for(int i=0; i<obj.size();i++) {
		System.out.println (obj.get(i).getText());
	}
}
	
public static void main(String[] args) {
	
	verifyValuesFromDropdown();
}
}

