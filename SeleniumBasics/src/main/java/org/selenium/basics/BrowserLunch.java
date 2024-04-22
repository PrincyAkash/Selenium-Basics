package org.selenium.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BrowserLunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.seleniumeasy.com/");
		
		driver.manage().window().maximize();
		
		String tittle = driver.getTitle();
		System.out.println("tittle"+ tittle);
		
		String currenturl = driver.getCurrentUrl();
		System.out.println("currenturl is"+ currenturl);
		
		String windowhandle = driver.getWindowHandle();
		System.out.println("Windowhandle ID"+ windowhandle);
		
		String pagesource = driver.getPageSource();
		System.out.println("Pagesource  is "+ pagesource);
		
		driver.close();
		
	
		

	}

}
