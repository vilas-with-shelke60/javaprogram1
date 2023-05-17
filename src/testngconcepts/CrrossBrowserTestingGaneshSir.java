package testngconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;






public class CrrossBrowserTestingGaneshSir {
	
	WebDriver driver;
	
	@Parameters("browser")
	@BeforeMethod
	
	public void initialization(String browser) {
		if(browser.contains("chrome"))
		{
		System.setProperty("webdriver.chrome.driver","C:\\chrome.driver\\113 version chrome\\chromedriver.exe");
		driver=new ChromeDriver();
		}
		else if(browser.contains("firefox")) {
		System.setProperty("webdriver.firefox.driver","C:\\chrome.driver\\firefox\\geckodriver.exe");
		driver=new FirefoxDriver();
		}
		
	}
	@Test(priority=1)
	public void googleSearchTest() {
		
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("Parallel Execution");
		
	}
	
	@Test(priority=2)
	public void yahooSearchTest() {
		
		driver.get("https://in.search.yahoo.com/?guccounter=1&guce_referrer=aHR0cHM6Ly93d3cuZ29vZ2xlLmNvbS8&guce_referrer_sig=AQAAAB2l0XxBliiOu3yc-SkLQ8nBfQ0Kj8Qpe0opq8Lj_sWhDYEaKMIC63adF1n9MeoW9y5N6qZTgkeiTn2rFWy-d0uXK12m4pkP8qGddouj4ZASr7UaIqOM9UIAlVfKpgTBqc0KJQFipBtBSPw1kFVnulF9s3QHMQ0iwPEDoGr9q6E3");
		
		driver.findElement(By.name("p")).sendKeys("Parallel Execution");
		
	}
	
	
	@AfterMethod()
	public void tearDown() {
		
		
		driver.close();
		
	}
	
               //gekodriver version change
}
