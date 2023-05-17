package testngconcepts;

import org.testng.annotations.DataProvider;

public class CustomDataProvider {

	
	@DataProvider(name="LoginDataPovider")//how we recognized using annotation using data provider always specify some name with this
    //becz same name we referred data provider method another test method
public Object[][] getdata()
{
Object[][] data ={{"abc@gmail.com","abc"},{"xyx@gmail.com","xyz"},{"mno@gmail.com","mno"}};
           //inside data we stored multiple data muliple username and password
return data;//data provider return the value




}
	
	
}
