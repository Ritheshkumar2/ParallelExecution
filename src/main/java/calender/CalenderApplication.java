package calender;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CalenderApplication extends DriverRelated{
	
	public WebDriver driver;
	
	public CalenderApplication(WebDriver driver) {
		this.driver=driver;
	}

	
	public void test() throws InterruptedException {
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://jqueryui.com/datepicker/");
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@class='demo-frame']")));
		
		driver.findElement(By.xpath("//*[@id='datepicker']")).click();
		
		int maxTries = 120; // ~10 years forward
		int tries = 0;
		
		String expectedMonth = "August";
		String expectedYear = "2025";
		
		String month=driver.findElement(By.cssSelector(".ui-datepicker-month")).getText();
		String year=driver.findElement(By.cssSelector(".ui-datepicker-year")).getText();
		
		while(!(month.equals(expectedMonth) && year.equals(expectedYear))) {
			driver.findElement(By.xpath("//*[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		
			month = driver.findElement(By.cssSelector(".ui-datepicker-month")).getText();
			year = driver.findElement(By.cssSelector(".ui-datepicker-year")).getText();

			    System.out.println("Month: " + month + ", Year: " + year);
			    
			    tries++;
			    if (tries > maxTries) {
			        System.out.println("Date not found after " + maxTries + " attempts");
			        break;
			    }
			
		}
		
		
		driver.findElement(By.xpath("//a[text()='9']")).click();		
	}
}
