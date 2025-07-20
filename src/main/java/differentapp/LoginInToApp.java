package differentapp;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import report.TakeSS;

public class LoginInToApp {
	
	WebDriver driver;
	public LoginInToApp(WebDriver driver) {
		this.driver=driver;
	}
	
	public boolean loginPage() throws InterruptedException, IOException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)","");
		Thread.sleep(2000);
		TakeSS.takess(driver,"homepage");
		WebElement clickBtn=driver.findElement(By.xpath("(//*[contains(text(),'Elements')])[2]"));
		clickBtn.click();
		return true;
		
	}

}
