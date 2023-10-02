package testng1;

import org.junit.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day4 {
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("this is before suite");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("this is after suite");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("this is before test");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("this is after test");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("this is before class");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("this is after class");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("this is before method");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("this is after method");
	}
	
	@Test
	public void test1() {
		System.out.println("this is test case 1");
	}
	
	@Test
	public void test2() {
		System.out.println("this is test case 2");
	}

}

