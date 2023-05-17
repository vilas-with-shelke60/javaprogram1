package testngconcepts;

               
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGPriorityGangeshSirMethod {
	
	WebDriver driver;
	@BeforeMethod
	public void initilization() {
		
	System.setProperty("webdriver.chrome.driver","C:\\chrome.driver\\112 version chrome\\chromedriver.exe");	
		driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
	}
	@Test(priority=1)
	public void validationGoogleSearchTest() {
		
		driver.findElement(By.name("q")).sendKeys("TestNG");
	}
	
	@Test(priority=2)
	public void validateGmailSearchTest() {
		
	boolean status=driver.findElement(By.linkText("Gmail")).isDisplayed();
	System.out.println(status);
	}
	@Test(priority=3,enabled= false)
	public void validateGoogleLogoTest() {
		
		driver.findElement(By.xpath("//img[@alt='Google']")).isDisplayed();
	}
	
	@Test(priority=4)
	public void validateImageLinkTest() {
		
	   boolean imageLinkStatus=driver.findElement(By.linkText("Images")).isDisplayed();
	   System.out.println(imageLinkStatus);
	}
	@AfterMethod
	public void tearDown() {
		
		driver.close();
	}
}
