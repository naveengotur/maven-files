package Day14;

import org.testng.annotations.Test;

public class FirstTestNGTest 
{

	@Test(description="This test will login to Application")
	public void test1() {
		
		System.out.println("Test1 is executed");
	}
	
	@Test (description="This test will add to cart")
	public void test2() {
		
		System.out.println("Test2 is executed");
	}
	
	@Test(description="This test will check payment method")
	public void test3() {
		
		System.out.println("Test3 is executed");
	}
}
