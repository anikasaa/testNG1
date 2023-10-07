package testng1;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day11 {
	
	@Parameters({"broweser","username","password"})
	
	@Test
	public void TestCaseOne(String bw, String un, String pwd) {
		System.out.println("test case one pass");
		System.out.println(bw);
		System.out.println(un);
		System.out.println(pwd);
	}
	
	@Test
	public void TestCaseTwo() {
		System.out.println("test case two pass");
	}
	
	@Test
	public void TestCaseThree () {
		System.out.println("test case three pass");
	}

}
