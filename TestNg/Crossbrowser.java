package TestNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Crossbrowser {
	WebDriver driver;

	/**
	 * This function will execute before each Test tag in testng.xml
	 * @param browser
	 * @throws Exception
	 */
	@BeforeTest
	@Parameters("browser")
	public void setup(String browser) throws Exception{
		//Check if parameter passed from TestNG is 'firefox'
		if(browser.equalsIgnoreCase("chrome")){
			//set path to chromedriver.exe
			System.setProperty("webdriver.chrome.driver","C:\\Users\\semacha\\Downloads\\chromedriver_win32\\chromedriver.exe");
			//create chrome instance
			driver = new ChromeDriver();
		}
		//Check if parameter passed as 'Edge'
				else if(browser.equalsIgnoreCase("ie")){
					//set path to Edge.exe
					System.setProperty("webdriver.ie.driver","C:\\Users\\semacha\\Downloads\\IEDriverServer_x64_3.141.59\\IEDriverServer.exe");
					//create Edge instance
					 DesiredCapabilities capability = DesiredCapabilities.internetExplorer();
				      capability.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
				      capability.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
				     capability.setCapability(InternetExplorerDriver.INITIAL_BROWSER_URL, "https://www.amazon.com");
					driver = new InternetExplorerDriver(capability);
				}
		else{
			//If no browser passed throw exception
			throw new Exception("Browser is not correct");
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void testParameterWithXML() throws InterruptedException{
		driver.get("https://www.amazon.com/");
		//Find user name
		/*WebElement userName = driver.findElement(By.name("uid"));
		//Fill user name
		userName.sendKeys("guru99");
		//Find password
		WebElement password = driver.findElement(By.name("password"));
		//Fill password
		password.sendKeys("guru99");*/
	}
	
	@AfterTest
	public void close() {
		driver.close();
	}
}


