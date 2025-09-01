package practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertionPrac {

	@Test
	public void strictLevelCampare()
	{
		String exp = "Raju";
		String act = "Raju";
		
		Assert.assertEquals(act, exp);
		Assert.assertTrue(act.equals(exp));
		System.out.println("Hard assertion strict level");
	}
	
	@Test
	public void containsLevelComapre()
	{
		String exp = "don";
		String act = "London";
		Assert.assertTrue(act.contains(exp));
		Assert.assertEquals(act.contains(exp), true);
		System.out.println("Hard Assertion contains level");
	}
}
