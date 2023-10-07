package testng1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Day8HardAndSoftAssertion {

	// Hard Assertion and Soft Assertion

	WebDriver driver;

	@Test
	public void testcaseOne() {
		// hard Assertion

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\anish\\OneDrive\\Desktop\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com");

		// verify Title
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, "WebDriverUniversity.com");

		// verify URL
		boolean avail = driver.getCurrentUrl().contains("more");
		Assert.assertTrue(avail);

		// verify element displayed
		boolean avail2 = driver.findElement(By.cssSelector("#contact-us")).isDisplayed();
		Assert.assertTrue(avail2);
		driver.close();

	}

	@Test
	public void testcaseTwo() {
		// soft assertion
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\anish\\OneDrive\\Desktop\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com");

		SoftAssert ss = new SoftAssert();

		// verify Title
		String actualtitle = driver.getTitle();
		ss.assertEquals(actualtitle, "WebDriverUniversity.com");

		// verify URL

		boolean avail = driver.getCurrentUrl().contains("more");
		ss.assertTrue(avail);

		// verify element displayed
		boolean avail2 = driver.findElement(By.cssSelector("#contact-us")).isDisplayed();

		driver.close();

		ss.assertAll();

		// fail---any assertion is fail
		// pass---if any assertion in pass

	}

}
                    