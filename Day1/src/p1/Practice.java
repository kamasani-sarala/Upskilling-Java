package p1;

import java.util.Scanner;

public class Practice {
	public static void main(String[] args)

	{

	
	Scanner in= new Scanner(System.in);
	System.out.println("enter the string");
     String string=in.nextLine();

	//Convert entire string to lower case

	char ch[]=string.toLowerCase().toCharArray();

	//second letter of every word is capitalised

	for(int i=0;i<ch.length;i++)

	{

	ch[0]=Character.toUpperCase(ch[0]);

	if (Character.isWhitespace(ch[i]) && Character.isLetter(ch[i+1]))

	ch[i+2]=Character.toUpperCase(ch[i+2]);

	}

	String str= new String(ch);

	System.out.println(str);

	}
}
