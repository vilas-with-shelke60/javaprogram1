package testngconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParallelTestConceptGaneshSir {
	
	WebDriver driver;
	@BeforeMethod
	public void initialization() {
		System.setProperty("webdriver.chrome.driver","C:\\chrome.driver\\113 version chrome\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	@Test
	public void googleSearchTest() throws InterruptedException  {
		//System.setProperty("webdriver.chrome.driver","C:\\chrome.driver\\113 version chrome\\chromedriver.exe");
		//driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");		
		driver.findElement(By.name("q")).sendKeys("Parallel Execution");
		Thread.sleep(5000);	
		
		
	}
	
	@Test
	public void yahooSearchTest() throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","C:\\chrome.driver\\113 version chrome\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://in.search.yahoo.com/?guccounter=1&guce_referrer=aHR0cHM6Ly93d3cuZ29vZ2xlLmNvbS8&guce_referrer_sig=AQAAAB2l0XxBliiOu3yc-SkLQ8nBfQ0Kj8Qpe0opq8Lj_sWhDYEaKMIC63adF1n9MeoW9y5N6qZTgkeiTn2rFWy-d0uXK12m4pkP8qGddouj4ZASr7UaIqOM9UIAlVfKpgTBqc0KJQFipBtBSPw1kFVnulF9s3QHMQ0iwPEDoGr9q6E3");
		driver.findElement(By.name("p")).sendKeys("Parallel Execution");
		Thread.sleep(5000);
		
	}
	
	
	@AfterMethod()
	public void tearDown() {
		
		
		driver.quit();
		
	}
	
         
}
