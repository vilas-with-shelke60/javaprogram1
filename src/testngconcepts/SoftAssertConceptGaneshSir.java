package testngconcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertConceptGaneshSir {
	
	WebDriver driver;
	SoftAssert softAssert;
	
	@BeforeMethod
	public void initialization()
	
	{    
		softAssert = new SoftAssert();
		System.setProperty("webdriver.chrome.driver","C:\\chrome.driver\\113 version chrome\\chromedriver.exe" );
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Test
	public void validateTitleAndLogoTest() {
		
		String title =driver.getTitle();
		softAssert.assertEquals(title,"OrangeHRM");
		//softAssert.assertEquals(title,"HRM");
		boolean logoStatus= driver.findElement(By.xpath("//h6[normalize-space()='Dashboard']")).isDisplayed();
		softAssert.assertEquals(logoStatus, true);
		softAssert.assertAll();
		
	}
	@Test
	public void demoTest() {
		
		//softAssert
		//softAssert
		//softAssert
		//softAssert.assertAll();
	}
	
	@AfterMethod
	public void tearDown() {
		
		driver.close();
	}
	
	
	  //WORKING//
	         
	

}
