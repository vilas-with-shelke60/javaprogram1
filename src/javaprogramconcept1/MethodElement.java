package javaprogramconcept1;

public class MethodElement {
	
int empid=123;//instance variable
	
	String data ="THIS IS MY ID NUMBER";

	public static void main(String[] args) {
		
		// static method
		
				MethodElement me= new MethodElement();
				System.out.println(me.empid);//instance variable calling
				me.InformationId();//method also calling
				me.Information();
				
			}
			
			 public void InformationId() {//non static method/ instance variable//method dclaration
			
				//System.out.println("THIS IS MY ID NUMBER :"  + empid);//WHEN DATA NOT CHANGE EVERY TIME THEN WE FOLLOW
				System.out.println("data  :"  + empid);//suppose every time data will be change that why we write here variable only(MOSTLY WE USE THIS)
				
				
			

					
				}
				
			  void Information() {//multiple method we are created
				 
				 
				 System.out.println("This information succesfully added");
				 
			 }
		

	}


