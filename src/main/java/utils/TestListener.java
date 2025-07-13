package utils;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentTest;

import report.ExtentManager;

public class TestListener implements ITestListener{
	
	  @Override
	    public void onTestStart(ITestResult result) {
	        ExtentTest test = ExtentManager.createInstance().createTest(result.getMethod().getMethodName());
	        ExtentManager.setTest(test);
	    }

	    @Override
	    public void onTestSuccess(ITestResult result) {
	        ExtentManager.getTest().pass("Test passed");
	    }

	    @Override
	    public void onTestFailure(ITestResult result) {
	        ExtentManager.getTest().fail(result.getThrowable());
	    }

	    @Override
	    public void onFinish(ITestContext context) {
	        ExtentManager.flush();
	    }

}
