package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

@Test
public class RunnerClass {

	WebDriver driver;
	
	public void test() {
		RandomAlertHandler object=new RandomAlertHandler(driver);
		object.randomalert();
	}
}
