package testng1;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test7 {

	WebDriver driver;

	@BeforeMethod
	public void BeforeMethod() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\anish\\OneDrive\\Desktop\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com");
	}

	@Test
	public void TestOne() {
		String actualTitle = driver.getTitle();
		String expectedTitle = "WebDriverUniversity.com";
		assertEquals(actualTitle, expectedTitle);

		WebElement contactUs = driver.findElement(By.cssSelector("#contact-us"));
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].removeAttribute('target')", contactUs);
		contactUs.click();
		actualTitle = driver.getTitle();
		assertNotEquals(actualTitle, expectedTitle);

	}

	@Test
	public void TestTwo() {
		String currentUrl = driver.getCurrentUrl();
		boolean URL = currentUrl.contains("university");
		assertTrue(URL);
		// google
		driver.get("https://www.google.com");
		URL = driver.getCurrentUrl().contains("university");
		assertFalse(URL);

	}

	@AfterMethod
	public void AfterMethod() {
		driver.close();
	}

}
