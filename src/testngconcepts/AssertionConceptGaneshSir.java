package testngconcepts;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AssertionConceptGaneshSir {
	
	WebDriver driver;
    Properties prop;
	
	@BeforeMethod
	public void initialiation() throws IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\Hp\\eclipse-workspace\\javaprogram\\src\\testngconcepts\\config.properties");
	    prop = new Properties();
		prop.load(file);		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\chrome.driver\\112 version chrome\\chromedriver.exe" );
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}
	
	@Test
	public void validateLoginTest() throws InterruptedException {
		
		
		driver.findElement(By.name("username")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.name("password")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		
		boolean dashboradstatus=driver.findElement(By.xpath("//h6[text() ='Dashboard']")).isDisplayed();
		System.out.println(dashboradstatus);
		//Hard assert
		Assert.assertEquals(dashboradstatus,true);
		//2.Assert.assertEquals(dashboradstatus, "HomePage Dashborad");
		System.out.println("rest of the code");
	}
	@AfterMethod
	public void tearDown() {
		
		driver.close();
	}
}
	
