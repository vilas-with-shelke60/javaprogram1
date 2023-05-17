package javaprogramconcept1;

public class PriorityOfParameter {
	
	int empnum=123;//declare instance variable
	
	public static void main(String[] args) {
		
		PriorityOfParameter pop=new PriorityOfParameter();//object creation
	    //pop.printid();// access object creation instance variable
		pop.printid(345);//according to how we access 1st then give output 
		pop.printid("SpeedwayTech");
		pop.add(12,21);
		pop.deosite();
	}
	
	public void printid() {//not give any parameterized value
	
		System.out.println(empnum);
		
	}
	
	
	public void printid(int empnum) {// give parameterized value
		
      System.out.println(empnum);
     System.out.println(this.empnum);//Apply this keyword only for parameterized/(and parameterized and variable name is same)AND(using this keyword we access directly  instance variable without calling)
			
	}
	
	void printid(String name) {
		System.out.println("THIS IS MY NAME  :"+ name);
		
	}
	
	public int add(int a, int b) {//method other than void
		
		int c;
		c = a + b ;
		System.out.println(c);//print is mandatory here then value to be printed
		return c;
		
	}
	public String deosite() {//method other than void
		
		System.out.println("deposite transaction completed succesfully");
		return "success";
		
		
	}	
		
	}


