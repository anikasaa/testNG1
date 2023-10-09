package testng1;

import org.testng.annotations.Test;

public class test6 {
	
	@Test(groups= {"login"})
	public void testCase4() {
		System.out.println("Login test case 1");
	}
	@Test(groups= {"regression"})
	public void testCase5() {
		System.out.println("Regression test case");
	}
	@Test(groups= {"login"})
	public void testCase6() {
		System.out.println("Login test case 2");
	}
	
	

}
