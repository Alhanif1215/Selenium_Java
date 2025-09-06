package genericUtility;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListenersImplementation implements ITestListener {

	JavaUtility jUtil = new JavaUtility();
	String dateTimeStamp = jUtil.getCalendarDetails("dd-MM-YYYY | hh-mm-ss");
	ExtentReports reports;
	
	
	@Override
	public void onTestStart(ITestResult result) {

		String methodName = result.getMethod().getMethodName();
		System.out.println(methodName + " Test Method Started");
		Reporter.log(methodName + " Test Method Started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {

		String methodName = result.getMethod().getMethodName();
		System.out.println(methodName + " Test Method Executed Successfully");
		Reporter.log(methodName + " Test Method Executed Successfully");
	}

	@Override
	public void onTestFailure(ITestResult result) {

		String methodName = result.getMethod().getMethodName();
		System.out.println(methodName + " Test Method Failed");
		Reporter.log(methodName + " Test Method Failed");
				
		String screenshotName = methodName+": "+dateTimeStamp;
		SeleniumUtility sUtil = new SeleniumUtility();
		try {
			sUtil.takeScreenshotOfWebPage(BaseClass.sDriver, screenshotName);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		String methodName = result.getMethod().getMethodName();
		System.out.println(methodName + " Test Method Skipped");
		Reporter.log(methodName + " Test Method Skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {

	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Suite Execution Started");
		
		ExtentSparkReporter reporter = new ExtentSparkReporter("./Extent Reports/report: "+dateTimeStamp+".html");
		reporter.config().setDocumentTitle("VTiger Execution Reports");
		reporter.config().setReportName("VTiger Report");
		reporter.config().setTheme(Theme.DARK);
		
		reports = new ExtentReports();
		reports.attachReporter(reporter);
		reports.setSystemInfo("Base URL", "https://localhost");
		reports.setSystemInfo("Base Platform", "Lubuntu Linux");
		reports.setSystemInfo("Base Browser", "Chrome");
		reports.setSystemInfo("Test Engineer", "Hanif Makakmayum");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Suite Execution Ended");
		reports.flush();
	}

}
