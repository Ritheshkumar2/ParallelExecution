package pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import base.BaseClassThreadSafe;

public class TestClass2 {
	
	WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		
		BaseClassThreadSafe obj=new BaseClassThreadSafe();
		driver=obj.getdriver("edge");
		
	}
	
	@Test
	public void logintest() throws IOException, InterruptedException {
		LoginPage login=new LoginPage(driver);
		login.login("Admin", "admin123");
		
	}
	
	@AfterTest
	public void teardown() {
		driver.quit();
		
	}

}
