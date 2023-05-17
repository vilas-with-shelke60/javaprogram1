package javaprogramconcept1;

public class StringPalindrome {

	public static void main(String[] args) {
		
		String text="madam";
    //using string buffer method//
		 
	String rev = new StringBuffer(text).reverse().toString();
	if(rev.equalsIgnoreCase(text))
	{
		System.out.println("Validated with string buffer method  :"+"The given string is palindrome");
		
	}
	else
	{
		System.out.println("Validated with string buffer method  :"+"The given string is not palindrome");
	}
		
	}

}
