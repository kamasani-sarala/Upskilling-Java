package p1;

import java.util.Scanner;
import java.util.function.Predicate;

public class NumberComparator {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Numbers you want Check");
         int num1 = sc.nextInt();
         int num2 = sc.nextInt();

   Predicate<Integer> numberComparator = (number) -> number > num1;



       if (numberComparator.test(num2)) {
          System.out.println(num2 + " is greater than " + num1);
          } else {
        	  System.out.println(num2 + " is greater than " + num1);
          }
        }
        
}
