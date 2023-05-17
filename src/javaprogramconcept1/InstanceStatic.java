package javaprogramconcept1;

public class InstanceStatic {
	
	int num1=20;
    int num2=30;
	int num3=40;
	
	static
	   {
		  System.out.println("THIS IS STATIC BLOCK");
	   }
	

	public static void main(String[] args) {
		
		InstanceStatic is= new InstanceStatic();
		System.out.println(is.num1);
		System.out.println(is.num2);
		System.out.println(is.num3);
		
	}

	{
		System.out.println("Print num1 value ");
		
	}
	{
		System.out.println("Print num2 value");
	}
	{
		System.out.println("Print num3 value");
	}
	
		

	}


