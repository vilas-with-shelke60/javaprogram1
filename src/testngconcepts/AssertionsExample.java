package testngconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AssertionsExample {
    WebDriver driver;
	@BeforeClass
	void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\chrome.driver\\112 version chrome\\chromedriver.exe");
		driver=new ChromeDriver();//launch the chrome browser
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");//open URL
	}
	@Test(priority = 1)
	void logoTest() {
		WebElement logo=driver.findElement(By.xpath("//img[@alt='company-branding']"));
		
		Assert.assertTrue(logo.isDisplayed(),"Logo not displayed on the page");//logo present represent true/or/if logo not present represent false
		
		
	}
	@Test(priority = 2)
	void homepageTitle() {
		
		String title=driver.getTitle();
		Assert.assertEquals("OrangeHRM",title,"Title is not matched");
	}
	@Test
	void teardown() {
		//driver.close();
	}
	
	     //working//
}
