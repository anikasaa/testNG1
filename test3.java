package testng1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test3 {
	
WebDriver driver;
	
	@BeforeMethod
	public void openBrowser() {
		driver = new ChromeDriver();
		driver.get("https://www.webdriveruniversity.com/index.html");
	}
	
	
	@Test
	public void test1() {
		String actualTitle = driver.getTitle();
		String expectedTitle = "WebDriverUniversity.com";
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@Test
	public void test2() {
		String actualURL = driver.getCurrentUrl();
		boolean expectedURL = actualURL.contains("webdriveruniversity");
		Assert.assertEquals(expectedURL, true);
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}

	
	

}
