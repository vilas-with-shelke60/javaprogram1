package javaprogramconcept1;

public class NestedIf {

	public static void main(String[] args) {
		
		String s ="HYDERABAD";
		//int age =18;
		int age =21;
		
		if(s.equalsIgnoreCase("Kerala"));//Working
		{
			if(age<=14) {
				
				System.out.println("You are eligible for voting ");
				}
			
			    else
				{
				System.out.println("You are not eligible for voting");
				}
								
		}
		
		System.out.println("Program exited");
	

	}
		

	}


