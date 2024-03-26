package day16_Parallel_CrossBrowser_DDT;

import org.testng.annotations.Test;

public class LoginApp 
{

	@Test (priority=1)
	public void login() {
		System.out.println("Thread id and Name "+Thread.currentThread().getId()+" "+Thread.currentThread().getName());
		System.out.println("Login to Application");
	}
	
	@Test (priority=2)
	public void logout() {
		System.out.println("Thread id and Name "+Thread.currentThread().getId()+" "+Thread.currentThread().getName());
		System.out.println("Log-out to Application");
	}
	
}
