package javaprogramconcept1;

public class SwapNumberWithoutThirdVariable {

	public static void main(String[] args) {
		
		int a=1;
		int b=2;
		System.out.println("Before swaping  :a"+"  "+a+"and b= "+b);
		
        a=a+b;
        b=a-b;//after swaping number we will get is==>b=3-2=> 1
        a=a-b;//after swaping number we will get is==>a=3-1=>2
        
        System.out.println("After swapping  :a"+"  "+ a+"and b= "+b);
	}

}
