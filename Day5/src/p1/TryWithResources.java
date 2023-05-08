package p1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResources {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int num=0;
    try (BufferedReader br =new BufferedReader(new InputStreamReader(System.in)))
    {
    	     System.out.println("Enter the number ");
    	    	num=Integer.parseInt(br.readLine());
    	    	System.out.println(num);
    }
	}

}
