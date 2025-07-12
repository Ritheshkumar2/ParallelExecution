package pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;

public class TestClass {
	
	WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		
		BaseClass base=new BaseClass();
		driver=base.getDriver("chrome");
		
	}
	
	@Test
	public void logintest() {
		LoginPage login=new LoginPage(driver);
		login.login("Admin", "admin123");
		
	}
	
	@AfterTest
	public void teardown() {
		driver.quit();
		
	}

}
