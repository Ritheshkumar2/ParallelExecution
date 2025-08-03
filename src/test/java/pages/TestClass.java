package pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
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
		//Assert.assertTrue(false);
		
	}
	
	@Test
	public void logintest() throws IOException, InterruptedException {
		LoginPage login=new LoginPage(driver);
		login.login("Admin", "admin123");
		
		
	}
	
	@Test
    public void loginTest() {
        Assert.assertTrue(false);
    }

    @Test
    public void dashboardTest() {
        Assert.assertTrue(false);
    }

    @Test
    public void logoutTest() {
        Assert.assertTrue(true);
    }
	@AfterTest
	public void teardown() {
		driver.quit();
		
	}

}
