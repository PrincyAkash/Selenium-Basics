package org.selenium.basics;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLunchFirefox {

	public static void main(String[] args) {
		 // TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		String titel = driver.getTitle();
		System.out.println("title" + titel);
		
		String currenturl = driver.getCurrentUrl();
		System.out.println("currenturl is"+ currenturl);
		
		String windowhandle = driver.getWindowHandle();
		System.out.println("windowhandle ID"+ windowhandle);
		
		String pagesource = driver.getPageSource();
		System.out.println("pagesource is"+ pagesource);
		
		driver.close();
		

	}
}


