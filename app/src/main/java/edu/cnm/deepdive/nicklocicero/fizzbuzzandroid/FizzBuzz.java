package edu.cnm.deepdive.nicklocicero.fizzbuzzandroid;

public class FizzBuzz {

  public static final int MAX_COUNT = 100;

  public static void main(String[] args) {
    for (int i = 0; i < MAX_COUNT; i++) {
      System.out.println(count(i+1));
    }
  }

  public static String count(int i) {
    if (i % 15 == 0) {
      return "fizzbuzz";
    } else if (i % 3 == 0) {
      return "fizz";
    } else if (i % 5 == 0) {
      return "buzz";
    }
    return String.valueOf(i);
  }
}
