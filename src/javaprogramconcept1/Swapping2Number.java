package javaprogramconcept1;

public class Swapping2Number {

	public static void main(String[] args) {
		
		int a=10, b=20;
		System.out.println("Before swapping value are.."+a+"   "+b);
		
		//logic 1:Using third variable(temporary variable used)
		
		int temp=a;
		a=b;
		b=temp;
		
		
		//logic2:Use + and - without using third variable
		
		/*a=a+b;//10+20=30
		b=a-b;//current value a=30==>30-20=10
		a=a-b;//30-10=20*/
		
		//logic3:use multiplication and slash(/)without using third variable
		//here a and b value should not be zero
		
		/*a=a*b;//10*20=200
		b=a/b;//200/20=10
		a=a/b;//200/10=20*/
		
		
		//logic4:bitwse XOR (^)
		
		//logic5:Single statement
		//a=10,b=20
		//here execution start right to left
		b=a+b-(a=b);//10+20-(b assigned to a)(20)
		            //30-20=10
		            //b value assigned to a still a=20
		
		
		
		
		
		System.out.println("After swapping value are.."+a+"   "+b);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
