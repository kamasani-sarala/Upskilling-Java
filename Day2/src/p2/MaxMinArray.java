package p2;
import java.util.Arrays;
public class MaxMinArray{
 public static void main(String[] args) {

    int[] array = new int[]{17, 28, 9, 4, 22, 7, 1, 3, 19, 42, 58, 47};

    System.out.println("Minimum value: " + Arrays.stream(array).boxed().min(Integer::compare).get());

    System.out.println("Maximum value: " + Arrays.stream(array).boxed().max(Integer::compare).get());

  }
 }