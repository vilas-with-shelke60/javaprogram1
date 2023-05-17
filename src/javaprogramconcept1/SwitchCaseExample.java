package javaprogramconcept1;

public class SwitchCaseExample {

	//we didnt declare variable here(instance variable) it gives error even using static keyword we dont declare here
	
	
		public static void main(String[] args) {
			
			
			/* NO       DAY
			 * 1       sunday
			 * 2       monday
			 * 3       tuesday
			 * 4       wedneday
			 * 5       thursday
			 * 6        friday
			 * 7        saturday
			                        */
			 int day=1;//only declare in main method
			 switch (day)
			{
		       
			case 1:System.out.println("sunday");
			      break;
			case 2:System.out.println("monday"); 
			       break;
			case 3:System.out.println("tuesday");
			        break;
			case 4:System.out.println("wednesday");
			        break;
			case 5:System.out.println("thursday");
			       break;
			case 6:System.out.println("friday");
			       break;
			default:System.out.println("saturday");
			      
			      
		}	      
		
	
		}
}

