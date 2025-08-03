package differentapp;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITestListenersrelated implements ITestListener{
	
	public WebDriver driver;
	
	private List<String> failedTests = new ArrayList<>();
	
	public void onTestStart(ITestResult result) {
	    System.out.println("▶️ [onTestStart] Test started: " + result.getMethod().getMethodName());
	}
	
	 public void onTestSuccess(ITestResult result) {
	        System.out.println("✅ [onTestSuccess] Test passed: " + result.getMethod().getMethodName());
	    }
	 
	 public void onTestFailure(ITestResult result,String ScreenShotName) {
	        System.out.println("❌ [onTestFailure] Test failed: " + result.getMethod().getMethodName());
	        String methodName = result.getMethod().getMethodName();
	        failedTests.add(methodName);  // Collect failed test name
	        System.out.println("❌ Failed: " + methodName);
	        TakesScreenshot ts=(TakesScreenshot)driver;
	        File src = ts.getScreenshotAs(OutputType.FILE);
	        File dest = new File("screenshots/"+ScreenShotName+".png");
	       // FileUtils.copyFile(src, dest);
	        
	    }
	 public void onFinish(ITestContext context) {
	        System.out.println("🔶 Total Failed Tests: " + failedTests.size());

	        for (int i = 0; i < failedTests.size(); i++) {
	            System.out.println((i + 1) + ". " + failedTests.get(i));
	        }
	 }
}
