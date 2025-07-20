package report;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;



public class TakeSS {
	
	public static boolean takess(WebDriver driver,String testName) throws IOException {
		 try {
	            String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
	            String folderPath = "test-output/screenshots/";
	            new File(folderPath).mkdirs();

	            File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	            File dest = new File(folderPath + testName + "_" + timeStamp + ".png");

	            FileUtils.copyFile(src, dest);
	        } catch (IOException e) {
	            System.out.println("Screenshot capture failed: " + e.getMessage());
	        }
	return true;
	}
}
