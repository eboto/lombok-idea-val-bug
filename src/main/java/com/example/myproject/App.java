package com.example.myproject;

import com.google.common.primitives.Ints;
import lombok.var;

import java.util.Optional;

/**
 * This application compares two numbers, using the Ints.compare
 * method from Guava.
 */
public class App {

  public static int compare(int a, int b) {
    return Ints.compare(a, b);
  }

  public static void main(String... args) throws Exception {
    var strOpt = Optional.of("1");
    var intOpt = strOpt.map(str -> str.length());
    var byteOpt2 = intOpt.map(myInt -> myInt.doubleValue());

    App app = new App();
    System.out.println("Success: " + app.compare(2, 1));
  }

}
