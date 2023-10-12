package testng1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day15BrokenLinks {
	
	 WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\anish\\OneDrive\\Desktop\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/");
		
		@Test
		public void findBrokenLinks() {
			List<WebElement> links = driver.findElements(By.tagName("en"));
			
		}
		
	}

	


}
