package javaprogramconcept1;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);//input from user
		
		System.out.println("Enter a number  :");
		
		int num=sc.nextInt();//1234
		
		//1.using algorthium
		
		/*int rev=0;
		while(num!=0) {//1234
			rev=rev*10 + num%10;//1.0*10+4=4 /2.40+3=43/3.430+2=432/4.4320+1=4321
			num= num/10;//for eliminating last digit we used num/10=1234/10=>123
			                 //2. 123/10=12  /3.12/10=1 /4.1/10=0
		}
		System.out.println("Reverse number is  :"+rev);*/
		
		
		//2.Using String buffer class method:
		
		/*StringBuffer sb = new StringBuffer(String.valueOf(num));//convert num into string formate
		                                               //that string value stored in sb
		
	     StringBuffer rev=sb.reverse();
		System.out.println("Reverse number is  :"+rev);*/
		
		
		//3.Using stringBuilder Class
		
		
		StringBuilder sb1= new StringBuilder();
		
		sb1.append(num);
		StringBuilder rev=sb1.reverse();
		System.out.println("Reverse number is  :"+rev);
	  
	}
	
	

}
