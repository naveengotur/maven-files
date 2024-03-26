package day15_TestNG_Part2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertionDemo
{

	@Test
	public void test1()
	{
		Assert.assertEquals(true, false);
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(true, false);
	}
	
	@Test
	public void test3()
	{
		Assert.assertEquals(true, false /* "Assertion failed-title is not verified" */);
	}
	
	@Test
	
	public void test4()
	{
		String excepted = "Username cannot be empty";
		
		//Assert.assertEquals(excepted.contains("empty"), true, "Error Message didnot match");
		
		Assert.assertEquals(excepted.contains("empty"), "Error Message didnot match");
	}
	
	
	
	@Test
	public void test5()
	{
		String excepted = "Username cannot be Blank";
		//Assert.assertEquals(excepted.contains("empty"), true, "Error Message didnot match");
		Assert.assertEquals(excepted.contains("empty"), "Error Message didnot match");	
	}
	
	@Test
	public void test6()
	{
		Assert.assertEquals(12, 15, "List count doesnot match");
	//	Assert.assertEquals(12==15, "List count doesnot match");
	}
	
	@Test
	public void test7()
	{
		Assert.assertNull(null);
	}
	
	@Test
	public void test8()
	{
		Assert.assertNotNull(null);
	}
	
	@Test
	public void test9()
	{
		Assert.fail();
	}
	
	@Test

	public void test10()
	{
		String name="Rashmi Bangalore";
		if(name.contains("Delhi"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}
}
