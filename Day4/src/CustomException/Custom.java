package CustomException;

public class Custom {
	public static void main(String[] args) {
		 
	    {  
	        try  
	        {  
	             
	            throw new SException("Error 505");  
	        }  
	        catch (SException obj)  
	        {  
	            System.out.println("Caught the exception" + obj.getMessage());  
	             
	        }  
	  
	        System.out.println("rest of the code...");    
	    }  
	}  
}
