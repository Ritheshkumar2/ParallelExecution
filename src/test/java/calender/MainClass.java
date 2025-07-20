package calender;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

@Test
public class MainClass extends DriverRelated{
	
	public void testone() throws InterruptedException {
		WebDriver driver = getDriver();
		CalenderApplication obj=new CalenderApplication(driver);
		obj.test();
		
		driver.close();
	}

}
