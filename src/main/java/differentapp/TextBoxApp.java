package differentapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;


public class TextBoxApp {
	 
	WebDriver driver;
	public TextBoxApp(WebDriver driver) {
		this.driver=driver;
	}

	public boolean testBox() {
		
		 try {
		        WebElement textBtn = driver.findElement(By.xpath("//*[contains(text(),'Text Box')]"));
		        textBtn.click();
		        Assert.assertTrue(false);
		        return true;
		    } catch (Exception e) {
		        return false;
		    }
	}
}
