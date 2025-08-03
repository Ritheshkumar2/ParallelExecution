package base;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class WindowsHandless {
	
	public WebDriver driver;
	public void test() {
		
		String parentWindow=driver.getWindowHandle();
		
		Set<String> childWindow=driver.getWindowHandles();
		
		Iterator<String> s=childWindow.iterator();
		
		while(s.hasNext()) {
			String childwindow=s.next();
			driver.switchTo().window(childwindow);
			
			 driver.switchTo().window(parentWindow);
		}
		
	}

}
