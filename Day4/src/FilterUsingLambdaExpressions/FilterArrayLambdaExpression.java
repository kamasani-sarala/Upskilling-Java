package FilterUsingLambdaExpressions;

import java.util.ArrayList;
import java.util.Scanner;

public class FilterArrayLambdaExpression {
	 public static void main(String args[]) {
	ArrayList<Student> studentList = new ArrayList<Student>();
    studentList.add(new Student("Seetha", 10));
    studentList.add(new Student("Sri", 25));
    studentList.add(new Student("Jay", 20));
    studentList.add(new Student("Janu", 35));
    studentList.removeIf(student -> (student.age <= 20)); // Lambda Expression
    System.out.println("The final list is: ");
    for(Student student : studentList) {
       System.out.println(student.name);
    }
 }
 private static class Student {
    private String name;
    private int age;
    public Student(String name, int age) {
       this.name = name;
       this.age = age;
    }
 }
}
