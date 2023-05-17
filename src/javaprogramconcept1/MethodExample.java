package javaprogramconcept1;

public class MethodExample {
	
/*int a=10;//instance variable(Non static variable)/(instance variable)
	
	int b=20;//instance variable(Non static variable)/(instance variable)
	int c=a+b ;//instance variable(Non static variable)/(instance variable)*/
	
	int num1=50;//non static variable
    String s="welcome";//string variable(string data)

	public static void main(String[] args) {
		
		MethodExample me=new MethodExample();
		// System.out.println(me.c);//using object creation we access the value
		
		//System.out.println(me.num1);//access the value to the non static vriable using object creation
	   //System.out.println(me.s);//access the value to the non static vriable using object creation
		
	    me.num1=30;//access the variable through non static and change the value
		me.s="RUSHALI";//access the variable through non static and change the string name
		System.out.println(me.num1);
		System.out.println(me.s);
		

		
		
		
		
	}

}
