package report;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {
	
	public static ExtentReports extent;
	public static ThreadLocal<ExtentTest> extenttest=new ThreadLocal<>();
	
	public static ExtentReports createInstance() {
		
		if(extent == null) {
			ExtentSparkReporter  sparkReporter=new ExtentSparkReporter("test-output/extent");
			sparkReporter.config().setReportName("Automation Test Report");
            sparkReporter.config().setDocumentTitle("Selenium Test Results");
            
            extent=new ExtentReports();
            extent.attachReporter(sparkReporter);
		}
		return extent;
		
	}
	
	public static void setTest(ExtentTest test) {
		extenttest.set(test);
    }
	
	public static ExtentTest getTest() {
        return extenttest.get();
    }

	// Flush report data (usually in onFinish of listener)
    public static void flush() {
        if (extent != null) {
            extent.flush();
        }
    }
}
