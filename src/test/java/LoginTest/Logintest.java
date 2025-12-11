package LoginTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.basepackage.baseClass;

public class Logintest extends baseClass {
	@BeforeMethod
	public void setup() {
		setUp("chrome");
	}
	
	@AfterMethod
	public void close() {
		tearDown();
	}
	
	
	
		@Test
	    public void login() {
	        // setUp() already ran and driver is ready
	        driver.findElement(By.name("username")).sendKeys("Admin");
	        driver.findElement(By.name("password")).sendKeys("admin123");
	        driver.findElement(By.xpath("//button[@type='submit']")).click();
	        // tearDown() will run automatically after method
	    }
}
