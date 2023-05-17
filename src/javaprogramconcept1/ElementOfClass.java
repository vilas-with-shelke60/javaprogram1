package javaprogramconcept1;

public class ElementOfClass {
	
	int num1;//(Non static variable)/(instance variable)
	int num2;//(Non static variable)/(instance variable)
    int c;
    String s ="Welcome";


	public static void main(String[] args) {

		 ElementOfClass ec= new ElementOfClass();//Object create
			
			/* System.out.println(ec.num1=10);//through object creation access the instance/non static variable in main method
			 
			 System.out.println(ec.num1=90);//through object creation access the instance/non static variable in main method */
		     
			 // 1  substraction


			/*ec.num1=60;
			ec.num2=90;
		    ec.c =ec.num2-ec.num1;
			System.out.println(ec.c);*/
			 
			 
			 // 2 substraction
			 
			
			/*ec.num1=10;
			ec.num2=20;
		    int c=ec.num1+ec.num2;
		    System.out.println(ec.c= ec.num2- ec.num1);*/
			 
			int num1=70;//declare//perform acition
			int num2=90;
			int c=num1+num2;
			System.out.println(c);//directly show not access becz we perform action in main  method 
			System.out.println(ec.s);
			ec. add();
			 
		}
		
		public void add() //non-static area/instance area//method declaration//method without parameter
		{
			
			 num1 = 70;//instance area to instance area we directly access in method also
			 num2 = 80;
			 c= num1 + num2;
			 String orgname="SPEEDTECH";
			System.out.println(c);
			System.out.println(orgname);
			
			
			
		}

		

}

