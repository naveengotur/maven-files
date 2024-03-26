package day16_Parallel_CrossBrowser_DDT;

import org.testng.annotations.Test;

public class User 
{
	@Test
	public void createUser()
	{
		System.out.println("Thread id and Name "+Thread.currentThread().getId()+" "+Thread.currentThread().getName());
		System.out.println("User Created");
	}
	
	@Test
	public void updateUser()
	{
		System.out.println("Thread id and Name "+Thread.currentThread().getId()+" "+Thread.currentThread().getName());
		System.out.println("User Updated");
	}
	
	@Test
	public void deleteUser()
	{
		System.out.println("Thread id and Name "+Thread.currentThread().getId()+" "+Thread.currentThread().getName());
		System.out.println("User deleted");
	}
	
}
