package testngconcepts;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


      //if data provider present inside another class
public class dataProviderClass {

	@Test(dataProvider="LoginDataPovider",dataProviderClass=CustomDataProvider.class)//in actual test method we referred same name
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
	
	
}
