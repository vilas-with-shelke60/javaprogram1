package testngconcepts;

import org.testng.annotations.Test;

public class GroupConceptGaneshSir {
	//sanity testing
	//Regression testing
	
	@Test(groups = "Regression Test")
	public void logoTest()
	{
		System.out.println("Log is displayed");
	}	
	
	@Test(groups = "Regression Test")
	public void titleTest()
	{
		System.out.println("Title is validated");
	}
	
	@Test(groups = {"Regression Test","Sanity Test"})
	public void validateLoginTest()
	{
		System.out.println("Logged in successfully");
	}	
	
	
	@Test(groups = "Regression Test")
	public void validateCreateContactTest()
	{
		System.out.println("Contact has been created");
	}	
	
	
	@Test(groups = {"Regression Test","Sanity Test","Smoke Test"})
	public void validateCreateCompanyTest()
	{
		System.out.println("Company has been created");
	}
	
	
	
	
	
	
	
	
	
	
	

}
