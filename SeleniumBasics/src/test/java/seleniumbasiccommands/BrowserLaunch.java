package seleniumbasiccommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BrowserLaunch {
	//method to intialisebrowser
	WebDriver driver;
	

	public void intialisebrowser( String browser ) {
		// TODO Auto-generated method stub
		
     if(browser.equals("Chrome"))
     {
     driver =new ChromeDriver();
     }
     else if (browser.equals("edge"))
     {
     driver = new EdgeDriver();
     }
     else if (browser.equals("Firefox"))
     {
     driver = new FirefoxDriver();
     }
     else {
      throw new RuntimeException("Invalid browser recevied");
     }
     
     driver.manage().window().maximize();    
     }
@BeforeMethod//first
public void setup()
{
	intialisebrowser("Chrome");
}


@AfterMethod
public void closebrowser()
{
	driver.close();
}
}
