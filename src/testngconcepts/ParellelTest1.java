package testngconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.Test;

public class ParellelTest1 {
	
	WebDriver driver;//becz we using this variable commonly across all the method
	
	
	@Test
	void logoTest() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\chrome.driver\\113 version chrome\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		WebElement logo=driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/img"));
		Assert.assertTrue(logo.isDisplayed());
		Thread.sleep(5000);
		
	}
	
	@Test
	void homePageTitle() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\chrome.driver\\113 version chrome\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		Assert.assertEquals(driver.getTitle(),"OrangeHRM");
		Thread.sleep(5000);
		
	}
	
	@AfterMethod
	void tearDown() {
		driver.quit();
		
	}
	
	

}
