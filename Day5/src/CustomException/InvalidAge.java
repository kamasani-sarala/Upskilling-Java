package CustomException;

public class InvalidAge extends Exception {
	public InvalidAge (String str)  
    {  
        // calling the constructor of parent Exception  
        super(str);  
    }  
}
