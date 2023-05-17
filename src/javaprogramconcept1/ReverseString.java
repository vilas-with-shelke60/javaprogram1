package javaprogramconcept1;

public class ReverseString {

	public static void main(String[] args) {

//1.Using + (String Concatenation operator)
		
		String str = "ABCD";
		String rev = "";
		
		int len = str.length();//give 4 character
		
		for(int i=len-1;i>=0;i--) {//i=4-1=3;3>=0(true);go to the loop
			                       //i will be decremental by 1==>now i will be 2 now 
			                       // then go to the loop
			              //i will be decremental by 1==>now i will be 1 now
			//i will be decremental by 1==>now i will be 0 now
			//i will be decremental by 1==>now i will be -1 now THEN EXTRACT FROM LOOP
			
	     
			rev=rev+str.charAt(i);//D,C,B,A
			
		}
		
		System.out.println("Reversed string is :"+rev);
		
		

	}

}
