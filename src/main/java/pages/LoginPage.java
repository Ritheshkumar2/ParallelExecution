package pages;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import report.TakeSS;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	 
    public void login(String username, String password) throws IOException, InterruptedException {
    	
    	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(2));
    	
        driver.get("https://opensource-demo.orangehrmlive.com/");
        Thread.sleep(2000);
        TakeSS.takess(driver,"homepage");
//        WebElement user= driver.findElement(By.xpath("//*[@name='username']"));
//        wait.until(ExpectedConditions.visibilityOf(user));
//        		user.sendKeys(username);
//        driver.findElement(By.xpath("//*[@name='password']")).sendKeys(password);
//        driver.findElement(By.cssSelector("button[type='submit']")).click();
        
    }

}
