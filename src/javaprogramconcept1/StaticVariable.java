package javaprogramconcept1;

public class StaticVariable {
	
	/*int num1;//instance variable
	int num2;//instance variable*/
	
	int num1=10;//instance variable
	static int num2=20;//static variable		
	
	/*static String s ="Hello";//static declaration
	static String e ="Welcome";*/

	public static void main(String[] args) {
		
StaticVariable sc= new StaticVariable();
		
		System.out.println(sc.num1);
		System.out.println(sc.num2);
		
		sc.num1=100;
		sc.num2=200;
		System.out.println(sc.num1);
		System.out.println(sc.num2);
		
		
		StaticVariable sc1= new StaticVariable();
		System.out.println(sc1.num1);//create copy for instance variable/in every object of instance variable copy are created
		System.out.println(sc1.num2);//not create any copy for static variable(same variable used every object)/values are overriding
		
		
	/*	System.out.println(sc.num1=20);
		System.out.println(sc.num2=28);
		System.out.println(sc.s);
		System.out.println(sc1.num1=100);
		System.out.println(sc1.num2=200);
		System.out.println(sc1.e);  */
		
		
		
		
		
		

	}

}
