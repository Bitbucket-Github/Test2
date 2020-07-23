import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  // System Property for Chrome Driver   
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\semacha\\Downloads\\chromedriver_win32\\chromedriver.exe");  
          
             // Instantiate a ChromeDriver class.     
        WebDriver driver=new ChromeDriver();  
          
           // Launch Website  
        driver.navigate().to("https://www.flipkart.com");
        
        driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input")).sendKeys("Samsung Galaxy Mobiles");
        driver.findElement(By.className("vh79eN")).click();
       
        /*driver.findElement(By.name("field-keywords")).sendKeys("Samsung Mobiles");
        driver.findElement(By.className("nav-input")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/span/div/span/h1/div/div[2]/div/div/span/form/span/span/span/span")).click();
        driver.findElement(By.xpath("/html/body/div[3]/div/div/ul/li[2]/a")).click();
*/
	}

}
