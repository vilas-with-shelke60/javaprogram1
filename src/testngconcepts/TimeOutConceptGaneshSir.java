package testngconcepts;

import org.testng.annotations.Test;

public class TimeOutConceptGaneshSir {
	
	@Test(timeOut = 10000)
	public void timeOutTest()
	{
		int i = 1;
		while(i<2) {
			System.out.println("TestNG");
			i++;//if we not increament it will continue execute
			    //if we give increament then it will give o/p fast.
		}
		
	}	
	
	
	
	
	
	
	

}
