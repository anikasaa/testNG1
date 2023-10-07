package testng1;

import org.testng.annotations.Test;

public class Day11e {
	
	@Test(priority = 1)
	public void TestThree() {
		System.out.println("Test cae three pass");
	}
	
	@Test(priority = 2)
	public void TestFour() {
		System.out.println("Test case four pass");
	}
	
	@Test(priority = 3)
	public void TestFive() {
		System.out.println("Test case five pass");
	}

}
