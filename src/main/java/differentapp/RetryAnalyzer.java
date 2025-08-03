
package differentapp;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer{
	    int count=0;
		final int maxRetryCount = 2;
		
		public boolean retry(ITestResult result) {
			
			while(count<maxRetryCount) {
				count++;
				return true;
			}
			return false;
	}

}
