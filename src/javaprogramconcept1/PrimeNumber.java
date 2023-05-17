package javaprogramconcept1;

public class PrimeNumber {

	public static void main(String[] args) {
	int num=21;
	int i;
	int flag = 0;
	
  //prime number is one that is not divisible by the number starting from "2" to half of that number
	
	for(i=2;i<num/2;i++) {
		
		if(num%i==0) {
			System.out.println("The given number is not prime");
			flag=1;
			break;
			
		}
	}
	if(flag==0) {
		System.out.println("The given number is prime");
	}
	
	
	
	
	}
}

