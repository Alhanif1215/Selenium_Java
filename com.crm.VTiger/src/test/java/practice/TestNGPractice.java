package practice;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestNGPractice {

	@Ignore
	@Test(priority = 2)
	public void createUser()
	{
		System.out.println("User Created");
	}
	
	@Test(priority = 1, dependsOnMethods = {"deleteUser"})
	public void modifiedUser()
	{
		System.out.println("User Modified");
	}
	
	@Test(priority = 3, invocationCount =2)
	public void deleteUser()
	{
		System.out.println("User deleted");
	}
}