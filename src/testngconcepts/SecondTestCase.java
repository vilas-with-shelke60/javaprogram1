package testngconcepts;

import org.testng.annotations.Test;

public class SecondTestCase {
	
    @Test(priority=1)//we give priority according to your own way also.
	void setup() {
		System.out.println("opening browser");
	}
	@Test(priority=3)
	void searchCustomer() {
		System.out.println("This is search customer  test");
	}
	
	@Test(priority=2)
	void addCustomer() {
		System.out.println("This is add customer  test");
	}
	@Test(priority=4)
	void teardown() {
		
		System.out.println("closing the browser");
	}

}
