package javaprogramconcept1;

public class pallindromeNumber {

	public static void main(String[] args) {
		//pallindrome Number:if reverse no is also same no. then it is called as pallindrome number
     //num=252=>it convert into reverse and it get same number 252 then it is called pallindrome number
		
		int rem,sum=0,temp;
		int num=252;//it is the number variable to be  checked for pallindrome
		
		temp=num;
		while(num>0) {
			rem=num%10;//getting reminder
			sum=(sum*10)+rem;
			num=num/10;
			
		}
		if(temp==sum)
		{
			System.out.println("pallindrome number");
		}	
		else
		{
			System.out.println("Not pallindrome number");
		}
		
		
		
		
		
		
		
		
	}

}
