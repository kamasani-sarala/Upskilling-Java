package p1;

public class FinallyBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      try {
    	  System.out.println("inside the try block");
    	  int i=20/0;
    	  System.out.println(i);
      }
    	  catch(NullPointerException e){  
    	        System.out.println(e);  
    	      } 
      finally {
    	  System.out.println("finally block should execute");
      }
      System.out.println("Rest of the code ");
    	  
      }
	}


