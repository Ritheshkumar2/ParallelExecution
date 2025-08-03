package base;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RandomAlertHandler {
	
	public WebDriver driver;
	
	public RandomAlertHandler(WebDriver driver) {
		this.driver=driver;
		}
	public void randomalert() {
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Index.html");
		
		
		//skip SIgn in
		driver.findElement(By.cssSelector("#btn2")).click();
		
		String Title=driver.getTitle();
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(2000));
		wait.until(ExpectedConditions.titleIs(Title));
		
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//*[contains(text(),'SwitchTo')]"))).build().perform();
		
		//action.moveToElement(driver.findElement(By.xpath("(//*[contains(text(),'Alerts')])[2]"))).click();
		driver.findElement(By.xpath("//a[contains(text(),'Alerts')]")).click();
		// Click a button that might trigger an alert randomly
        driver.findElement(By.xpath("//*[@class='btn btn-danger']")).click();
        
		for(int i=0;i<10;i++) {
			try {
				Alert alert=driver.switchTo().alert();
				System.out.println("Alert found: " + alert.getText());
                alert.accept();
                System.out.println("Alert accepted.");
                break; // exit if alert is handled

			}catch(NoAlertPresentException noe) {
				noe.printStackTrace();
			}
		}
		
		
	
	}
	
	

}
