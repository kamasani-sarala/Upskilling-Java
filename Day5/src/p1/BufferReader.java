package p1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader in =new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);
        
		System.out.println("enter first number ");
		int num =Integer.parseInt(bf.readLine());
		System.out.println("enter second number");
		int num1=Integer.parseInt(bf.readLine());
		int sum =num+num1;
        System.out.println("sum of two numbers :"+sum);
        
        
        
        

	}

}
