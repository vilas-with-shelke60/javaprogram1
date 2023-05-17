package javaprogramconcept1;

public class FactorialNumber {

	public static void main(String[] args) {
		
      int num=5;
      int fact=1;
      for(int i=1;i<=num;i++) {
    	  
    	  fact=fact*i;//output==>120;
    	              //how its comes:1==>1*1=1
    	                             //2==>1*2=2
    	                             //3==>2*3=6
    	                             //4==>6*4=24
    	                             //5==>24*5=120
      }
		System.out.println("The factorial of the number"+"  "+num+"  "+"is  :"+fact);
		
	}

}
