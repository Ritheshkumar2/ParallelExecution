package differentapp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginInToApp {
	
	WebDriver driver;
	public LoginInToApp(WebDriver driver) {
		this.driver=driver;
	}
	
	public boolean loginPage() throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)","");
		WebElement clickBtn=driver.findElement(By.xpath("(//*[contains(text(),'Elements')])[2]"));
		clickBtn.click();
		return true;
		
	}

}
