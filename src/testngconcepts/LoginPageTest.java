package testngconcepts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest {
	@BeforeMethod
	public void initilization()
	{
		System.out.println("browser instance created");
	}
	@Test
	public void loginTest() {
		
		System.out.println("we are performing login");
	}
	@Test
	public void logoTest() {
		
		System.out.println("we are validating logo");
		
	}
	@AfterMethod
	public void tearDown() {
		
		System.out.println("browser instance closed");
	}
	

}
