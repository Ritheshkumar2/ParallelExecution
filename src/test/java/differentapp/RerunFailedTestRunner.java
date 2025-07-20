package differentapp;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.annotations.Test;

public class RerunFailedTestRunner {
	
	@Test
	public void rerunfailedtestcases() {
		
		TestNG testng=new TestNG();
		
		List<String> suites=new ArrayList<>();
		suites.add("test-output/testng-failed.xml");
		
		testng.setTestSuites(suites);
		
		testng.run();
		
		
	}

}
