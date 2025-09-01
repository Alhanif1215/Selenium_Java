package practice;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionPrac {

	@Test
	public void strictLevelSoftAssertionCampare()
	{
		String exp = "Selenium";
		String act = "Selenium";
		
		SoftAssert s = new SoftAssert();
		s.assertEquals(act, exp);
		s.assertTrue(act.equals(exp));
		System.out.println("Soft assertion strict level");
		s.assertAll();	}
	
	@Test
	public void containsLevelSoftAssertionComapre()
	{
		String exp = "ava";
		String act = "Java";
		
		SoftAssert s = new SoftAssert();
		s.assertTrue(act.contains(exp));
		s.assertEquals(act.contains(exp), true);
		System.out.println("Soft Assertion contains level");
		s.assertAll();
	}
}
