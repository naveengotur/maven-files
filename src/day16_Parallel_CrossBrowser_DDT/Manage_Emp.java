
package day16_Parallel_CrossBrowser_DDT;

import org.testng.annotations.Test;

public class Manage_Emp {

	@Test
	public void createEmp() {
	
		System.out.println("Thread id and Name "+Thread.currentThread().getId()+" "+Thread.currentThread().getName());
		System.out.println("Employee Created");
	}
	
	@Test
	public void Update()
	{
		System.out.println("Thread id and Name "+Thread.currentThread().getId()+" "+Thread.currentThread().getName());
		System.out.println("Employee Deleted");
	}
}
