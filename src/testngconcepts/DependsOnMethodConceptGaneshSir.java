package testngconcepts;

import org.testng.annotations.Test;

public class DependsOnMethodConceptGaneshSir {
	
	@Test
	public void validateLoginTest()
	{
		System.out.println("Logged in successfully");
	}	
	
	
	@Test(dependsOnMethods ="validateLoginTest")
	public void validateCreateContactTest()
	{
		System.out.println("Contact has been created");
	}	
	
	
	@Test(dependsOnMethods ="validateLoginTest")
	public void validateCreateCompanyTest()
	{
		System.out.println("Company has been created");
	}	
	
	
	
	
	

}
