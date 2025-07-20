package calender;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverRelated {
	
	public WebDriver driver;
	
	public WebDriver getDriver() {
		driver=new EdgeDriver();
		return driver;
		
	}

}
