package javaprogramconcept1;

public class ParameterizedMethod {
	
	int empid=123;//instance vaariable/(non static variable)
	String name="ABC";
	String address="pune";

	public static void main(String[] args) {
		
		ParameterizedMethod pm= new ParameterizedMethod();
		  // System.out.println(pm.empid+ pm.name+pm.address);//access the instance variable
		   System.out.println(pm.empid);//access instance variable
		   System.out.println(pm.name);
		   System.out.println(pm.address);
		    
			  pm.add(20, 90);//user access(user give the value)
	         pm.sub();
			pm.createcontact("RUSHALI","HYDERABAD", 1234567890);//(user give the value)

		}
		
		 public void add(int num1, int num2) {// method with parameters//
			
			int a=num1;
			int b=num2;
			int c=a+b;
			System.out.println(c);
			
		}
		
		  void sub()//method without any parameters 
		{
			
			int a=98;
			int b=89;
			
			int c = a-b;
			
		System.out.println(c);

		
		}
		
	    void createcontact(String name,String address,int mobilenumber) {
	    
	    	
	    	
			System.out.println ( name );
			System.out.println(address);
			System.out.println(mobilenumber);
			
	    	
	    }
		

	}


