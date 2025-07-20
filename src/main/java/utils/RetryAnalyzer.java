package utils;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer{

	public int count=1;
	public static final int maxTry=2;
	@Override
	public boolean retry(ITestResult result) {
		while(count<maxTry) {
			System.out.println("Retrying test " + result.getName() + ", attempt: " + (count + 1));
			count++;
			return true;
		}
		return false;
	}

}

//Option A (individual test method):
//	@Test(retryAnalyzer = utils.RetryAnalyzer.class)
//	public void testMethod() {
//	    // your test logic
//	}

//Option B (globally with a listener):
//public class AnnotationTransformer implements IAnnotationTransformer