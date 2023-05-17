package testngconcepts;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExampleSameClass {
	  //here we used data provider with the same class//
	
	@Test(dataProvider="LoginDataPovider")//in actual test method we referred same name
	public void  loginTest(String email,String pwd) {//below test data used actual test method
		                      //bec one test case provide any kind of data provider method bt how 
	System.out.println(email+"  "+pwd);	                       //login test know which data providing to the thids method
		                       //so we have refrred this name
		                       //so what here return in below method usernmae and password
		                     //so this method repeat multiple time which is passed
	                          //data in data provider
		                      //advantage of data provider no need to use looping statement
	                        //base on input pass in data provider method login test method exected those many time
	}   
	@DataProvider(name="LoginDataPovider")//how we recognized using annotation using data provider always specify some name with this
	               //becz same name we referred data provider method another test method
	public Object[][] getdata()
	{
	Object[][] data ={{"abc@gmail.com","abc"},{"xyx@gmail.com","xyz"},{"mno@gmail.com","mno"}};
	                      //inside data we stored multiple data muliple username and password
	return data;//data provider return the value
	
	
	
	
	}
	   
}


