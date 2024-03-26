package day15_TestNG_Part2;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softAssertDemo 
{

	@Test()
	public void test1()
	{
		// SoftAssert
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(false, true);
		System.out.println("Execute even After Failure");
		softAssert.assertTrue(false);
		System.out.println("Execute Again even After Failure");
		softAssert.assertAll();
		
	}
	
	@Test
	public void test2()
	{
		// HardAssert
		Assert.assertEquals(false, true);
		System.out.println("Execute even after failure");
		Assert.assertTrue(false);
		System.out.println("Execute Again even After Failure");
	}
}
