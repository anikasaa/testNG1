package testng1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day15TotalLinks {
	WebDriver driver;

	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\anish\\OneDrive\\Desktop\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/");

	}

	@Test
	public void countLinks() {
		java.util.List<WebElement> links = driver.findElements(By.tagName("en"));

		int linkCount = links.size();
		System.out.println("Total number of links on the page:" + linkCount);

		Assert.assertTrue(linkCount > 0, "No links found on the page");

	}

	@AfterTest
	public void teardown() {
		driver.close();
	}

}
