package javaprogramconcept1;

import java.util.Scanner;

public class PalindomeNumberSirMethod {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number  :");
		int num=sc.nextInt();//accept and stored into variable
		int org_num = num;
		int rev=0;
		while(num!=0) {
			
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println(rev);
		if(org_num==rev) {
			System.out.println(org_num+"  palindrome number");
		}
		else
		{
			System.out.println(org_num+"  Not palindrome number");
		}
	}

}
