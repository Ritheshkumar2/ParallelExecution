package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseClassThreadSafe {
	
	//Thread-safe WebDriver setup -->get and set methods we need to use..
	public static ThreadLocal<WebDriver> driver=new ThreadLocal<>();
	
	public WebDriver getdriver(String browser) {
		if (browser.equalsIgnoreCase("edge")) {
            driver.set(new EdgeDriver());
        } else if (browser.equalsIgnoreCase("chrome")) {
            driver.set(new ChromeDriver());
        }
        driver.get().manage().window().maximize();
		return driver.get();
	}

}
