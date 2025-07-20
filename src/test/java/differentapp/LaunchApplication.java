package differentapp;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LaunchApplication {
	
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		driver=new EdgeDriver();
		driver.manage().window().maximize();
	}
	
	@Test(priority=1)
	public void test() throws InterruptedException, IOException {
		driver.get("https://demoqa.com/");
		
		LoginInToApp obj=new LoginInToApp(driver);
		obj.loginPage();
	}
	@Test(priority=2)
	public void testTwo() throws InterruptedException, IOException {
		
        driver.get("https://demoqa.com/");
		
		LoginInToApp obj=new LoginInToApp(driver);
		obj.loginPage();
		TextBoxApp obj1=new TextBoxApp(driver);
		obj1.testBox();
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
