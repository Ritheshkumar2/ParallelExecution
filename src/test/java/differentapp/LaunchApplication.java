package differentapp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LaunchApplication {
	//mvn -DsuiteXmlFile=test-output/testng-failed.xml test
	
//	TestNG testng = new TestNG();
//    testng.setTestSuites(Collections.singletonList("test-output/testng-failed.xml"));
//    testng.run();
    
    
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		driver=new EdgeDriver();
		driver.manage().window().maximize();
	}
	
	@Test(priority=1)
	public void test() throws InterruptedException {
		driver.get("https://demoqa.com/");
		
		LoginInToApp obj=new LoginInToApp(driver);
		obj.loginPage();

	}
//	@Test(priority=2)
//	public void testTwo() throws InterruptedException {
//		
//        driver.get("https://demoqa.com/");
//		
//		LoginInToApp obj=new LoginInToApp(driver);
//		obj.loginPage();
//		TextBoxApp obj1=new TextBoxApp(driver);
//		obj1.testBox();
//	}
	
	
	@Test(priority=2)
	public void test3() throws InterruptedException {
		System.out.print("test 3");
		Assert.assertTrue(false);

	}
	
	
	@Test(priority=3)
	public void test4() throws InterruptedException {
		System.out.print("test 4");
		Assert.assertTrue(false);


	}
	@Test(priority=4)
	public void test5() throws InterruptedException {
		System.out.print("test 5");
		Assert.assertTrue(false);

	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
