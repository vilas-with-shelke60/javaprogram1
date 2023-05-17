package testngconcepts;

import org.testng.annotations.Test;

/*
 * setup-open browser and application
 * login
 * close
 */

public class FirstTestCase {
	@Test(priority=1)//we give priority according to your own way also.
	void setup() {
		System.out.println("opening browser");
	}
	@Test(priority=3)
	void login() {
		System.out.println("This is login test");
	}
	@Test(priority=2)
	void teardown() {
		
		System.out.println("closing the browser");
	}
	
	
	
	
	
	
	
	
	
	

}
