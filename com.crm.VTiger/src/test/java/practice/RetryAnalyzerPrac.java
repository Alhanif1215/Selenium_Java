package practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryAnalyzerPrac {

	int i = 0;
	@Test(retryAnalyzer = genericUtility.RetryAnalyzerImplementation.class)
	public void demo() {
		i++;
		System.out.println("Hello");
		if(i<3) {
			Assert.fail();
		}
	}
}