package day15_TestNG_Part2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AnnotationDemo
{

	@Test (dataProvider= "dp")
	public void  test1(Integer n, String s)
	{
	System.out.println(n);
	System.out.println(s);
	
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before Method Executed ");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After Method Executed");
	}
	/*
	@DataProvider
	public object[][]dp()	
	{
		System.out.println("Data Provider executed");
		
		return new object[][]
				{
			new object[] {1,'a'},
			new object[] {2,'b'},
				};
				}*/
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class executed");
	}
	
	@AfterClass
	public void afterClass() {
		
		System.out.println("After class executed");
	}
	
	@BeforeTest()
	public void beforeTest()
	{
		System.out.println("Before Test executed");
	}
	
	@AfterTest()
	public void afterTest()
	{
		System.out.println("After Test executed");
	}
	
	@BeforeSuite()
	public void beforeSuite()
	{
		System.out.println("Before Suite executed");
	}
	
	@AfterSuite()
	public void afterSuite()
	{
		System.out.println("After Suite executed");
	}
	
}
