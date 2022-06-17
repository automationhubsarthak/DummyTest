package testbase;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import report_generation.ExtentManager;

public class TestBase {

	public ExtentReports rep;
	public ExtentTest test;
	public SoftAssert SoftAssert;

	@BeforeMethod(alwaysRun = true)
	public void init(ITestResult result) {
		System.out.println(result.getMethod().getMethodName().toUpperCase());
		rep = ExtentManager.getReports();
		test = rep.createTest(result.getMethod().getMethodName().toUpperCase());
		//result.setAttribute("Car", "BMW");
		result.setAttribute("reporter", test);
        SoftAssert = new SoftAssert();
	}

	@AfterMethod(alwaysRun = true)
	public void exiting() {
		rep.flush();
	}

	public void log(String msg) {
		System.out.println(msg);
		test.log(Status.INFO, msg);
	}
	
	public void failAndStopTest(String msg) {
		log(msg);
		failAndContinueTest(msg);
		SoftAssert.assertAll();
	}
	
public void failAndContinueTest(String msg) {
	log(msg);
	SoftAssert.fail(msg);
		
	}

}
