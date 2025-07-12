package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseClass {
	
	public WebDriver driver;
	public WebDriver getDriver(String browser) {
		
		if(driver ==null) {
			if(browser.equals("edge")) {
			driver=new EdgeDriver();
			driver.manage().window().maximize();
			}else if(browser.equalsIgnoreCase("chrome")) {
				driver=new ChromeDriver();
				driver.manage().window().maximize();
			}
		}
		return driver;
	}
}
