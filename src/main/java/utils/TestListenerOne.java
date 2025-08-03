package utils;

import java.util.ArrayList;
import java.util.List;

import org.testng.ITest;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListenerOne implements ITestListener{
	
	List<String> arrlt=new ArrayList<>();
	
	public void onTestSuccess(ITestResult  result) {
		 result.getMethod().getMethodName();
	}
	
	public void onTestFailure(ITestResult result) {
		arrlt.add(result.getMethod().getMethodName());
	}
	
	public void onFinish(ITestContext context) {
		System.out.println("=== Failed Test Cases ===");
		for(String ss:arrlt) {
			arrlt.add(ss);
		}
	}

}
