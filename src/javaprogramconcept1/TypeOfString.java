package javaprogramconcept1;

public class TypeOfString {

	public static void main(String[] args) {
		
		  //String browser ="chrome";
		  //String browser ="edge";
			String browser ="";
			
	      if(browser.contains("chrome")) {
	    	  
	    	  System.out.println("we are using chrome browser for testing"); 
	    	  
	      }else if(browser.equals("firefox")) {
	    	  
	    	   System.out.println("we are using firefox browser for testing");
	    	   
	      }else if(browser.equalsIgnoreCase("Edge")) {
	    	  
	    	  System.out.println("we are using Edge browser for testing");
	      }
	      else {
	    	  System.out.println("please select valid browser");
	      }
	      
	      
	    	  
	    	  
		
		
		
	}

}
