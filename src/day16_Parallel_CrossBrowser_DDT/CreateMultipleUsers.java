package day16_Parallel_CrossBrowser_DDT;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class CreateMultipleUsers 
{

	@Test (dataProvider="userDP")
	public void createUser(String fname, String lname, String email)
	{
		System.out.println("User created with below details");
		System.out.println("****"+fname+" "+lname+" "+email+"****");
		
	}
	
	@DataProvider(name ="userDP")
	public Object[][] createTestData()
	{
		System.out.println("**** TestData is getting prepared ****");
		Object[][]arr = new Object[3][3];
		arr[0][0]="Mukesh";
		arr[0][1]="Otawani";
		arr[0][2]="mukesh@gmail.com";
		
		arr[1][0]="naveen";
		arr[1][1]="reddy";
		arr[1][2]="naveenreddy@gmail.com";
		
		arr[2][0]="Johnny";
		arr[2][1]="Walker";
		arr[2][2]="Johnnywalker@gmail.com";
		
		System.out.println("**** Test Data is ready for test ****");
		
		return arr;
		
	}
	
	
}
