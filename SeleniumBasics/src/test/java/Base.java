import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.google.common.io.Files;

public class Base {
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
public void closeBrowser() {
}

public void takeScreenShort(ITestResult result)throws IOException{
	
	
	TakesScreenshot takescreenshot = (TakesScreenshot) driver ;
	File screenshot = takescreenshot.getScreenshotAs(OutputType.FILE); 
	Files.copy(screenshot, new File("./ScreenShot/" +result.getName()+ ".png" ));
	

{
	driver.close();
}
}
}


