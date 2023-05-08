package FilterUsingLambdaExpressions;

import java.util.ArrayList;
import java.util.List;

public class SortArrayListLE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  List<String> fruits=new ArrayList<String>();
  fruits.add("Orange");
  fruits.add("Banana");
  fruits.add("Wate Melon");
  fruits.add("Apple");
  fruits.add("Mango");
     
  //print before sorting
  System.out.println("fruits before sorting");
  System.out.println(fruits);
  
  
  //let sort this array using lambda Expression
  fruits.sort((f1,f2)->f1.compareToIgnoreCase(f2));{
	  	//print list after sorting
	  System.out.println("fruits After sorting");
	  System.out.println(fruits);
  }
	}

}
