package CustomException;



public class MyException extends Exception {
   public static  void validate(int age)throws InvalidAge {
   if(age<18) {
	 throw new InvalidAge("age is not valid to vote");    
}  
   else {   
    System.out.println("welcome to vote");   
    }   
   }
   public static void main(String args[])  
    {  
        try  
        {  
            // calling the method   
             validate(13);
        }  
        catch (InvalidAge ex)  
        {  
            System.out.println("Caught the exception");  
    
            // printing the message from InvalidAgeException object  
            System.out.println("Exception occured: " + ex);  
        }  
  
        System.out.println("rest of the code...");    
    }

	
}  

