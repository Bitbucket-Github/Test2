import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ff {
	public static void main(String []args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\semacha\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");  
        
        // Instantiate a Firefox class.     
   WebDriver driver=new FirefoxDriver();  
     
      // Launch Website  
   driver.navigate().to("https://www.amazon.com"); 
	}

}
