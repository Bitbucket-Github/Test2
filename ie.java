import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		  // System Property for Chrome Driver   
      System.setProperty("webdriver.ie.driver", "C:\\Users\\semacha\\Downloads\\IEDriverServer_x64_3.141.59\\IEDriverServer.exe");  
        
           // Instantiate a ChromeDriver class.     
      DesiredCapabilities capability = DesiredCapabilities.internetExplorer();
      capability.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
      capability.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
     capability.setCapability(InternetExplorerDriver.INITIAL_BROWSER_URL, "https://www.amazon.com");
      WebDriver driver=new InternetExplorerDriver(capability);  
        
         // Launch Website  
      //driver.navigate().to("https://www.amazon.com"); 
      Actions action = new Actions(driver);
      WebElement keys = driver.findElement(By.name("field-keywords"));
      action.moveToElement(keys).sendKeys("Samsung Mobiles");
      WebElement click = driver.findElement(By.className("nav-input"));
      action.moveToElement(click).click();
	}

}
