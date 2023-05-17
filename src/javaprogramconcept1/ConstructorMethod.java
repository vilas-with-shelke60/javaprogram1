package javaprogramconcept1;

public class ConstructorMethod {
	 String empname;
     String empdegination;
     

	public static void main(String[] args) {
		
		ConstructorMethod cm = new ConstructorMethod("Ram","Product Manager");
		ConstructorMethod cm1 = new ConstructorMethod(12000,21000);

	}
public ConstructorMethod(String name,String desgination){
		
		System.out.println("This is my empname  :"+ name   );
		System.out.println("This is my empdesignation  :"+ desgination );
		
	}
	public ConstructorMethod(int a, int b) {
		
		int c;
		c =a + b ;
		System.out.println("This is my salary :  "+ c);
		
		
		
	}

}
